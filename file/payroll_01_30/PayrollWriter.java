package payroll_01_30;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PayrollWriter {
	
	private PrintWriter writer; 
//	private String name;
//	private double amount;
	
	public PayrollWriter(String outfile_name) {
		try {
			writer = new PrintWriter(new FileWriter(outfile_name));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void printCheck(String name , double amount ) {
		
		writer.println(name + " : "  + amount);
		System.out.println(name + " : "  + amount);
		
	}
	
	public void close() {
		writer.close();
	}
	
	

}
