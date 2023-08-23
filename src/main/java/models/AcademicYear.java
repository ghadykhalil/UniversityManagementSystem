package models;

import helpers.IdGenerator;

public class AcademicYear implements Comparable<AcademicYear>{

    private String id;
    private int year;

    public AcademicYear() {
    }

    public AcademicYear(int year) {
        id = IdGenerator.generateId();
        this.year = year;
    }

    public String getId() {
        return this.id;
    }

    public int getYear() {
        return this.year;
    }

    @Override
    public String toString() {
        return String.valueOf(year);
    }

    @Override
    public int compareTo(AcademicYear other) {
        return Integer.compare(this.year, other.year);
    }

}
