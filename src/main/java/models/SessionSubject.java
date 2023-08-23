package models;

import java.util.ArrayList;
import java.util.List;
import services.ExamService;

public class SessionSubject {

    private Session session;
    private Subject subject;
    private List<Exam> exams;
    
    public SessionSubject(){
        exams=new ArrayList<>();
    }
    
    public SessionSubject(Session session, Subject subject) {
        this.session=session;
        this.subject=subject;
        exams=new ArrayList<>();
    }
    
    public Session getSession(){
        return this.session;
    }
    
    public Subject getSubject(){
        return this.subject;
    }
    
    public void addExam(Exam e){
        this.exams.add(e);
        ExamService.addExam(e);
    }
    
    public List<Exam> getExams(){
        return this.exams;
    }
}
