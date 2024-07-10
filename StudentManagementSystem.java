import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentManagementSystem {
    private List<Student> students;
    private final String fileName = "students.dat";

    public StudentManagementSystem() {
        students = readFromFile();
        if (students == null) {
            students = new ArrayList<>();
        }
    }

    public void addStudent(Student student) {
        students.add(student);
        writeToFile();
    }

    public void removeStudent(int rollNumber) {
        students.removeIf(student -> student.getRollNumber() == rollNumber);
        writeToFile();
    }

    public Student searchStudent(int rollNumber) {
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                return student;
            }
        }
        return null;
    }

    public void displayAllStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    private void writeToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(students);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private List<Student> readFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (List<Student>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return null;
        }
    }
}
