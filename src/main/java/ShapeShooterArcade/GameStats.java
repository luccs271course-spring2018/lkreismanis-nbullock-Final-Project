/*
 * SHAPE SHOOTER ARCADE GAME
 * by Larisa Kreismanis & Nathan Bullock
 * File: Arcade.java
 * Description: Represents a display panel for a Craps table.
 * Author: Larisa Kreismanis & Nathan Bullock
 * Date-written: 11/30/17
 * COMPLETED
 */
 
 import java.awt.*;
 import javax.swing.*;
 import javax.swing.border.EmptyBorder;
 
 public class GameStats extends JPanel{
     private JTextField gameNameText, currentHighScorer, currentHighScore;
     private int yourScore;
     private JLabel yourScoreText;
     
     public GameStats(ArcadeFriendly t){
      super(new GridLayout(2,4,10,0));
      setBorder(new EmptyBorder(0,0,5,0));
      Font gameNameFont = new Font("Monospaced", Font.BOLD, 24);
      
      JLabel gName = new JLabel(" " + t.getGameName());
      gName.setForeground(Color.red);
      gName.setFont(gameNameFont);
      add(gName);
      add(new JLabel(" Current High Score: " + t.getHighScore()));
      add(new JLabel(" "));
      yourScoreText = new JLabel(" Your Final Score: " + 0);
      add(yourScoreText);
      Font displayFont = new Font("Monospaced", Font.BOLD, 16);
     }
     public void update(int points){
      yourScoreText.setText(" Your Final Score: " + points);
      if(points > 300){
       yourScoreText.setForeground(Color.BLUE);
       String s = (String)JOptionPane.showInputDialog(this, "Youre the new highscorer!", "Hgih Score", JOptionPane.PLAIN_MESSAGE, null, null, "name");
       System.out.println(you are the new high scorer");
      }
      else{
       System.out.println("You didnt beat the highscore");
      }
      
     }
 }  //end class
