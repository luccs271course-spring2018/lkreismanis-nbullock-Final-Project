/* 
 * File Name: ShapeShooterArcadeMain.java
 * Authors: Larisa Kreismanis, Nathan Bullock
 * Description: Class that will incorparate triangleBullet and rectangleBullet subclasses
 * Date Created: 11/17/17
*/

public class Bullet {
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
    public getX(){
        return centerX;
    }
    public getY(){
        return centerY;
    }
    public getSpeedX(){
        return speedX;
    }
    public getSpeedY(){
        return speedY;
    }
    public getRadius(){
        return radius; 
    }
    public getColor(){
        return color; 
    }
    public setX(int x){
        centerX = x;
    }
    public setY(int y){
        centerY = y;
    }
    public setSpeedX(int x){
        speedX = x;
    }
    public setSpeedY(int y){
        speedY = y;
    }
    public setColor(int c){
        color = c;
    }
    
    public abstract void draw(Graphics g);
} //end class