import java.util.*;
public class SimulateDie {

	public static void main(String[] args) {
		//Random ��ü�� �����ϰ� generator �� �� ��ü�� ����Ű�� �Ѵ�
		Random generator = new Random();
		
		// ������ �����ϴ� ����
		int randomnumber1 ;
		float randomnumber2 ; 
		
		// 1�� 6������ ���� ����
		randomnumber1 = generator.nextInt(6) + 1 ;
		
		// �������
		System.out.println(randomnumber1);
		
		// 0.0 ���� 5.9999999999 ������ ���� ����
		randomnumber2 = generator.nextFloat() * 6;
		
		// ������ ������ 1�� 6������ ������ ��ȯ
		randomnumber1 = (int)randomnumber2 + 1;
		
		for(int i=0; i < 300; i++) {
			randomnumber1 = generator.nextInt(15) + 1;
			System.out.println(randomnumber1);
		}
		
	}

}
