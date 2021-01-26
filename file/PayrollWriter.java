package file;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PayrollWriter {
	PrintWriter outfile;
	
	public PayrollWriter(String name) {
		try {
			outfile = new PrintWriter(new FileWriter(name));
		} catch (IOException e) {
			System.out.println("writer error ");
			throw new RuntimeException(e.toString());
		}
	}
	
	public void printCheck(String name , double amount ) {
		outfile.println(name + " " + amount );
		System.out.println(name + " " + amount );
	}
	
	public void close() {
		outfile.close();
	}
}
