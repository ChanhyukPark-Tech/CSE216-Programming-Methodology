
public class ReversedArray {
	
	public static int[] reverse(int[] r) {                    // int type 배열을 받아서 int 타입배열을 return 할것이다. 
		int size = r.length;
		int[] answer = new int[size];
		for(int i=0; i<r.length;i++) {
			answer[i] = r[size - 1 - i];
		}
		return answer;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[10];
		for(int i=0; i<arr.length;i++) {
			arr[i] = i;
		}
		
		int[] reversed = reverse(arr);
		
		System.out.println("This is original array");
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("This is reversed array");
		for(int i=0; i<arr.length; i++) {
			System.out.print(reversed[i] + " "); 
		}
	}

}
