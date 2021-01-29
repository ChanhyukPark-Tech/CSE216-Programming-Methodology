package ClickPaintBall;

public class BallActivator {

	public static void main(String[] args) {
		int i = 0;
		Counter c = new Counter(i);
		Drawing draw = new Drawing(c);
		Frame f = new Frame(c , draw);
		
	}

}
