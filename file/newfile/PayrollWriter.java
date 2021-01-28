package newfile;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PayrollWriter {
	private PrintWriter outfile;
	
	public PayrollWriter(String file_name) {
		try {
			outfile = new PrintWriter(new FileWriter(file_name));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public void printCheck(String name , double amount) {
		outfile.println(name + " " + amount);
		System.out.println(name + " " + amount);
		
	}
	
	public void close() {
		outfile.close();
	}
	
}
