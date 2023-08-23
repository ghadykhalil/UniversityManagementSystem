package models;

import helpers.IdGenerator;
import java.util.ArrayList;
import java.util.List;

public class Question {

    private String id;
    private int number;
    private String content;
    private double scaleScore;
    private List<Answer> answers;

    public Question() {
        answers = new ArrayList<>();
    }

    public Question(int number, String content, double scaleScore) {
        this.id = IdGenerator.generateId();
        this.number = number;
        this.content = content;
        this.scaleScore = scaleScore;
        answers = new ArrayList<Answer>();
    }

    public String getId() {
        return this.id;
    }

    public int getNumber() {
        return this.number;
    }

    public String getContent() {
        return this.content;
    }

    public double getScaleScore() {
        return this.scaleScore;
    }

    public void addAnswer(Answer answer) {
        this.answers.add(answer);
    }

    public List<Answer> getAnswers() {
        return this.answers;
    }

    public void setAnswer(Answer answer) {
        for (int i = 0; i < this.answers.size(); i++) {
            Answer objAnswer = this.answers.get(i);
            if (objAnswer.getId().equals(answer.getId())) {
                this.answers.set(i, answer);
                break;
            }
        }
    }
}
