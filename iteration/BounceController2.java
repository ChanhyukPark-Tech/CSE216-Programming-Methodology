
public class BounceController2 {
	private MovingBall2 ball; // model object
	private AnimationWriter2 writer; //output_view object 이걸로 그려줌
	
	public BounceController2(MovingBall2 b , AnimationWriter2 w) { // box는 왜없는이유가 box 는 정적이라그런거같아
		ball = b;													// ball class 의 move method 와 animationwriter 의 repaint method 사용위함
		writer = w;
	}
	
	public  void runAnimation() {
		int time_unit = 1;
		int painting_delay = 20;
//		boolean processing = true;
		while (true) {
			delay(painting_delay);
			ball.move(time_unit);             // move 는 time_unit 을 받아서 그것을 속도만큼 곱해서 이동하는 method
			writer.repaint(); 					// 바로바로 repaint
		}
	}
	
	private  void delay(int how_long) {  // 얼마나 오래 참고 다시 그릴거냐
		try { Thread.sleep(how_long); } catch(InterruptedException e) {
			System.out.println("오류발생");
		}
	}
	
	
}
