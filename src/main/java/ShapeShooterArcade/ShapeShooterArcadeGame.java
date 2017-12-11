/*
 * SHAPE SHOOTER ARCADE GAME
 * by Larisa Kreismanis & Nathan Bullock
 * File: ShapeShooterArcadeGame.java
 * Description: The main class for the entire game.
 * COMPLETED
 */

import javax.swing.*;
import java.awt.*;

public class ShapeShooterArcadeGame{

    public static void main(String[] args){

        JFrame arcade = new JFrame();
        arcade.setTitle("Shape Shooter Arcade Game");
        arcade.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new UserPanel(600, 450);

        Container pane = arcade.getContentPane();
        pane.setLayout(new GridLayout(1, 1));
        pane.add(panel);

        arcade.pack();
        arcade.setVisible(true);
        panel.requestFocus();
    }
}  //end class