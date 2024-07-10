import java.util.Scanner;

public class StudentManagementApp {

    public static void main(String[] args) {
        StudentManagementSystem on = new StudentManagementSystem();
        Scanner in = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    addStudentUI(in, on);
                    break;
                case 2:
                    removeStudentUI(in, on);
                    break;
                case 3:
                    searchStudentUI(in, on);
                    break;
                case 4:
                    on.displayAllStudents();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 5);

        in.close();
    }

    private static void addStudentUI(Scanner in, StudentManagementSystem on) {
        System.out.print("Enter name: ");
        String name = getValidStringInput(in);
        System.out.print("Enter roll number: ");
        int rollNumber = getValidIntInput(in);
        System.out.print("Enter grade: ");
        String grade = getValidStringInput(in);
        System.out.print("Enter email: ");
        String email = getValidStringInput(in);
        on.addStudent(new Student(name, rollNumber, grade, email));
    }

    private static void removeStudentUI(Scanner scanner, StudentManagementSystem sms) {
        System.out.print("Enter roll number to remove: ");
        int rollNumber = getValidIntInput(scanner);
        sms.removeStudent(rollNumber);
    }

    private static void searchStudentUI(Scanner scanner, StudentManagementSystem sms) {
        System.out.print("Enter roll number to search: ");
        int rollNumber = getValidIntInput(scanner);
        Student student = sms.searchStudent(rollNumber);
        if (student != null) {
            System.out.println(student);
        } else {
            System.out.println("Student not found");
        }
    }

    private static String getValidStringInput(Scanner scanner) {
        String input;
        do {
            input = scanner.nextLine();
            if (input.trim().isEmpty()) {
                System.out.print("Input cannot be empty. Please enter again: ");
            }
        } while (input.trim().isEmpty());
        return input;
    }

    private static int getValidIntInput(Scanner scanner) {
        int input = -1;
        while (input < 0) {
            try {
                input = Integer.parseInt(scanner.nextLine());
                if (input < 0) {
                    System.out.print("Input must be a positive number. Please enter again: ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a valid number: ");
            }
        }
        return input;
    }
}
