import java.awt.Color;
import java.awt.Graphics;

public class BoxWriter2 {
	private Box2 box;		//별달리 box 는 색칠해주지 않을것이기 떄문에 ball 과달리 color 를 안호출해도ㅗ딤
							// box 의 size 를 box class 에서 definition 해줬기 때문에 그 sizeOf method 를 사용하기 위해 생성자에서 호출
						//Ball 은 색깔이 걍 실행할때 꼴리는대로 지정하고싶어서 color 지정했고 
							// 배경은 굳이 안바꿔도되니깐
	public BoxWriter2(Box2 b) {
		box = b;     		// 생성자는 box 만 받는다
	}
	
	public void paint(Graphics g) {
		int size = box.sizeOf();				
		g.setColor(Color.white);
		g.fillRect(0, 0, size, size);
		g.setColor(Color.black);
		g.drawRect(0, 0, size, size);		
		
	}
}
