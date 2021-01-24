
public class BounceController2 {
	private MovingBall2 ball; // model object
	private AnimationWriter2 writer; //output_view object �̰ɷ� �׷���
	
	public BounceController2(MovingBall2 b , AnimationWriter2 w) { // box�� �־��������� box �� �����̶�׷��Ű���
		ball = b;													// ball class �� move method �� animationwriter �� repaint method �������
		writer = w;
	}
	
	public  void runAnimation() {
		int time_unit = 1;
		int painting_delay = 20;
//		boolean processing = true;
		while (true) {
			delay(painting_delay);
			ball.move(time_unit);             // move �� time_unit �� �޾Ƽ� �װ��� �ӵ���ŭ ���ؼ� �̵��ϴ� method
			writer.repaint(); 					// �ٷιٷ� repaint
		}
	}
	
	private  void delay(int how_long) {  // �󸶳� ���� ���� �ٽ� �׸��ų�
		try { Thread.sleep(how_long); } catch(InterruptedException e) {
			System.out.println("�����߻�");
		}
	}
	
	
}
