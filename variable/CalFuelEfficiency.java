import java.util.*;
// 휘발유 fuel 주행거리 = driveDistance 연비 = fuelEfficiency; 
// fuelEfficiency = driveDistance / fuels;

public class CalFuelEfficiency {

	public static void main(String[] args) {
		int fuel;
		double driveDistance;
		double fuelEfficiency;
		Scanner s1 = new Scanner(System.in);

		System.out.println("연료양을 입력하시오 : ");
		fuel = s1.nextInt();
		System.out.println("얼마나 달렸습니까 :  ");
		driveDistance = s1.nextDouble();
		System.out.println("당신의 연비입니다 : " + driveDistance / fuel );
		
		
		
		
		
		

	}

}
