//package ShapeShooterArcade;
/* 
 * File Name: Arcade.java
 * Authors: Larisa Kreismanis, Nathan Bullock
 * Description: Panel used to display arcade game to the user
 * Date Created: 11/27/17
 * COMPLETED
*/

import java.awt.Container;
import java.awt.BoarderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.EmptyBoarder;

public class Arcade extends JFrame{
    public Arcade(){
        super("Shape Shooter Arcade"){
            JPanel panel = new JPanel();
            panel.setLayout(new BoarderLayout());
            panel.setBorder(new EmptyBoarder(0, 5, 0, 5))
        }
    }
    public static void main(String[] args){
        Arcade window = new Arcade();
        window.setBounds(100, 100, 600, 600);
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        window.setVisable(True);
    }
}
