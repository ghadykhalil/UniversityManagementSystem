package services;

import helpers.JsonUtils;
import models.Question;

import java.io.IOException;
import java.util.List;
import models.Answer;

public class QuestionService {

    private static final String QUESTION_FILE = "src/main/java/data/questions.json";

    public static List<Question> getAllQuestions() {
        try {
            return JsonUtils.readData(QUESTION_FILE, Question.class);
        } catch (IOException e) {
            System.out.println("Error reading question data: " + e.getMessage());
            return null;
        }
    }

    public static Question getQuestionById(String questionId) {
        List<Question> questions = getAllQuestions();
        if (questions != null) {
            for (Question question : questions) {
                if (question.getId().equals(questionId)) {
                    return question;
                }
            }
        }
        return null; // Question not found
    }

    public static void addAnswerToQuestion(Question question, Answer answer) {
        List<Question> questions = getAllQuestions();
        if (questions != null) {
            for (Question q : questions) {
                if (q.getId().equals(question.getId())) {
                    q.getAnswers().add(answer);
                    break;
                }
            }
            try {
                JsonUtils.writeData(QUESTION_FILE, questions);
            } catch (IOException e) {
                System.out.println("Error updating question: " + e.getMessage());
            }
        }
    }

    public static void updateAnswerFromQuestion(Question question, Answer updatedAnswer) {
        try {
            List<Question> questions = getAllQuestions();
            if (questions != null) {
                for (Question q : questions) {
                    if (q.getId().equals(question.getId())) {
                        List<Answer> answers = q.getAnswers();
                        for (int i = 0; i < answers.size(); i++) {
                            if (answers.get(i).getId().equals(updatedAnswer.getId())) {
                                answers.set(i, updatedAnswer);
                                JsonUtils.writeData(QUESTION_FILE, questions);
                                return;
                            }
                        }
                        System.out.println("Answer not found for question: " + question.getId());
                        return;
                    }
                }
                System.out.println("Question not found: " + question.getId());
            }
        } catch (IOException e) {
            System.out.println("Error updating answer from question: " + e.getMessage());
        }
    }

    public static void addQuestion(Question question) {
        try {
            JsonUtils.saveData(QUESTION_FILE, question);
        } catch (IOException e) {
            System.out.println("Error adding question: " + e.getMessage());
        }
    }

    public static void updateQuestion(Question updatedQuestion) {
        try {
            List<Question> questions = getAllQuestions();
            if (questions != null) {
                int index = -1;
                for (int i = 0; i < questions.size(); i++) {
                    if (questions.get(i).getId().equals(updatedQuestion.getId())) {
                        index = i;
                        break;
                    }
                }
                if (index != -1) {
                    questions.set(index, updatedQuestion);
                    JsonUtils.writeData(QUESTION_FILE, questions);
                } else {
                    System.out.println("Exercise not found.");
                }
            }
        } catch (IOException e) {
            System.out.println("Error updating exercise: " + e.getMessage());
        }
    }

    public static Answer findValidAnswer(List<Answer> answers, Question question) {
        Question currentQuestion = getQuestionById(question.getId());
        List<Answer> currentAnswers = currentQuestion.getAnswers();

        for (Answer answer : answers) {
            for (Answer currentAnswer : currentAnswers) {
                if (answer.getId().equals(currentAnswer.getId())) {
                    return currentAnswer;
                }
            }
        }

        return null; // Answer not found
    }   

    
    
}
