
public class CelsiusToFahrenheit0 {

	public static void main(String[] args) {
		double c = new Double(args[0]).doubleValue();
		 
		double f = ((9.0/5.0) * c) + 32;
		System.out.println("For Celsius degrees " + c + ",");
		System.out.println("For Fahrenheit = " + f );
		
		
	}

}
