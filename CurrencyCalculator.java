import java.util.Scanner;

class CurrencyConverter {

    void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("\n1. INR to USD");
                System.out.println("2. USD to INR");
                System.out.println("3. INR to EUR");
                System.out.println("4. Exit");

                System.out.print("Enter choice: ");
                int choice = sc.nextInt();

                if (choice == 4) {
                    System.out.println("Exiting...");
                    break;
                }

                System.out.print("Enter amount: ");
                double amount = sc.nextDouble();

                switch (choice) {
                    case 1:
                        System.out.println("USD: " + (amount * 0.012));
                        break;
                    case 2:
                        System.out.println("INR: " + (amount * 83));
                        break;
                    case 3:
                        System.out.println("EUR: " + (amount * 0.011));
                        break;
                    default:
                        System.out.println("Invalid choice");
                }

            } catch (Exception e) {
                System.out.println("Wrong input");
                sc.next();
            }
        }

        sc.close();
    }

    public static void main(String[] args) {
        CurrencyConverter c = new CurrencyConverter();
        c.start();
    }
}