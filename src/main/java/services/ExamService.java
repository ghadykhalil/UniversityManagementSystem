package services;

import helpers.JsonUtils;
import models.Exam;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import models.Answer;
import models.Corrector;
import models.Exercise;
import models.Question;
import models.Student;

public class ExamService {

    private static final String EXAM_FILE = "src/main/java/data/exams.json";

    public static List<Exam> getAllExams() {
        try {
            return JsonUtils.readData(EXAM_FILE, Exam.class);
        } catch (IOException e) {
            System.out.println("Error reading exam data: " + e.getMessage());
            return null;
        }
    }

    public static void addExam(Exam exam) {
        try {
            JsonUtils.saveData(EXAM_FILE, exam);
        } catch (IOException e) {
            System.out.println("Error adding exam: " + e.getMessage());
        }
    }

    public static void updateExam(Exam updatedExam) {
        try {
            List<Exam> exams = JsonUtils.readData(EXAM_FILE, Exam.class);

            for (int i = 0; i < exams.size(); i++) {
                Exam exam = exams.get(i);
                if (exam.getId().equals(updatedExam.getId())) {
                    exams.set(i, updatedExam);
                    break;
                }
            }

            JsonUtils.writeData(EXAM_FILE, exams);
        } catch (IOException e) {
            System.out.println("Error updating exam: " + e.getMessage());
        }
    }

    public static Exam getExamById(String id) {
        try {
            List<Exam> exams = JsonUtils.readData(EXAM_FILE, Exam.class);
            for (Exam exam : exams) {
                if (exam.getId().equals(id)) {
                    return exam;
                }
            }
            return null; // Exam not found
        } catch (IOException e) {
            System.out.println("Error reading exam data: " + e.getMessage());
            return null;
        }
    }

    public static boolean hasStudentCompletedExam(Exam exam, Student student) {
        Exam currentExam = ExamService.getExamById(exam.getId());
        List<Exercise> exercisesByExam = currentExam.getExercises();

        for (Exercise objExercise : exercisesByExam) {
            Exercise currentExercise = ExerciseService.getExerciseById(objExercise.getId());
            List<Question> questionByExercise = currentExercise.getQuestions();
            for (Question objQuestion : questionByExercise) {
                Question currentQuestion = QuestionService.getQuestionById(objQuestion.getId());
                List<Answer> allAnswers = currentQuestion.getAnswers();
                for (Answer answer : allAnswers) {
                    if (answer.getStudent().getId().equals(student.getId())) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public static boolean hasStudentCompletedExamWaitingCorrection(Exam exam, Student student, Corrector corrector) {
        Exam currentExam = ExamService.getExamById(exam.getId());
        List<Exercise> exercisesByExam = currentExam.getExercises();

        for (Exercise objExercise : exercisesByExam) {
            Exercise currentExercise = ExerciseService.getExerciseById(objExercise.getId());
            List<Question> questionByExercise = currentExercise.getQuestions();
            for (Question objQuestion : questionByExercise) {
                Question currentQuestion = QuestionService.getQuestionById(objQuestion.getId());
                List<Answer> allAnswers = currentQuestion.getAnswers();
                for (Answer answer : allAnswers) {
                    Answer currentAnswer = AnswerService.getAnswerById(answer.getId());
                    if (currentAnswer.getStudent().getId().equals(student.getId()) && currentAnswer.getFinalMark() == -1) {
                        if (answer.getCorrector1() == null) {
                            return true;
                        } else if (!answer.getCorrector1().getId().equals(corrector.getId()) || answer.getCorrector2() != null && !answer.getCorrector2().getId().equals(corrector.getId())) {
                            return true;
                        }
                    }
                }
            }
        }

        return false;
    }

    public static List<Answer> getStudentAnswersList(Exam exam, Student student, Corrector corrector) {
        List<Answer> answersList = new ArrayList<>();
        Exam currentExam = ExamService.getExamById(exam.getId());
        List<Exercise> exercisesByExam = currentExam.getExercises();

        for (Exercise objExercise : exercisesByExam) {
            Exercise currentExercise = ExerciseService.getExerciseById(objExercise.getId());
            List<Question> questionByExercise = currentExercise.getQuestions();
            for (Question objQuestion : questionByExercise) {
                Question currentQuestion = QuestionService.getQuestionById(objQuestion.getId());
                List<Answer> allAnswers = currentQuestion.getAnswers();
                for (Answer answer : allAnswers) {
                    if (answer.getStudent().getId().equals(student.getId()) && answer.getFinalMark() == -1) {
                        if (answer.getCorrector1() == null) {
                            answersList.add(answer);
                        } else if (!answer.getCorrector1().getId().equals(corrector.getId())) {
                            answersList.add(answer);
                        }

                    }
                }
            }
        }
        return answersList.isEmpty() ? null : answersList;
    }

    public static boolean hasStudentPassedExam(Exam exam, Student student) {
        double examScore = 0;
        double studentScore = -1; // Initialize student score to -1

        Exam currentExam = ExamService.getExamById(exam.getId());
        List<Exercise> exercisesByExam = currentExam.getExercises();

        outerLoop:
        for (Exercise objExercise : exercisesByExam) {

            Exercise currentExercise = ExerciseService.getExerciseById(objExercise.getId());
            List<Question> questionByExercise = currentExercise.getQuestions();
            for (Question objQuestion : questionByExercise) {
                Question currentQuestion = QuestionService.getQuestionById(objQuestion.getId());
                examScore += currentQuestion.getScaleScore();

                List<Answer> allAnswers = currentQuestion.getAnswers();
                for (Answer answer : allAnswers) {
                    if (answer.getStudent().getId().equals(student.getId())) {
                        if (answer.getFinalMark() >= 0) {
                            if (studentScore == -1) {
                                studentScore = 0;
                            }

                            studentScore += answer.getFinalMark();
                        }
                    }
                }
            }
        }
        setExamScore(examScore);
        setStudentScore(studentScore);
        return studentScore > (examScore / 2);
    }

    private static double studentScore = -1;
    private static double examScore = -1;

    public static void setStudentScore(double s) {
        studentScore = s;
    }

    public static void setExamScore(double s) {
        examScore = s;
    }

    public static double getStudentScore() {
        return studentScore;
    }

    public static double getExamScore() {
        return examScore;
    }

    public static void main(String[] args) {
        Exam exam = ExamService.getExamById("93c63656-9cf4-4c1a-a8ea-9598fa6cecaa");
        Student student = StudentService.getStudentById("ee49b37a-4c5d-41d8-ba43-a47b11ed77d5");
        System.out.println(hasStudentPassedExam(exam, student));
        System.out.println(getStudentScore());
        System.out.println(getExamScore());
        System.out.println(exam.getCoefficient());
    }
}
