import java.util.Scanner;

public class MultipleArray { 
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // 변수 받아서 행렬을 정하고 
		int n = in.nextInt();  // 행렬의 한 행과 한 열  n x n 행렬 
		int a[][] = new int[n][n]; // matrix 자리 만들어주기 make a sit! 
		int diagonal1 = 0; // 왼쪽위에서 오ㅡ르쪽 아래로 내려가
		int diagonal2 = 0; // 오른쪽위에서 왼쪽아래로 
		
		for(int a_i=0; a_i < n; a_i++) {                // i 랑 j 랑 i 가행이고 j 가 열 i0 > j 0 1 2 
														//                         i1 > j 0 1 2 
														//                         i2 > j 0 1 2 
			for (int a_j=0; a_j < n ; a_j++ ) {
				a[a_i][a_j] = in.nextInt();
				if(a_i==a_j) diagonal1 += a[a_i][a_j];
				if(a_i+a_j==n-1) diagonal2 += a[a_i][a_j];  // 1행 3  0 2   , 1 1 , 2 0 
			}
				
		}
		System.out.println(Math.abs(diagonal1-diagonal2));
	}
	
}

