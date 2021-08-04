package workout_tracker;

import javax.swing.*;
import java.awt.*;

/**
 * Base class for all windows of this app, build off it
 */
public class Window extends JFrame {

    /**
     * This method will create a new base window
     * @throws HeadlessException If display isn't supported then throws error
     */
    public Window() throws HeadlessException {

        this.setTitle("Workout tracker");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(1280, 720);

        this.getContentPane().setBackground(new Color(255, 255, 255));
        this.setVisible(true);

        ImageIcon logo = new ImageIcon("logo.gif");
        this.setIconImage(logo.getImage());

    }
}
