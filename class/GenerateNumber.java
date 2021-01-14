import java.util.Random;
import java.util.Scanner;

//GenerateNumber.java
//신입생의 학번을 생성한다


public class GenerateNumber {

	public static void main(String[] args) {
		String name;
		String birthdate;
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요 : ");
		name = s1.next();
		System.out.println("생년월일을 입력하세요(yyyy/mm/dd) : ");
		birthdate = s1.next();
		
		int indexyear = birthdate.indexOf("/");
		String year = birthdate.substring(0,indexyear);
		String rest1 = birthdate.substring(indexyear + 1);
		
		int indexmonth = rest1.indexOf("/");
		String month = rest1.substring(0,indexmonth);
		String date = rest1.substring(indexmonth + 1);
		
		
		System.out.println("이름 : "+ name);
		System.out.println("생년월일 : " + year + "년 " + month + "월 " + date + "일");
		
		Random generator = new Random();
		int backnumber = generator.nextInt(10) + 1000;
		int backnumber1 = backnumber + 180000;
		
		System.out.println("학번 : " + backnumber1 );
		
		
		
		
		
		
		
	}

}
