package newfile;

import javax.swing.JOptionPane;

public class Payroll {
	
	public String in_file_name;
	public String out_file_name;
	static String name;
	static int hours;
	static double payrate;
	static double amount ;
	
	public static void main(String[] args) {
		String in_name = JOptionPane.showInputDialog("input");
		String out_name = JOptionPane.showInputDialog("output");
		
		if(in_name != null && out_name != null) {
			payrollprocess(in_name,out_name);
		}
		
	}

	public static void payrollprocess(String in , String out) {
		PayrollReader reader = new PayrollReader(in);
		PayrollWriter writer = new PayrollWriter(out);
		
		while(reader.getNextRecord()) {
			name = reader.getName();
			hours = reader.gethours();
			payrate = reader.getpayrate();
			amount = hours * payrate;
			writer.printCheck(name, amount);
		}
		
		reader.close();
		writer.close();
		
		
	}
}
