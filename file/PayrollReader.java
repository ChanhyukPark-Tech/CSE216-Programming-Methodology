package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/** PayrollReader reads records from a sequential file.  The records have
 * the format,  NAME|HOURS|PAYRATE.   The file is terminated by a  !  */
//���ڵ带 ���� ���� �о��� �����ڴ� | ��� file �� �����°� ! �� ǥ��

public class PayrollReader {
	private BufferedReader infile;  // the address of the input file �Է������� �ּҰ���� �Է������� ��ü�� ���ڷι޾Ƽ� ��ü����
	private  String END_OF_FILE = "!";
	// the name, hours , and payrate of the most recently read record:
	private String name;
	private int hours;
	private double payrate;
	
	public PayrollReader(String file_name) {				// throws IOException �� ����ϸ� ����class ���� code �� so much dirty �̹Ƿ� 
		try {
//			try {
//				PrintWriter make = new PrintWriter(new FileWriter("text.txt"));
//			} catch (IOException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			PrintWriter outfile = new PrintWriter(new FileWriter(f + ".out"));
			infile = new BufferedReader(new FileReader(file_name));
		} catch (Exception e) {
			System.out.println("PayrollReader error : bad file name  : " + file_name + " Aborting!");
			throw new RuntimeException(e.toString());
		}
	}
	
	
	public boolean getNextRecord() {
		boolean result = false;
		name = null;
		hours = -1;
		payrate = -0.1;
		
		try {if(infile.ready())
			{	String line = infile.readLine();
			StringTokenizer t = new StringTokenizer(line, "|");
				String s = t.nextToken().trim();
				 if ( ! s.equals(END_OF_FILE) )
				 {	if(t.countTokens() == 2 )
				 {	name = s;
						hours = new Integer(t.nextToken().trim()).intValue();
						payrate = new Double(t.nextToken().trim()).doubleValue();
						result = true;
						} 
					else {
						throw new RuntimeException(line);
			}
						
		}
	}
}
		/* double catch ���  A try block can be followed by one or more catch blocks
		. Each catch block must contain a different exception handler. So, if you h
		ave to perform different tasks at the occurrence of different exceptions, use java multi-catch block.
		�ٸ� exception handler ��� double catch can used */
		catch (IOException e) {
			System.out.println("PayrollReader error : " + e.getMessage());
		} 
		catch (RuntimeException e) {
			System.out.println("PayrollReader error: bad record format: "
                    + e.getMessage() + "  Skipping record");
			result = getNextRecord();  // try again
		}	
		
			return result;
	}
	
	public String nameOf() {
		return name;
	}
	
	public int hoursOf() {
		return hours;
	}
	
	public double payrateOf() {
		return payrate;
	}
	
	public void close() {
		try {
			infile.close();
		} catch (IOException e) {
			System.out.println("file close failed ");
		}
	}
	
	
}
