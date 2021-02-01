package TranslateString;

import javax.swing.JOptionPane;

public class TranslateString {
	
	int seed ;
	private int[] encode ;
	private int[] decode ;
	
	
	
	public TranslateString(int seed) {
//		this.seed = seed;
//		encode = new int[27];
//		decode = new int[27];
//		encode[0] = seed;
//		decode[seed] = 0;
//		
//		 for(int i=1 ; i<encode.length; i++) {
//			 int new_code = (encode[i-1]+4) % encode.length;  		//seed a h dsfjsf
//			 encode[i] = new_code;									//4 단위 a e f 
//			 decode[new_code] = i;
//		 }
		
		 encode = new int[27];
		 decode = new int[27];
		 encode[0] = seed;       //seed1
		 decode[seed] = 0;
		 //asdasda  -- > rhnlrhf; a -- > r b --> h  String
		 
		 for(int i=1 ; i<encode.length; i++) {
			 int new_code = (encode[i-1]+4) % encode.length;  		//seed a h dsfjsf
			 encode[i] = new_code;									//4 단위 a e f 
			 decode[new_code] = i;
		
		 }
	}
	
	
	public char i2c(int i) {
		if( i ==0 ) return ' ' ;
		char answer = (char)('a' + i - 1); 
		return answer;
	}
	
	public int c2i(char c ) {
		if(c == ' ') return 0 ;
		int answer = c - 'a' + 1;
		return answer;
	}
	
	public char encode(char c) {		
		 return i2c(encode[c2i(c)]);
	 }
	
	public char decode(char c) {
		 return i2c(decode[c2i(c)]);
	 }
	
	
	public String encode(String s) {
		
		String result = "" ;
		for(int i=0 ; i<s.length() ; i++ ) {
			result = result + encode(s.charAt(i));
		}
		
		return result;
		
		
	}
		
	public String decode(String s) {
		
		String result = "";
		for(int i=0 ; i<s.length() ; i++ ) {
			result = result +decode(s.charAt(i));
		}
		
		return result;
		
		
	}
	

}
