package ShapeShooterArcade;
/* 
 * File Name: UserPanel.java
 * Authors: Larisa Kreismanis, Nathan Bullock
 * Description: User panel of Shape Shooter Arcade game.
 * Date Created: 11/17/17
 * INCOMPLETE
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class UserPanel extends JPanel implements KeyListener, ActionListener, MouseListener, ArcadeFriendly  {
    private ArrayList<Shooter> shooters = new ArrayList<Shooter>(5);
    private ArrayList<Outline> outline = new ArrayList<Outline>(13);
    private ArrayList<Integer> highScore = new ArrayList <Integer>();
    
    private javax.swing.Timer timer;
    privaye Shooter myMovingShooter;
    private int shapesFilled = 0;
    private int timeCounter = 0;
    int addSec = 0;
    int currentHighScore;
    int currentScore;
    
    
    public UserPanel(int width, int height){
        Color backColor = Color.WHITE;
        
        addMouseListener(this);
        
        //BACKGROUND OUTLINE of pattern
        outline.add(new TriangleOutline()); //Triangle Outline   
        outline.add(new SquareOutline()); //Square Outline
        
        //SHOOTERS
        int triangleShooterHeight, triangleShooterWidth;
        int squareShooterHeight, int squareShooterWidth;
        
        triangleShooterHeight = height;
        triangleShooterWidth = width;
        squareShooterHeight = height;
        squareShooterWidth = width;
        
        //TIMER
        timer = new javax.swing.Timer(50, this);
        
        
    }
    
    //INTERFACE METHODS
    public boolean running(){
        if(start){
            return true;
        }
        else{
            return false;
        }
    }
    
    
    
    //return null;
} //end class
