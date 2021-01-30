package payroll_01_30;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class PayrollReader {
	BufferedReader reader ;
	String name;
	String EOF = "!";
	int hours;
	double payrate;
	
	
	
	
	public PayrollReader(String infile_name){
		try {
			reader = new BufferedReader(new FileReader(infile_name));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean getNextRecord() {
		String s;
		try {
			if(!reader.ready()) {
				return false;
			}
			
			s = reader.readLine();
			StringTokenizer t = new StringTokenizer(s  , "|");
			String first_String = t.nextToken().trim();
			
			
			if( !s.equals(EOF) || t.countTokens() == 2) {
				name = first_String ; 
				hours = new Integer(t.nextToken().trim()).intValue();
				payrate = new Double(t.nextToken().trim()).doubleValue();
				return true;
				
		}
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false; 
	}
	
	public String getName() {
		return name;
	}
	
	public int getHours() {
		return hours;
	}
	
	public double getPayrate() {
		return payrate;
	}
	
	public void close() {
		try {
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
