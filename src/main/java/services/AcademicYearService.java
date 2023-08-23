package services;

import helpers.JsonUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import models.AcademicYear;

public class AcademicYearService {

    private static final String ACADEMIC_YEAR_FILE = "src/main/java/data/academic_years.json";

    public static List<AcademicYear> getAcademicYears() {
        try {
            List<AcademicYear> academicYears = JsonUtils.readData(ACADEMIC_YEAR_FILE, AcademicYear.class);
            return academicYears != null ? academicYears : new ArrayList<>();
        } catch (IOException e) {
            System.out.println("Error reading academic years data: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    public static AcademicYear getAcademicYearByYear(int year) {
        try {
            List<AcademicYear> academicYears = JsonUtils.readData(ACADEMIC_YEAR_FILE, AcademicYear.class);
            for (AcademicYear academicYear : academicYears) {
                if (academicYear.getYear() == year) {
                    return academicYear;
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading academic years data: " + e.getMessage());
        }
        return null;
    }

    public static void addAcademicYear(AcademicYear academicYear) {
        try {
            if (alreadyExists(academicYear.getYear())) {
                throw new IllegalArgumentException();
            }
            List<AcademicYear> academicYears = getAcademicYears();
            academicYears.add(academicYear);
            JsonUtils.writeData(ACADEMIC_YEAR_FILE, academicYears);
        } catch (IOException e) {
            System.out.println("Error adding academic year: " + e.getMessage());
        }
    }

    public static boolean alreadyExists(int year) {
        try {
            List<AcademicYear> years = JsonUtils.readData(ACADEMIC_YEAR_FILE, AcademicYear.class);
            for (AcademicYear objYear : years) {
                if (objYear.getYear() == year) {
                    return true; // Username exists
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading student data: " + e.getMessage());
        }
        return false; // Username does not exist
    }

}
