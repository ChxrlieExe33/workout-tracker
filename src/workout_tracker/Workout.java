package workout_tracker;

public class Workout {

    private String name;
    private String difficulty;
    private int duration;
    private String muscleGroup;

    /**
     * Constructor for a workout object
     * @param name name of the workout
     * @param difficulty difficulty of the workout
     * @param duration duration in minutes
     * @param muscleGroup Muscle group affected
     */
    public Workout(String name, String difficulty, int duration, String muscleGroup){

        this.name = name;
        this.difficulty = difficulty;
        this.duration = duration;
        this.muscleGroup = muscleGroup;

    }

    public String getName() {
        return name;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public int getDuration() {
        return duration;
    }

    public String getMuscleGroup() {
        return muscleGroup;
    }

}
