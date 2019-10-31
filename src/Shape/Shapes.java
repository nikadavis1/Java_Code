package Shape;

import java.awt.Graphics;
import java.util.*;


public class Shapes extends HW2Shape{
   Collection coll1;
   Collection coll2;
   
   int top=0;
   public Shapes() {
         super(0, 0);
         coll1 = new Stack<HW2Shape> ();   //set two stacks for the different shapes drawn 
         coll2 = new Stack<HW2Shape> ();
        }
   
   
   public void add(HW2Shape s) {
     ((Stack<HW2Shape>) coll1).push(s);  //push the shape on the collection stack
      
   }
   
   
   public void undo() {
	      HW2Shape s;
	   	  s=((Stack<HW2Shape>) coll1).pop();    //pop the shape off the first collection stack
	      ((Stack<HW2Shape>) coll2).push(s);   //pushes the shape that was just popped off onto the 
	                                           //collection2 2 stack  
	   }                                       //Have to click the panel after pushing the button to 
                                              //erase the shape on the panel
   public void redo() {
	   HW2Shape s;
	   s=((Stack<HW2Shape>)coll2).pop();      //pop the shape off the collection2 stack and push it onto
	   ((Stack<HW2Shape>) coll1).push(s);      //the collection 1 stack to implement the redo
	                                           //have to click the panel to redo the shape
   }
   

   public void draw(Graphics graphics) {
      Iterator it=coll1.iterator();
      while (it.hasNext()) {
         ((HW2Shape)it.next()).draw(graphics);
      }
   }
   
   
}

