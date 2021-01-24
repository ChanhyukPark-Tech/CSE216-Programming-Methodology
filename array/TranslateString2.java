import javax.swing.JOptionPane;

class Translate{
	
	
	
	private int[] encode;
	private int[] decode;
	
	public Translate(int seed) {
		
		encode = new int[27];
		decode = new int[27];
		
		encode[0] = seed;
		decode[seed] = 0;
		
		for(int i=1; i< 27;i++) {
//			int new_code = (encode[i-1]+4) % 27;
			encode[i] = (encode[i-1] + 4) % 27;
			decode[encode[i]] = i;
//			encode[i] = new_code;
//			decode[new_code] = i;
		}
	}
	
	public char i2c(int i) {           // 0 --> " "  1 --> 'a'   ... 
		int answer = 'a'+i-1;
		return (char)answer;
//		if(i==0) return ' ';
//		if(0<i && i<27) return (char)('a' + i -1);
//		throw new RuntimeException("i2c : invalid code " + i);
	}
	
	public int c2i(char c) {
//		char answer = (char) (c - 'a' + 1);
//		return (int)answer;
		if(c==' ') return 0;
		if('a' <=c && c<='z') return c-'a'+1;
		throw new RuntimeException("c2i: invalid character" + c);
	}
	
	public char encode(char c) {
//		return i2c(encode[c2i(c)]);
		return i2c(encode[c2i(c)]);
	}
	
	public char decode(char c) {
//		return i2c(decode[c2i(c)]);
		return i2c(decode[c2i(c)]);
	}
	
	public String encode(String s) {
		String result = "";
		for(int i=0 ;i<s.length() ;i++) {
			result = result + encode(s.charAt(i));
		}
		return result;
		
	}
	
	public String decode(String s) {
		String result = "";
		for(int i=0; i<s.length();i++) {
			result = result + decode(s.charAt(i));
		}
		return result;
	}
	
	
	
}

public class TranslateString2 {
	public static void main(String[] args) {
		Translate m = new Translate(4);
    	String original = JOptionPane.showInputDialog("암호화할 문장을 입력하세요.");
    	String encoded = m.encode(original);
    	String decoded = m.decode(encoded);
    	JOptionPane.showMessageDialog(null, "원본: " + original + "\n암호화: " + encoded + "\n복호화: " + decoded);
    	System.exit(0);
		
	}

}
