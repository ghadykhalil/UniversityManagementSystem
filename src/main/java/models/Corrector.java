
package models;

import helpers.IdGenerator;

public class Corrector {

    private String id;
    private String username;

    public Corrector(){}
    
    public Corrector(String name) {
        id = IdGenerator.generateId();
        this.username = name;
    }
    
    public String getId(){
        return  this.id;
    }


    public String getUsername() {
        return this.username;
    }


    public void setUsername(String name) {
        this.username = name;
    }

    @Override
    public String toString(){
        return this.username;
    }
}
