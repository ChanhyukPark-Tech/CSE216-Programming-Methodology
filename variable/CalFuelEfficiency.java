import java.util.*;
// �ֹ��� fuel ����Ÿ� = driveDistance ���� = fuelEfficiency; 
// fuelEfficiency = driveDistance / fuels;

public class CalFuelEfficiency {

	public static void main(String[] args) {
		int fuel;
		double driveDistance;
		double fuelEfficiency;
		Scanner s1 = new Scanner(System.in);

		System.out.println("������� �Է��Ͻÿ� : ");
		fuel = s1.nextInt();
		System.out.println("�󸶳� �޷Ƚ��ϱ� :  ");
		driveDistance = s1.nextDouble();
		System.out.println("����� �����Դϴ� : " + driveDistance / fuel );
		
		
		
		
		
		

	}

}
