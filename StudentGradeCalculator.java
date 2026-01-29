import java.util.Scanner;

class StudentGradeCalculator {

    private int total = 0;
    private double average;

    void calculate(int subjects) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= subjects; i++) {
            try {
                System.out.print("Enter marks of subject " + i + ": ");
                int marks = sc.nextInt();

                if (marks < 0 || marks > 100) {
                    System.out.println("Marks should be between 0 and 100");
                    i--;
                } else {
                    total += marks;
                }

            } catch (Exception e) {
                System.out.println("Invalid input");
                sc.next();
                i--;
            }
        }

        average = (double) total / subjects;
    }

    char grade() {
        if (average >= 90) return 'A';
        else if (average >= 75) return 'B';
        else if (average >= 60) return 'C';
        else if (average >= 40) return 'D';
        else return 'F';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentGradeCalculator obj = new StudentGradeCalculator();

        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        obj.calculate(subjects);

        System.out.println("Total Marks: " + obj.total);
        System.out.println("Average Percentage: " + obj.average);
        System.out.println("Grade: " + obj.grade());

        sc.close();
    }
}