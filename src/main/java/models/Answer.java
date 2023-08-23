package models;

import helpers.IdGenerator;

public class Answer {

    private String id;
    private Student student;
    private String answerText;
    private Corrector corrector1;
    private Corrector corrector2;
    private double corrector1Mark;
    private double corrector2Mark;
    private double finalMark;

    public Answer() {
    }

    public Answer(Student student, String answerText) {
        id = IdGenerator.generateId();
        this.student = student;
        this.answerText = answerText;
        this.corrector1Mark=-1;
        this.corrector2Mark=-1;
    }

    public String getId() {
        return this.id;
    }

    public Student getStudent() {
        return this.student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setCorrector1(Corrector corrector) {
        if(this.corrector1!=null)
        this.corrector2 = corrector;
        else this.corrector1=corrector;
    }

    public void setCorrector2(Corrector corrector) {
        this.corrector2 = corrector;
    }

    public void setCorrector1Mark(Corrector corrector,double correctorMark) {
        if(this.corrector1Mark!=-1)
        this.corrector2Mark = correctorMark;
        else this.corrector1Mark=correctorMark;
    }
    
    public void setCorrector2Mark(double corrector2Mark){
        this.corrector2Mark=corrector2Mark;
    }

    public double getFinalMark() {
        if(this.corrector1Mark!=-1&&this.corrector2Mark!=-1){
        this.finalMark = (corrector1Mark + corrector2Mark) / 2;
        return this.finalMark;
        }
        else return -1;
    }
    
    public Corrector getCorrector1(){
        return this.corrector1;
    }
    
    public Corrector getCorrector2(){
        return this.corrector2;
    }

    public double getCorrector1Mark() {
        return this.corrector1Mark;
    }

    public double getCorrector2Mark() {
        return this.corrector2Mark;
    }

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }
    
    @Override
    public String toString(){
        return answerText;
    }
    
}
