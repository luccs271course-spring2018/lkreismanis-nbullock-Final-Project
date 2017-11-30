/*
 * SHAPE SHOOTER ARCADE GAME
 * by Larisa Kreismanis & Nathan Bullock
 * File: ControlPanel.java
 * Description: Represents a control panel for a craps "table"
 * Author: Larisa Kreismanis & Nathan Bullock
 * Date-written: 11/30/17
 * COMPLETED
 */
 
 import java.awt.event.ActionListener;
 import java.awt.event.ActionEvent;
 import javax.swing.JPanel;
 import javax.swing.JButton;
 import java.awt.Component;
 import java.awt.Container;
 import javax.swing.Box;
 import javax.swing.*;
 
 public class ControlPanel extends JPanel implements ActionListener{
     private ArcadeFreindly game;
     private GameStats gStats;
     private JButton, pauseButton, stopButton, instructionsButton, creditsButton;
     
     public ControlPanel(ArcadeFriendly t, GameStats g){
         game = t;
         gStats = g;
         intructionsButton = new JButton("Instructions");
         instructionsButton.addActionListener(this);
         add(instructionsButton);
         add(Box.createHorizontalStrut(80));
         startButton = new JButton("Start");
         startButton.addActionListener(this);
         add(startButton);
         pauseButton = new JButton("Pause");
         pauseButton.addActionListener(this);
         add(pauseButton);
         stopButton = new JButton("Stop");
         stopButton.addActionListener(this);
         add(stopButton);
         add(Box.createHorizontalStrut(80));
         creditsButton = new JButton("Credits");
         creditsButton.addActionListener(this);
         add(creditsButton);
     }
     
     //Called when roll button is clicked
     public void actionPerformed(ActionEvent e){
         JButton button = (JButton)e.getSource();
         if(button == startButton){
             if(!game.running()){
                 game.startGame();
                 ((JPanel)(game)).requestFocus();
             }
         }
         else if(button == pauseButton){
             game.pauseGame();
             startButton.setText("Resume");
             startButton.setEnabled(true);
             repaint();
         }
         else if(button == stopButton){
             game.stopGame();
             gStats.update(game.getPoints());
             gStats.repaint();
             stopButton.setEnabled(true);
             startButton.setText("Restart");
             repaint();
             
         }
         else if(button == creditsButton){
             String credits = game.getCredits();
             JOptionPane.showMessageDialog(this, credits, "Game Credits", JOptionPane.PLAIN_MESSAGE);
         }
         else if(button == instructionsButton){
             String instructions = game.getInstructions();
             JOptionPane.showMessageDialog(this, instructions, "Game Rules", JOptionPane.PLAIN_MESSAGE);
         }
         ((JPanel)(game)).requestFocus();
     }
     
 } //end class