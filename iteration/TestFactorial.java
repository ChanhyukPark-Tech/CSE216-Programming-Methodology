
public class TestFactorial {

	public static void main(String[] args) {
		
			System.out.println(Fibonacci(5));
			
		}
	
	
public static long factorial(int n) {
	long answer;
	if( n < 0 || n > 20) {
			answer = -1;
		} else { if (n == 0 )
					{answer = 1;}
				else {answer = n * factorial(n-1);}
	}
	return answer;
	
}

public static int Fibonacci(int N)
{
	// if N is zero return zero
	if(N == 0)
	{ 
		return 0;
	}
	
	// If the value of N is one or two return 1
	if (N == 1 || N ==2 )
	{
		return 1;
	}
	
	// Keep track of the fibonacci values for N-1 and N-2
	int N_1 = 1;
	int N_2 = 1;
	
	// From the bottom-up calculate all the fibonacci values until you
	// reach the N-1 and N-2 values of the target Fibonacci(N)
	
	for(int i=3; i<N;i++)
	{
		int temp = N_1;
		N_1 = N_2 + N_1;
		N_2 = temp;
	}
	
	return N_1 + N_2;
}

}

