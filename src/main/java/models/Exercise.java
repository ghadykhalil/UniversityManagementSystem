
package models;

import helpers.IdGenerator;
import java.util.ArrayList;
import java.util.List;
import services.QuestionService;

public class Exercise {

    private String id;
    private String content;
    private List<Question> questions;
    
    public Exercise(){
        this.questions=new ArrayList<>();
    }
    
    public Exercise(String content) {
        id = IdGenerator.generateId();
        this.content=content;
        this.questions = new ArrayList<>();
    }

    public String getId() {
        return this.id;
    }
    
    public String getContent(){
        return this.content;
    }

    public void addQuestion(Question question) {
        this.questions.add(question);
        QuestionService.addQuestion(question);
    }
    
    public List<Question> getQuestions(){
        return this.questions;
    }

}
