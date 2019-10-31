package Shape;

import java.awt.Graphics;

public class Circle extends HW2Shape {

        public Circle(int x, int y) {
           super(x, y);
        }

	//@Override
	public void draw(Graphics graphics) {
		graphics.drawOval(this.x, this.y, 120, 120);
	}
	

}
