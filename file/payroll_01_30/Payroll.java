package payroll_01_30;

import javax.swing.JOptionPane;

public class Payroll {
	PayrollReader reader ; 
	PayrollWriter writer ;
	
	public Payroll(String in_file , String out_file ) {
		reader = new PayrollReader(in_file);
		writer = new PayrollWriter(out_file);
		while(reader.getNextRecord()) {
			int hours = reader.hours;
			double payrate = reader.payrate;
			double amount = hours * payrate ;
			writer.printCheck(reader.name, amount);
			
			
		}
		reader.close();
		writer.close();
		
		
		
	}
	
	public static void main(String[] args) {
		String s1 = JOptionPane.showInputDialog("infilename");
		String s2 = JOptionPane.showInputDialog("outfilename");
		
		new Payroll(s1 , s2);
		
	}

}
