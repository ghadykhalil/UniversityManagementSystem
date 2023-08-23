package services;

import helpers.JsonUtils;
import models.Subject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import models.Specialty;

public class SubjectService {

    private static final String SUBJECT_FILE = "src/main/java/data/subjects.json";

    public static List<Subject> getAllSubjects() {
        try {
            return JsonUtils.readData(SUBJECT_FILE, Subject.class);
        } catch (IOException e) {
            System.out.println("Error reading subject data: " + e.getMessage());
            return null;
        }
    }
    
    

    public static void addSubject(Subject subject) {
        try {
            JsonUtils.saveData(SUBJECT_FILE, subject);
        } catch (IOException e) {
            System.out.println("Error adding subject: " + e.getMessage());
        }
    }

    public static void updateSubject(Subject updatedSubject, Predicate<Subject> predicate) {
        try {
            JsonUtils.updateData(SUBJECT_FILE, updatedSubject, predicate);
        } catch (IOException e) {
            System.out.println("Error updating subject: " + e.getMessage());
        }
    }

}
