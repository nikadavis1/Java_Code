package Shape;

import java.awt.Graphics;
import javax.swing.*;
import java.util.List;

public abstract class HW2Shape{

   int x, y;

   public HW2Shape(int x, int y) {
      this.x = x;
      this.y = y;
   }

   public abstract void draw(Graphics graphics);
   
   public void add(HW2Shape s) {
      // noop
   }
   public void redo() {
	   
   }
   
   
   public void undo() {
	   
   }

}
