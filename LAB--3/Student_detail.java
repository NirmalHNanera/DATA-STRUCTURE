import java.util.Scanner;

public class StudentDetail {
    public static class Student {
        private int enrollmentNo;
        private String name;
        private int sem;
        private double cpi;

        public Student(int enrollmentNo, String name, int sem, double cpi) {
            this.enrollmentNo = enrollmentNo;
            this.name = name;
            this.sem = sem;
            this.cpi = cpi;
        }

        public void displayDetails() {
            System.out.println("Enrollment No: " + enrollmentNo);
            System.out.println("Name: " + name);
            System.out.println("Semester: " + sem);
            System.out.println("CPI: " + cpi);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Student[] students = new Student[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Enrollment No: ");
            int enrollmentNo = sc.nextInt();
            sc.nextLine(); // Consume the newline character after nextInt()
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Semester: ");
            int sem = sc.nextInt();
            System.out.print("CPI: ");
            double cpi = sc.nextDouble();
            students[i] = new Student(enrollmentNo, name, sem, cpi);
        }

        System.out.println("Details of all students:");
        for (Student student : students) {
            student.displayDetails();
        }

        sc.close();
    }
}