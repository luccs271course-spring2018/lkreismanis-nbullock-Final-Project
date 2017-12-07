/*
 * SHAPE SHOOTER ARCADE GAME
 * by Larisa Kreismanis & Nathan Bullock
 * File: SquareBullet.java
 * Description: SuareBullet is a subclass of Bullet.
 * Author: Larisa Kreismanis & Nathan Bullock
 * Date-written: 11/30/17
 * COMPLETED
 */
 
 import java.awt.*;
 
 public class SquareBullet extends Bullet{
     
     //private Color color = Color.GREEN;
     
     public SquareBullet(int x, int y, int r, int i, int xSpeed, int ySpeed, Color c){
         super(x, y, r, i, xSpeed, ySpeed, c);
         //color = c;
     }
     
     public void draw(Graphics g){
         
         //g.fillRect(35, 35, 35, 35);
         //g.setColor(color);
         //g.fillPolygon(new int[] {10,30,50}, new int[] {60,20,60}, 3);
         int x = getX();
         int y = getY();
         if(getId() == 5){
            g.fillRect(x + 10, y, 40, 40);
            //g.fillPolygon(new int[] {x+10, x+30, x+50, new int[]{y+60, y+20, y+60}, 3);
         }
     }
 }  //end class