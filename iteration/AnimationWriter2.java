import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class AnimationWriter2 extends JPanel{           //JPanel 을 상속받아서 화가인 paintComponent 만 교체해줄거임
	private BoxWriter2 box_writer;						//추상클래스 interface반 class 반 interface이런식으로짜주세요~
			// 더 구체적으로 그려짐											//틀만 있고 실체는없는게 인터페이스 구현한게 class 5개의 메소드가														//2 개는 구현 3개는 아직도 인터페이스  << 추상클래스 
	private BallWriter2 ball_writer; 		 			// 이 두 writer 에 각각 ball과 box를 어떤식으로 그릴지 저장한후 
			// 색상이나 크기 사이즈 << 											// 이 AnimationWriter class로 writer 객체 생성수 repaint를 사용할것이다.
														// 이 class는 jpanel 을 상속받았고 여기서 화가(메서드) 인 paintComponent 를 정의할것이기때문에
														// 생성자로 box_writer 와 ball_writer 를 받아야만 한다
	public AnimationWriter2(BoxWriter2 box , BallWriter2 ball, int size) {
		box_writer = box;								// 틀을 jframe 을 사용해 그려야하기 떄문에 정수로 size 값도 받아야한다.
		ball_writer = ball;		
			// 도화지만드는데 붙히기위해서 무조건 jframe 그 만드는 그 순간에 생성장안에 new 만들고 4가지						// 생성자 지정 맨밑쪽 화가에서 연결될것이다.
		JFrame my_frame = new JFrame();                 // 액자 틀 객체 생성 JFrame 이라는 class 는 항상 사용가능 new 를 사용해 나만의 액자 생성
		my_frame.getContentPane().add(this);			// 항상 이런식으로 frame 에 도화지를 끼운다 
		my_frame.setTitle("Bounce");                    //제목설정
		my_frame.setSize(size,size);					//생성자 인자로 size 값을 받은 이유가 여기서 네모 size를 지정해주기위해서
		my_frame.setVisible(true);                      // 창이 뜨게하려면 항상 true 로 check 필수
	}
														// object 가 최고봉이잖아 ,  뭔가가 자동으로호출됌
	public void paintComponent(Graphics g) {
		box_writer.paint(g);
		ball_writer.paint(g);	
//		flower_writer.paint(g);							//Animation Writer 
	}
}
