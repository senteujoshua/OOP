import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Define arrays to store student information
        int[] sNo = new int[numStudents];
        String[] studentNames = new String[numStudents];
        double[][] subjectScores = new double[numStudents][5]; // Assuming 5 subjects

        // Input student information
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter details for Student " + (i + 1));

            System.out.print("Student Number (sNo): ");
            sNo[i] = scanner.nextInt();

            System.out.print("Student Name: ");
            scanner.nextLine(); // Consume newline
            studentNames[i] = scanner.nextLine();

            System.out.print("Enter scores for Sub1, Sub2, Sub3, Sub4, Sub5 (separated by spaces): ");
            for (int j = 0; j < 5; j++) {
                subjectScores[i][j] = scanner.nextDouble();
            }
        }

        // Calculate total and average for each student
        double[] studentTotals = new double[numStudents];
        double[] studentAverages = new double[numStudents];

        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 5; j++) {
                studentTotals[i] += subjectScores[i][j];
            }
            studentAverages[i] = studentTotals[i] / 5.0;
        }

        // Calculate average for each subject unit
        double[] unitAverages = new double[5];

        for (int j = 0; j < 5; j++) {
            double unitTotal = 0;
            for (int i = 0; i < numStudents; i++) {
                unitTotal += subjectScores[i][j];
            }
            unitAverages[j] = unitTotal / numStudents;
        }

        // Display the results
        System.out.println("Student Details:");
        System.out.println("sNo\tName\tSub1\tSub2\tSub3\tSub4\tSub5\tTotal\tAverage");

        for (int i = 0; i < numStudents; i++) {
            System.out.print(sNo[i] + "\t" + studentNames[i] + "\t");
            for (int j = 0; j < 5; j++) {
                System.out.print(subjectScores[i][j] + "\t");
            }
            System.out.println(studentTotals[i] + "\t" + studentAverages[i]);
        }

        System.out.println("Average for Each Subject Unit:");
        System.out.println("Sub1\tSub2\tSub3\tSub4\tSub5");

        for (int j = 0; j < 5; j++) {
            System.out.print(unitAverages[j] + "\t");
        }

        scanner.close();
    }
}

