package services;

import helpers.JsonUtils;
import models.Specialty;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import models.Subject;

public class SpecialtyService {

    private static final String SPECIALTY_FILE = "src/main/java/data/specialties.json";

    public static List<Specialty> getAllSpecialties() {
        try {
            return JsonUtils.readData(SPECIALTY_FILE, Specialty.class);
        } catch (IOException e) {
            System.out.println("Error reading specialty data: " + e.getMessage());
            return null;
        }
    }

    public static Specialty getSpecialtyByName(String name) {
        List<Specialty> specialities = getAllSpecialties();

        if (specialities != null) {
            for (Specialty specialty : specialities) {
                if (specialty.getName().equals(name)) {
                    return specialty;
                }
            }
        }

        return null;
    }

    public static void addSpecialty(Specialty specialty) {
        try {
            JsonUtils.saveData(SPECIALTY_FILE, specialty);
        } catch (IOException e) {
            System.out.println("Error adding specialty: " + e.getMessage());
        }
    }

    public static void updateSpeciality(Specialty updatedSpecialty, Predicate<Specialty> predicate) {
        try {

            JsonUtils.updateData(SPECIALTY_FILE, updatedSpecialty, predicate);
        } catch (IOException e) {
            System.out.println("Error updating specialty: " + e.getMessage());
        }
    }

    public static List<Subject> getSubjectsBySpeciality(String speciality) {
        List<Specialty> specialities = getAllSpecialties();
        List<Subject> subjectsBySpeciality = new ArrayList<>();

        if (specialities != null) {
            for (Specialty obj : specialities) {
                if (obj.getName().equals(speciality)) {
                    subjectsBySpeciality.addAll(obj.getSubjects());
                }
            }
        }

        return subjectsBySpeciality;
    }
}
