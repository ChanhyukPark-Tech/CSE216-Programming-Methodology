import java.util.Random;
import java.util.Scanner;

//GenerateNumber.java
//���Ի��� �й��� �����Ѵ�


public class GenerateNumber {

	public static void main(String[] args) {
		String name;
		String birthdate;
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("�̸��� �Է��ϼ��� : ");
		name = s1.next();
		System.out.println("��������� �Է��ϼ���(yyyy/mm/dd) : ");
		birthdate = s1.next();
		
		int indexyear = birthdate.indexOf("/");
		String year = birthdate.substring(0,indexyear);
		String rest1 = birthdate.substring(indexyear + 1);
		
		int indexmonth = rest1.indexOf("/");
		String month = rest1.substring(0,indexmonth);
		String date = rest1.substring(indexmonth + 1);
		
		
		System.out.println("�̸� : "+ name);
		System.out.println("������� : " + year + "�� " + month + "�� " + date + "��");
		
		Random generator = new Random();
		int backnumber = generator.nextInt(10) + 1000;
		int backnumber1 = backnumber + 180000;
		
		System.out.println("�й� : " + backnumber1 );
		
		
		
		
		
		
		
	}

}
