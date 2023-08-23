package services;

import helpers.JsonUtils;
import models.Answer;

import java.io.IOException;
import java.util.List;
import java.util.function.Predicate;

public class AnswerService {

    private static final String ANSWER_FILE = "src/main/java/data/answers.json";

    public static List<Answer> getAllAnswers() {
        try {
            return JsonUtils.readData(ANSWER_FILE, Answer.class);
        } catch (IOException e) {
            System.out.println("Error reading answer data: " + e.getMessage());
            return null;
        }
    }

    public static Answer getAnswerById(String answerId) {
        List<Answer> allAnswers = getAllAnswers();
        if (allAnswers != null) {
            for (Answer answer : allAnswers) {
                if (answer.getId().equals(answerId)) {
                    return answer;
                }
            }
        }
        return null;
    }

    public static void addAnswer(Answer answer) {
        try {
            JsonUtils.saveData(ANSWER_FILE, answer);
        } catch (IOException e) {
            System.out.println("Error adding answer: " + e.getMessage());
        }
    }

    public static void updateAnswer(Answer updatedAnswer) {
        List<Answer> allAnswers = getAllAnswers();
        for (int i = 0; i < allAnswers.size(); i++) {
            Answer answer = allAnswers.get(i);
            if (answer.getId().equals(updatedAnswer.getId())) {
                allAnswers.set(i, updatedAnswer);
                try {
                    JsonUtils.writeData(ANSWER_FILE, allAnswers);
                    return;
                } catch (IOException e) {
                    System.out.println("Error updating answer: " + e.getMessage());
                }
            }
        }
        System.out.println("Answer not found: " + updatedAnswer.getId());
    }

}
