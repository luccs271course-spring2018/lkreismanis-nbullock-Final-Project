package ShapeShooterArcade;
/* 
 * File Name: Bullet.java
 * Authors: Larisa Kreismanis, Nathan Bullock
 * Description: Class that will incorparate triangleBullet and rectangleBullet subclasses
 * Date Created: 11/17/17
 * COMPLETED
*/

public abstract class Bullet {
    private int centerX, centerY, radius, id;
    private boolean used;
    private int speedX, speedY;
    private Color color;
    
    public Bullet(int x, int y, int r, int i, int xSpeed, int ySpeed, Color c){
        centerX = x;
        centerY = y;
        radius = r;
        id = i;
        speedX = xSpeed;
        speedY = ySpeed;
        color = c;
    }
    
    public void inactive(){
        used = true;
    }
    public boolean inactiveT(){
        return used;
    }
    //Moves bullut up across y axis
    public void move(){
        centerY = centerY + speedY;
    }
    public int getX(){
        return centerX;
    }
    public int getY(){
        return centerY;
    }
    public int getSpeedX(){
        return speedX;
    }
    public int getSpeedY(){
        return speedY;
    }
    public int getRadius(){
        return radius; 
    }
    public void setX(int x){
        centerX = x;
    }
    public void setY(int y){
        centerY = y;
    }
    public void setSpeedX(int x){
        speedX = x;
    }
    public void setSpeedY(int y){
        speedY = y;
    }
    public void setColor(int c){
        color = c;
    }
    
    public abstract void draw(Graphics g);
} //end class