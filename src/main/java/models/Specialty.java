package models;

import helpers.IdGenerator;
import java.util.ArrayList;
import java.util.List;
import services.SubjectService;

public class Specialty {

    private String id;
    private String name;
    private List<Subject> subjects;
    
    public Specialty() {
        this.subjects = new ArrayList<>();
    }

    public Specialty(String name) {
        this.id = IdGenerator.generateId();
        this.name = name;
        this.subjects = new ArrayList<>();
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void addSubject(Subject subject) {
        this.subjects.add(subject);
        SubjectService.addSubject(subject);
    }

    public List<Subject> getSubjects() {
        return new ArrayList<>(this.subjects);
    }

}
