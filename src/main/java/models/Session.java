package models;

import helpers.IdGenerator;
public class Session {

    private String id;
    private AcademicYear academicYear;
    private String sessionType;

    public Session() {
    }

    public Session(AcademicYear academicYear, String sessionType) {
        id = IdGenerator.generateId();
        this.academicYear = academicYear;
        this.sessionType = sessionType;
    }

    public String getId() {
        return id;
    }

    public AcademicYear getAcademicYear() {
        return this.academicYear;
    }

    public String getSessionType() {
        return this.sessionType;
    }

    public void setSessionType(String sessionType) {
        this.sessionType = sessionType;
    }

    public void setAcademicyear(AcademicYear academicYear) {
        this.academicYear = academicYear;
    }
    
    @Override
    public String toString(){
        return this.sessionType;
    }
}
