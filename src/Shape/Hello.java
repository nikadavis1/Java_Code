package Shape;

import java.awt.Graphics;

public class Hello extends HW2Shape{
	String Hello;
	
	  public Hello(int x, int y) {
		  super(x, y);
       }
	  
	//@Override
		public void draw(Graphics graphics) {
			this.Hello = "Hello World";
			graphics.drawString(Hello,this.x,this.y);
		}
		

}
