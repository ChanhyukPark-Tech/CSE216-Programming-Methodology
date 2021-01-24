import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class AnimationWriter2 extends JPanel{           //JPanel �� ��ӹ޾Ƽ� ȭ���� paintComponent �� ��ü���ٰ���
	private BoxWriter2 box_writer;						//�߻�Ŭ���� interface�� class �� interface�̷�������¥�ּ���~
			// �� ��ü������ �׷���											//Ʋ�� �ְ� ��ü�¾��°� �������̽� �����Ѱ� class 5���� �޼ҵ尡														//2 ���� ���� 3���� ������ �������̽�  << �߻�Ŭ���� 
	private BallWriter2 ball_writer; 		 			// �� �� writer �� ���� ball�� box�� ������� �׸��� �������� 
			// �����̳� ũ�� ������ << 											// �� AnimationWriter class�� writer ��ü ������ repaint�� ����Ұ��̴�.
														// �� class�� jpanel �� ��ӹ޾Ұ� ���⼭ ȭ��(�޼���) �� paintComponent �� �����Ұ��̱⶧����
														// �����ڷ� box_writer �� ball_writer �� �޾ƾ߸� �Ѵ�
	public AnimationWriter2(BoxWriter2 box , BallWriter2 ball, int size) {
		box_writer = box;								// Ʋ�� jframe �� ����� �׷����ϱ� ������ ������ size ���� �޾ƾ��Ѵ�.
		ball_writer = ball;		
			// ��ȭ������µ� ���������ؼ� ������ jframe �� ����� �� ������ ������ȿ� new ����� 4����						// ������ ���� �ǹ��� ȭ������ ����ɰ��̴�.
		JFrame my_frame = new JFrame();                 // ���� Ʋ ��ü ���� JFrame �̶�� class �� �׻� ��밡�� new �� ����� ������ ���� ����
		my_frame.getContentPane().add(this);			// �׻� �̷������� frame �� ��ȭ���� ����� 
		my_frame.setTitle("Bounce");                    //������
		my_frame.setSize(size,size);					//������ ���ڷ� size ���� ���� ������ ���⼭ �׸� size�� �������ֱ����ؼ�
		my_frame.setVisible(true);                      // â�� �߰��Ϸ��� �׻� true �� check �ʼ�
	}
														// object �� �ְ�����ݾ� ,  ������ �ڵ�����ȣ���
	public void paintComponent(Graphics g) {
		box_writer.paint(g);
		ball_writer.paint(g);	
//		flower_writer.paint(g);							//Animation Writer 
	}
}
