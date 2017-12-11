/*
 * SHAPE SHOOTER ARCADE GAME
 * by Larisa Kreismanis & Nathan Bullock
 * File Name: Bullet.java
 * Description: Abstract class with triangleBullet and rectangleBullet subclasses.
 * COMPLETED
*/


import java.awt.*;

//All bullets have the same speed
public abstract class Bullet {
    private int centerX, centerY, radius, id;
    private boolean used;
    private int speedX, speedY;
    private Color color;

    public Bullet(int x, int y, int r, int i, int xSpeed, int ySpeed, Color c) {
        centerX = x;
        centerY = y;
        radius = r;
        id = i;
        used = false;
        speedX = xSpeed;
        speedY = ySpeed;
        color = c;
    }

    public void inactive() {

        used=true;
    }
    public boolean inactiveT() {

        return used;
    }
    public void release() {
        centerY = centerY + speedY;
    }
    //moves bullet
    public void move(){
        centerY = centerY + speedY;
    }

    //getter & setter methods
    public int getRadius() {
        return radius;
    }
    public int getId() {

        return id;
    }
    public void setX(int x) {
        centerX = x - 30;
    }
    public void setY(int y) {

        centerY = y;
    }
    public int getX() {

        return centerX;
    }
    public int getY() {

        return centerY;
    }
    public void setXSpeed(int x) {

        speedX = x;
    }
    public void setYSpeed(int y) {

        speedY = y;
    }
    public int getXSpeed() {

        return speedX;
    }
    public int getYSpeed() {

        return speedY;
    }
    public Color getColor() {
        return color;
    }

    public abstract void draw(Graphics g);
}  //end class