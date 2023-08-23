package services;

import helpers.JsonUtils;
import models.Student;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StudentService {

    private static final String STUDENT_FILE = "src/main/java/data/students.json";

    public static List<Student> getStudentsList() {
        try {
            return JsonUtils.readData(STUDENT_FILE, Student.class);
        } catch (IOException e) {
            System.out.println("Error reading student data: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    public static void addStudentToList(Student student) {
        try {
            if (isUsernameExists(student.getUsername())) {
                throw new IllegalArgumentException("Username already exists.");
            }

            List<Student> students = getStudentsList();
            students.add(student);
            JsonUtils.writeData(STUDENT_FILE, students);
        } catch (IOException e) {
            System.out.println("Error adding student: " + e.getMessage());
        }
    }

    public static boolean isUsernameExists(String username) {
        try {
            List<Student> students = JsonUtils.readData(STUDENT_FILE, Student.class);
            for (Student student : students) {
                if (student.getUsername().equals(username)) {
                    return true; // Username exists
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading student data: " + e.getMessage());
        }
        return false; // Username does not exist
    }

    public static void updateStudentData(Student updatedStudent, Predicate<Student> predicate) {
        try {
            List<Student> students = getStudentsList();
            for (int i = 0; i < students.size(); i++) {
                Student student = students.get(i);
                if (predicate.test(student)) {
                    students.set(i, updatedStudent);
                    break;
                }
            }
            JsonUtils.writeData(STUDENT_FILE, students);
        } catch (IOException e) {
            System.out.println("Error updating student data: " + e.getMessage());
        }
    }
    
    public static Student getStudentById(String studentId) {
        List<Student> students = getStudentsList();
        for (Student student : students) {
            if (student.getId().equals(studentId)) {
                return student;
            }
        }
        return null; // Student with the given ID not found
    }

}
