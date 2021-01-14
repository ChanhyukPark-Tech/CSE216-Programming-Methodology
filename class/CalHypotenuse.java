import java.util.Scanner;

// CalHypotenuse.java
// 직각 삼각형의 빗변의 길이를 구한다 
public class CalHypotenuse {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("짧은 변의 길이를 입력하시오");
		double a = s1.nextDouble();
		
		System.out.println("긴 변의 길이를 입력하시오");
		double b = s1.nextDouble();
		
		double c = a * a + b * b ;
		
		
		System.out.println("당신의 빗변 : " + Math.sqrt(c));
		
		
		
	}

}
