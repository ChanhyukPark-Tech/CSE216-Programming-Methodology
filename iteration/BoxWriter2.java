import java.awt.Color;
import java.awt.Graphics;

public class BoxWriter2 {
	private Box2 box;		//���޸� box �� ��ĥ������ �������̱� ������ ball ���޸� color �� ��ȣ���ص��ǵ�
							// box �� size �� box class ���� definition ����� ������ �� sizeOf method �� ����ϱ� ���� �����ڿ��� ȣ��
						//Ball �� ������ �� �����Ҷ� �ø��´�� �����ϰ�; color �����߰� 
							// ����� ���� �ȹٲ㵵�Ǵϱ�
	public BoxWriter2(Box2 b) {
		box = b;     		// �����ڴ� box �� �޴´�
	}
	
	public void paint(Graphics g) {
		int size = box.sizeOf();				
		g.setColor(Color.white);
		g.fillRect(0, 0, size, size);
		g.setColor(Color.black);
		g.drawRect(0, 0, size, size);		
		
	}
}
