import java.awt.Color;
import java.awt.Graphics;

public class BoxWriter {
	private Box box; // the (address of the) box object that is displayed
	
	public BoxWriter(Box b) {
		box = b;
	}
	
	public void paint(Graphics g)
	{
		int size = box.sizeOf();
		g.setColor(Color.white);
		g.fillRect(0, 0, size, size);
		g.setColor(Color.black);
		g.drawRect(0,0,size,size);
		
	}

}
