/*
 * SHAPE SHOOTER ARCADE GAME
 * by Larisa Kreismanis & Nathan Bullock
 * File: Arcade.java
 * Description: Represents a display panel.
 * COMPLETED
 */

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class GameStats extends JPanel {
    private JTextField gameNameText;
    private int yourScore;
    private JLabel yourScoreText;

    public GameStats(ArcadeFriendly t) {
        super(new GridLayout(2, 4, 10, 0));
        setBorder(new EmptyBorder(0, 0, 5, 0));
        Font gameNameFont = new Font("Monospaced", Font.BOLD, 24);

        JLabel gName = new JLabel(" " + t.getGameName());
        gName.setForeground(Color.red);
        gName.setFont(gameNameFont);
        add(gName);
        add(new JLabel(" "));
        yourScoreText = new JLabel(" Your Final Score: " + 0);
        add(yourScoreText);
        Font displayFont = new Font("Monospaced", Font.BOLD, 16);
    }

    // Updates this display, based on the result and "point" in the previous roll
    public void update(int points) {
        yourScoreText.setText(" Your Final Score: " + points);
        // 	yourScoreText.setForeground(Color.BLUE);
    }
} //end class
