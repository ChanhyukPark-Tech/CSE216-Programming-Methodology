
public class FindChar {
		
	public static int findchar(char c , String s) {
		boolean found = false;
		int index = 0;
		
		while(!found && index < s.length()) {
			
			if(s.charAt(index) == c) {
				found = true;
			} else {
				index = index + 1 ;
			}
		}
		
		if(!found) {
			index = -1;
		}
		
		return index;
		
	}

	public static void main(String[] args) {
		String target = "d";
		String input = "abasafgreagacdef";
		char c = target.charAt(0);
		int location = findchar(c , input);
		System.out.println(location);
		
	}

}
