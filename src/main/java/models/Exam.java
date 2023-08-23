
package models;

import helpers.IdGenerator;
import java.util.ArrayList;
import java.util.List;
import services.ExerciseService;

public class Exam {

    private String id;
    private String date;
    private String modality;
    private int coefficient;
    private List<Exercise> exercises;

    public Exam() {
        this.exercises = new ArrayList<>();
    }

    public Exam(String date, String modality, int coefficient) {
        id = IdGenerator.generateId();
        this.date = date;
        this.modality = modality;
        this.coefficient = coefficient;
        this.exercises = new ArrayList<>();
    }

    public String getId() {
        return this.id;
    }

    public String getDate() {
        return this.date;
    }

    public String getModality() {
        return this.modality;
    }

    public int getCoefficient() {
        return this.coefficient;
    }

    public void addExercise(Exercise exercise) {
        this.exercises.add(exercise);
        ExerciseService.addExercise(exercise);
    }

    public List<Exercise> getExercises() {
        return this.exercises;
    }
}
