package Shape;
 import javax.swing.*;

public class Command  {
   private final int INIT = 0, BOX = 1, CIR = 2, Str=3,Redo=4,Undo=5;  // the choice of the buttons
   private int state = INIT;
   HW2Shape shapes;

   public Command() {
      shapes = new Shapes(); //return the shape that is drawn

   }

   public HW2Shape getShapes() {
      return shapes;
   }

   //when button is clicked it will set the state to a choice
   public void boxClicked() {
      state = BOX;
   }

   public void cirClicked() {
      state = CIR;
   }
   
   public void stringClicked() {
	      state = Str;
	   }
   public void redoClicked() {
	   state=Redo;
	   }
  public void undoClicked() {
	  state=Undo;
	  }

   //Switch statement will determine which function to excute
  
  public void canvasClicked(int x, int y) {
      switch(state) {
         case INIT:
            return;
         case BOX:
            HW2Shape shape = new Box(x, y); //intilize the shape object to a specific object circle, box or hello
            shapes.add(shape);
            state = INIT;
            return;
         case CIR:
            shape = new Circle(x, y);
            shapes.add(shape);
            state = INIT;
            return;
         case Str:
             shape = new Hello(x, y);
             shapes.add(shape);
             state = INIT;
             return;
         case Redo:
             shapes.redo();
             state = INIT;
             return;
         case Undo:
        	 shapes.undo();
        	 state=INIT;
        	 return;
        	 
        
      }
   }
}

