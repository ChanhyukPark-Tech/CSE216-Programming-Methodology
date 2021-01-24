import java.awt.Color;

public class Bouncetheball2 {

	public static void main(String[] args) {
		int box_size = 1000;
		int balls_radius = 10 ;
		Box2 box = new Box2(box_size); // 얽히고 섥힐 꺼리가없다 그러므로 걍  int 이므로 맨첨에써줌 그다음에 box는이제 알지
		BoxWriter2 box_writer = new BoxWriter2(box);      
		 							   //소거해가는 느낌으로 하면댐 
		MovingBall2 ball = new MovingBall2((int)(box_size / 2.0), (int)(box_size / 2.0 ), balls_radius,box); 
		BallWriter2 ball_writer = new BallWriter2(ball, Color.red);
														//int ,double 
		AnimationWriter2 writer = new AnimationWriter2(box_writer,ball_writer,box_size);
		BounceController2 start = new BounceController2(ball,writer);
		start.runAnimation();
//		for(int i=0 ; i< 10000 ; i++) {
//		System.out.println(ball.xPosition() + " " + ball.yPosition());
	}}


