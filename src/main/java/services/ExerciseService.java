package services;

import helpers.JsonUtils;
import models.Exercise;

import java.io.IOException;
import java.util.List;

public class ExerciseService {

    private static final String EXERCISE_FILE = "src/main/java/data/exercises.json";

    public static List<Exercise> getAllExercises() {
        try {
            return JsonUtils.readData(EXERCISE_FILE, Exercise.class);
        } catch (IOException e) {
            System.out.println("Error reading exercise data: " + e.getMessage());
            return null;
        }
    }

    public static void addExercise(Exercise exercise) {
        try {
            JsonUtils.saveData(EXERCISE_FILE, exercise);
        } catch (IOException e) {
            System.out.println("Error adding exercise: " + e.getMessage());
        }
    }

    public static void updateExercise(Exercise updatedExercise) {
        try {
            List<Exercise> exercises = getAllExercises();
            if (exercises != null) {
                int index = -1;
                for (int i = 0; i < exercises.size(); i++) {
                    if (exercises.get(i).getId().equals(updatedExercise.getId())) {
                        index = i;
                        break;
                    }
                }
                if (index != -1) {
                    exercises.set(index, updatedExercise);
                    JsonUtils.writeData(EXERCISE_FILE, exercises);
                } else {
                    System.out.println("Exercise not found.");
                }
            }
        } catch (IOException e) {
            System.out.println("Error updating exercise: " + e.getMessage());
        }
    }

    public static Exercise getExerciseById(String exerciseId) {
        List<Exercise> exercises = getAllExercises();
        if (exercises != null) {
            for (Exercise exercise : exercises) {
                if (exercise.getId().equals(exerciseId)) {
                    return exercise;
                }
            }
        }
        return null;
    }

}
