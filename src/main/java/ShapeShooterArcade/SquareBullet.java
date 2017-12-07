/*
 * SHAPE SHOOTER ARCADE GAME
 * by Larisa Kreismanis & Nathan Bullock
 * File: SquareBullet.java
 * Description: SuareBullet is a subclass of Bullet.
 * Author: Larisa Kreismanis & Nathan Bullock
 * Date-written: 11/30/17
 */
 
 import java.awt.*;
 
 public class SquareBullet extends Bullet{
     
     public SquareBullet(int x, int y, int r, int i, int xSpeed, int ySpeed, Color c){
         super(x, y, r, i, xSpeed, ySpeed, c);
     }
     
     public void draw(Graphics g){
         int x = getX();
         int y = getY();
         if(getId() == 5){
            g.fillRect(x + 10, y, 40, 40);
         }
     }
 }  //end class