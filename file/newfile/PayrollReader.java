package newfile;

import java.io.*;
import java.util.StringTokenizer;

public class PayrollReader {
	private BufferedReader infile ;
	private String name;
	private int hours;
	private double payrate;
	private String EOF = "!";
	public boolean	result;
	
	public PayrollReader(String file_name) {
		try {
			infile = new BufferedReader(new FileReader(file_name));
		} catch (Exception e)
        { System.out.println("PayrollReader error: bad file name: "
                + file_name + "   Aborting!");
        	throw new RuntimeException(e.toString());
}
		
	}
	
	public boolean getNextRecord() {
		boolean result = false;
	    name = null;
	    hours = -1;
	    payrate = -0.1;
			String line;
		try {
			line = infile.readLine();
			StringTokenizer t = new StringTokenizer(line, "|");
			String s = t.nextToken().trim();
			
			if(!s.equals(EOF) || t.countTokens() == 2) {
				name = s;
				hours = new Integer(t.nextToken().trim()).intValue();
				payrate = new Double(t.nextToken().trim()).doubleValue();
				result = true;
				return result;
			}
			
		} catch (Exception e) {
			{ System.out.println("PayrollReader error: " + e.getMessage()); }
		}
			return result;
		
	}

	
	public String getName() {
		return name;
	}
	
	public int gethours() {
		return hours;
	}
	
	public double getpayrate() {
		return payrate;
	}
	
	public void close() {
		try {
			infile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
