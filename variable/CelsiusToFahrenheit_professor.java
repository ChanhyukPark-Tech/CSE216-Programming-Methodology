import java.text.DecimalFormat;

// CelsiusToFahrenheit1 �� ���α׷� �μ��� �����µ��� �޾� ȭ���µ��� �ٲپ� ����� �ش� 

public class CelsiusToFahrenheit_professor {
	public static void main(String[] args) {
		
		int c = new Integer(args[1]).intValue();
		double f = ((9.0/5.0)*c) + 32;
		System.out.println("For Celsius degrees " + c + ",");
		DecimalFormat formatter = new DecimalFormat("0.0");
		System.out.println("Degrees Fahrenheit = " + formatter.format(f)); 
		
		
	}
}