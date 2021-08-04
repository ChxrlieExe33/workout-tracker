package workout_tracker;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String workoutName = JOptionPane.showInputDialog(null, "Workout name: ","Name", JOptionPane.PLAIN_MESSAGE);

        String workoutDifficulty = JOptionPane.showInputDialog(null, "Workout difficulty: ","Difficulty", JOptionPane.PLAIN_MESSAGE);

        String strDuration = JOptionPane.showInputDialog(null, "Workout duration(min): ","Duration", JOptionPane.PLAIN_MESSAGE);
        int workoutDuration = Integer.parseInt(strDuration);

        String workoutMuscleGroup = JOptionPane.showInputDialog(null, "Workout muscle group: ","Muscle group", JOptionPane.PLAIN_MESSAGE);

        Workout workout = new Workout(workoutName, workoutDifficulty, workoutDuration, workoutMuscleGroup);

        String workoutString = "Name: "+ workout.getName() + ", Difficulty: " + workout.getDifficulty() + ", Duration: " + workout.getDuration() + " minutes , Muscle group: " + workout.getMuscleGroup();

        Window window = new Window();

        JLabel workoutText = new JLabel();
        workoutText.setHorizontalAlignment(JLabel.CENTER);
        workoutText.setVerticalAlignment(JLabel.CENTER);
        workoutText.setText(workoutString);
        window.add(workoutText);

    }

}
