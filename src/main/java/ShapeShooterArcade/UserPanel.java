/*
 * SHAPE SHOOTER ARCADE GAME
 * by Larisa Kreismanis & Nathan Bullock
 * File: UserPanel.java
 * Description: The user panel for the entire arcade game.
 * COMPLETED
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class UserPanel extends JPanel implements KeyListener, ActionListener, MouseListener, ArcadeFriendly {

    private ArrayList<Shooter> shooters = new ArrayList<Shooter>(5);
    private ArrayList<Outline> outline = new ArrayList<Outline>(13);

    private javax.swing.Timer timer;
    private Shooter myMovingShooter;
    private int shapesFilled = 0;
    private int timeCounter = 0;
    int addSec = 0;
    int currentScore;

    private boolean start = false;

    public UserPanel (int width, int height) {

        Color backColor=Color.WHITE;

        addMouseListener(this);

        //Draws outline of pattern
        outline.add(new TriangleOutline(171, 175, 1));  //UP Triangle Outline
        outline.add(new TriangleOutline(250, 195, 1));  //UP Triangle Outline
        outline.add(new TriangleOutline(329, 175, 1));  //UP Triangle Outline
        outline.add(new TriangleOutline(171, 135, 2));  //DOWN Triangle Outline
        outline.add(new TriangleOutline(250, 115, 2));  //DOWN Triangle Outline
        outline.add(new TriangleOutline(329, 135, 2));  //DOWN Triangle Outline
        outline.add(new TriangleOutline(290, 115, 3));  //RIGHT Triangle
        outline.add(new TriangleOutline(290, 195, 3));  //RIGHT Triangle
        outline.add(new TriangleOutline(150, 155, 3));  //RIGHT Triangle
        outline.add(new TriangleOutline(210, 115, 4));  //LEFT Triangle
        outline.add(new TriangleOutline(210, 195, 4));  //LEFT Triangle
        outline.add(new TriangleOutline(350, 155, 4));  //LEFT Triangle
        outline.add(new SquareOutline(260, 175, 5));  //Square


        int triangleShooterHeight, triangleShooterWidth;
        int squareShooterHeight, squareShooterWidth;

        //Draws shooters
        triangleShooterHeight = height / 10;
        triangleShooterWidth = width / 10;
        squareShooterHeight = height / 10;
        squareShooterWidth = width / 10;
        shooters.add(new TriangleShooter(50, height*4/5, triangleShooterHeight, triangleShooterWidth, (Color.RED), 1));  //UP Triangle
        shooters.add(new TriangleShooter(150, height*4/5, triangleShooterHeight, triangleShooterWidth, (Color.BLUE), 2));  //DOWN Triangle
        shooters.add(new TriangleShooter(250, height*4/5, triangleShooterHeight, triangleShooterWidth, (Color.GREEN), 3));  //RIGHT Triangle
        shooters.add(new TriangleShooter(350, height*4/5, triangleShooterHeight, triangleShooterWidth, (Color.ORANGE), 4));  //LEFT Triangle
        shooters.add(new SquareShooter(450, height*4/5, squareShooterHeight, squareShooterWidth, (Color.MAGENTA), 5));  //Square

        //Status check every 50 milliseconds
        timer = new javax.swing.Timer(50, this);

        addKeyListener(this);//used for key controls
        addMouseMotionListener(new PanelMotionListener()); //used to listen to mouse events

        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        setBackground(backColor);
        setPreferredSize(new Dimension(width, height));
    }

    //INTERFACE METHODS
    public boolean running() {
        if(start)
            return true;
        else
            return false;
    }
    public void startGame() {
        start = true;
        timer.start();
    }
    public String getGameName() {
        return "SHAPE SHOOTER ARCADE GAME";
    }
    public void pauseGame() {
        timer.stop();
        start = false;
    }
    public String getInstructions() {
        return "Objective:" +
                '\n'+"Fill in the outlined shapes!" +
                '\n'+"Instructions:" +
                '\n'+"1.) Click a colored shooter once." +
                '\n'+"2.) Hold and drag the shooter to aim." +
                '\n'+"3.) Press the spacebar to shoot." +
                '\n'+"4.) Match the shape bullet to the outline." +
                '\n'+"Press Enter to Start";
    }
    public String getCredits() {
        return "Developed by Larisa Kreismanis & Nathan Bullock";
    }

    public void endGame() {
        shapesFilled = 13;
    }
    public void stopGame() {
        timer.stop();
        shapesFilled = 0;
        start = false;
    }
    public int getPoints() {
        return addSec;
    }

    public void actionPerformed (ActionEvent e) {//invoked when timer expires every 50ms
        checkStats();
        repaint(); //ensures PaintComponent is called
    }

    public void mouseClicked(MouseEvent e) {
        //loops through shooter array list
        for(int i = 0; i < shooters.size(); i++) {
            int xVal = shooters.get(i).getX();
            int width = shooters.get(i).getWidth();
            int height = shooters.get(i).getHeight();
            int yVal =  shooters.get(i).getY();
            System.out.print(xVal + " " + yVal + " " + width + " "+ height);
            System.out.println();
            if(e.getX()>=xVal && e.getX()<=(xVal + width)&& e.getY()>=yVal && e.getY()<=yVal+height ) {
                myMovingShooter = shooters.get(i);
                break;
            }
        }
    }

    public void mouseExited(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void keyTyped(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}
    public void keyPressed(KeyEvent e){
        switch(e.getKeyCode())
        {
            case KeyEvent.VK_ENTER://actions performed if enter key is pressed
                timer.start();
                start = true;
                break;
            case KeyEvent.VK_SPACE://actions performed if space key is pressed
                //SHOOT ACTION
                myMovingShooter.shoot();
                break;
            case KeyEvent.VK_ESCAPE://actions performed if escape key is pressed
                System.exit(0);
                break;
            default:
        }
    }

    //PAINT ELEMENTS
    public void paintComponent(Graphics g){

        super.paintComponent(g);
        //DrawnOutline outline = new DrawnOutline(10, 10);

        //Draws shoters
        for(int i = 0; i < shooters.size(); i++) {
            shooters.get(i).draw(g);
        }

        int fontSize = 15;
        g.setColor(Color.black);
        g.setFont(new Font("ComicSans", Font.PLAIN, fontSize));

        if(!start) {
            //shows instructions in beginning of game
            g.drawString("SHAPE SHOOTER ARCADE GAME", 160, 75);
            g.drawString("by Larisa Kreismanis & Nathan Bullock", 140, 100);
            g.drawString("Objective: Fill in the outlined shape!",145, 150);
            g.drawString("Instructions:", 145, 185);
            g.drawString("1.) Click a colored shooter once.", 145, 208);
            g.drawString("2.) Hold and drag the shooter to aim.", 145, 228);
            g.drawString("3.) Press the spacebar to shoot.", 145, 248);
            g.drawString("4.) Match the shape bullet to the outline.", 145, 268);
            g.drawString("Press Enter to Start", 145, 290);
        }
        else if(start) {
            int num = 0;
            g.setColor(Color.black);
            for(int i = 0; i < outline.size(); i++) {
                outline.get(i).draw(g);
            }

            g.drawString("Shapes filled: " + shapesFilled, 160, 45);

            g.drawString("Timer: " + addSec, 300, 45);
            if(timeCounter >= 20 && timeCounter<=40) {
                //g.drawString((timeCounter*50)/1000+addSec + " ", 400, 20);
                if(timeCounter%20==0)
                    addSec++;
                if(timeCounter==40)
                    timeCounter=0;
            }
        }
        if(shapesFilled == 13) { //Number of shapes filled in until game ends
            g.drawString("You Win!", 250, 75);
            g.drawString("Your time: " + addSec, 238, 95);
            start = false;
            timer.stop();
        }
    }

    private class PanelMotionListener extends MouseMotionAdapter {

        public void mouseDragged(MouseEvent e) {
            if(myMovingShooter!=null) {
                int xVal = myMovingShooter.getX();
                int width = myMovingShooter.getWidth();
                int height = myMovingShooter.getHeight();
                int yVal =  myMovingShooter.getY();
                if(e.getX()>=xVal-width && e.getX()<=(xVal + width+50) && e.getY()>=yVal && e.getY()<=yVal+height)
                    myMovingShooter.move(e.getX(), width);
            }
        }
    }

    private void checkStats() {
        if(myMovingShooter != null) {
            timeCounter++;
            ArrayList<Bullet> shotBullets = myMovingShooter.getShotBullets();

            if(shotBullets != null ) {
                for(int i = 0; i < shotBullets.size(); i++) {
                    boolean move=true;
                    int bulletX = shotBullets.get(i).getX() + shotBullets.get(i).getRadius();
                    int bulletY = shotBullets.get(i).getY();
                    int radius = shotBullets.get(i).getRadius();
                    //shotBullets.get(i).move();
                    for(int j = 0; j < outline.size(); j++) {
                        int approxMinX = outline.get(j).getX()-10;
                        int approxMaxX = outline.get(j).getX()+10;
                        int approxMinY = outline.get(j).getY()-10;
                        int approxMaxY = outline.get(j).getY()+10;
                        //if bullet matches outline, stop it
                        // System.out.println(bulletX + " " + bulletY);
                        //System.out.println(approxMaxX + " " + approxMinX);
                        //System.out.println(approxMaxY + " " + approxMinX);

                        if(bulletX < approxMaxX && bulletX > approxMinX) {
                            if(bulletY < approxMaxY && bulletY > approxMinY) {
                                System.out.println(shotBullets.get(i).getId());
                                System.out.println(outline.get(j).getId());
                                if(shotBullets.get(i).getId() == outline.get(j).getId()) {
                                    if(outline.get(j).getFill() == false) {
                                        bulletX = outline.get(j).getX();
                                        bulletY = outline.get(j).getY();
                                        move=false;
                                        shotBullets.remove(i);
                                        outline.get(j).setFill(true);
                                        shapesFilled++;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    if(move == true)
                        shotBullets.get(i).move();
                }
            }
        }
    }
}  //end class