package models;

import helpers.IdGenerator;

public class Subject {

    private String id;
    private String name;

    public Subject(){}
    
    public Subject(String name) {
        this.id = IdGenerator.generateId();
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
    
    @Override
    public String toString(){
        return this.name;
    }
}
