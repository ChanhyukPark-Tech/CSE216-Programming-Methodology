import java.util.Scanner;

// CalHypotenuse.java
// ���� �ﰢ���� ������ ���̸� ���Ѵ� 
public class CalHypotenuse {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("ª�� ���� ���̸� �Է��Ͻÿ�");
		double a = s1.nextDouble();
		
		System.out.println("�� ���� ���̸� �Է��Ͻÿ�");
		double b = s1.nextDouble();
		
		double c = a * a + b * b ;
		
		
		System.out.println("����� ���� : " + Math.sqrt(c));
		
		
		
	}

}
