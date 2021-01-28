package NewClock;

public class ClockActivator {

	public static void main(String[] args) {
		ClockWriter active = new ClockWriter();
		boolean processing = true;
		while(true) {
			active.repaint();
		}
	}

}
