import java.awt.Color;

public class Bouncetheball2 {

	public static void main(String[] args) {
		int box_size = 1000;
		int balls_radius = 10 ;
		Box2 box = new Box2(box_size); // ������ ���� ���������� �׷��Ƿ� ��  int �̹Ƿ� ��÷������ �״����� box������ ����
		BoxWriter2 box_writer = new BoxWriter2(box);      
		 							   //�Ұ��ذ��� �������� �ϸ�� 
		MovingBall2 ball = new MovingBall2((int)(box_size / 2.0), (int)(box_size / 2.0 ), balls_radius,box); 
		BallWriter2 ball_writer = new BallWriter2(ball, Color.red);
														//int ,double 
		AnimationWriter2 writer = new AnimationWriter2(box_writer,ball_writer,box_size);
		BounceController2 start = new BounceController2(ball,writer);
		start.runAnimation();
//		for(int i=0 ; i< 10000 ; i++) {
//		System.out.println(ball.xPosition() + " " + ball.yPosition());
	}}


