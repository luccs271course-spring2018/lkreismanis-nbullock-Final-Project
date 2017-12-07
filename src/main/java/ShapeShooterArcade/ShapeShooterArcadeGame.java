//package ShapeShooterArcade;
/* 
 * File Name: ShapeShooterArcadeMain.java
 * Authors: Larisa Kreismanis, Nathan Bullock
 * Description: Main class that runs the game.
 * Date Created: 11/17/17
 * COMPLETED
*/

import javax.swing.*;
import java.awt.*;

public class ShapeShooterArcadeGame{
    //System.out.println("test");
    public static void main(String[] args){
        JFrame arcade = new JFrame();
        arcade.setTitle("ShapeShooterArcadeGame");
        arcade.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new UserPanel(600, 450);
        
        Container pane = arcade.getContentPane();
        pane.setLayout(new GridLayout(1, 1));
        pane.add(panel);
        
        arcade.pack();
        arcade.setVisible(true);
        panel.requestFocus();
    }
} //end class