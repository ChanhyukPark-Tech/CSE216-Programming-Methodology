import java.text.DecimalFormat;

// CelsiusToFahrenheit1 는 프로그램 인수로 섭씨온도를 받아 화씨온도로 바꾸어 출력해 준다 

public class CelsiusToFahrenheit_professor {
	public static void main(String[] args) {
		
		int c = new Integer(args[1]).intValue();
		double f = ((9.0/5.0)*c) + 32;
		System.out.println("For Celsius degrees " + c + ",");
		DecimalFormat formatter = new DecimalFormat("0.0");
		System.out.println("Degrees Fahrenheit = " + formatter.format(f)); 
		
		
	}
}