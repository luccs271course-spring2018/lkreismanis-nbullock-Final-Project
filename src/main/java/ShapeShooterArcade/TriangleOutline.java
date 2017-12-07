/*
 * SHAPE SHOOTER ARCADE GAME
 * by Larisa Kreismanis & Nathan Bullock
 * File: TriangleOutline.java
 * Description: The Triangle Outline is a subclass of Outline.
 * Author: Larisa Kreismanis & Nathan Bullock
 * Date-written: 11/30/17
 * COMPLETED
 */
 
 import java.awt.*;
 
 public class TriangleOutline extends Outline {
     
     public TriangleOutline(int x, int y, int i){
         super(x, y, i);
     }
     
     public void draw(Graphics g){
      int x = getX();
      int y = getY();
      int id = getId();
      
      boolean fill = getFill();
      
      if(!fill){
       //draws UP Triangle
       if(id == 1){
        g.drawPolygon(new int[] {x+10, x+30, x+50}, new int[] {y+60, y+20, y+60}, 3);
       }
       //draws DOWN Triangle
       else if(id == 2){
        g.drawPolygon(new int[] {x+10, x+30, x+50}, new int[] {y+20, y+60, y+20}, 3);
       }
       //draws RIGHT Triangle
       else if(id == 3){
        g.drawPolygon(new int[] {x+10, x+10, x+50}, new int[] {y+60, y+20, y+40}, 3);
       }
       //draws LEFT Triangle
       else if(id == 4){
        g.drawPolygon(new int[] {x+10, x+50, x+50}, new int[] {y+40, y+20, y+60}, 3);
       }
      }
      else{
       //draws UP Triangle
       if(id == 1){
        g.drawPolygon(new int[] {x+10, x+30, x+50}, new int[] {y+60, y+20, y+60}, 3);
       }
       //draws DOWN Triangle
       else if(id == 2){
        g.drawPolygon(new int[] {x+10, x+30, x+50}, new int[] {y+20, y+60, y+20}, 3);
       }
       //draws RIGHT Triangle
       else if(id == 3){
        g.drawPolygon(new int[] {x+10, x+10, x+50}, new int[] {y+60, y+20, y+40}, 3);
       }
       //draws LEFT Triangle
       else if(id == 4){
        g.drawPolygon(new int[] {x+10, x+50, x+50}, new int[] {y+40, y+20, y+60}, 3);
       }
      }
         
     }
 }  //end class