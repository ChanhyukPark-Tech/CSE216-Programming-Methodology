import java.util.Scanner;

public class MultipleArray { 
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // ���� �޾Ƽ� ����� ���ϰ� 
		int n = in.nextInt();  // ����� �� ��� �� ��  n x n ��� 
		int a[][] = new int[n][n]; // matrix �ڸ� ������ֱ� make a sit! 
		int diagonal1 = 0; // ���������� ���Ѹ��� �Ʒ��� ������
		int diagonal2 = 0; // ������������ ���ʾƷ��� 
		
		for(int a_i=0; a_i < n; a_i++) {                // i �� j �� i �����̰� j �� �� i0 > j 0 1 2 
														//                         i1 > j 0 1 2 
														//                         i2 > j 0 1 2 
			for (int a_j=0; a_j < n ; a_j++ ) {
				a[a_i][a_j] = in.nextInt();
				if(a_i==a_j) diagonal1 += a[a_i][a_j];
				if(a_i+a_j==n-1) diagonal2 += a[a_i][a_j];  // 1�� 3  0 2   , 1 1 , 2 0 
			}
				
		}
		System.out.println(Math.abs(diagonal1-diagonal2));
	}
	
}

