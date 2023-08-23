package models;

import helpers.IdGenerator;

public class Student {

    private String id;
    private String name;

    public Student(){}
    
    public Student(String name) {
        this.id=IdGenerator.generateId();
        this.name = name;
    }
    
      public String getId() {
        return this.id;
    }
    
    public String getUsername(){
        return this.name;
    }
    
    public void setUsername(String name){
        this.name=name;
    }
    
    @Override
    public String toString(){
        return this.name;
    }
}
