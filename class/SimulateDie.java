import java.util.*;
public class SimulateDie {

	public static void main(String[] args) {
		//Random 객체를 생성하고 generator 가 그 객체를 가리키게 한다
		Random generator = new Random();
		
		// 난수를 저장하는 변수
		int randomnumber1 ;
		float randomnumber2 ; 
		
		// 1과 6사이의 난수 생성
		randomnumber1 = generator.nextInt(6) + 1 ;
		
		// 난수출력
		System.out.println(randomnumber1);
		
		// 0.0 부터 5.9999999999 사이의 난수 생성
		randomnumber2 = generator.nextFloat() * 6;
		
		// 생성된 난수를 1과 6사이의 난수로 반환
		randomnumber1 = (int)randomnumber2 + 1;
		
		for(int i=0; i < 300; i++) {
			randomnumber1 = generator.nextInt(15) + 1;
			System.out.println(randomnumber1);
		}
		
	}

}
