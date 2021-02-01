package CopyFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFileChooser;
import javax.swing.JList;

public class CopyFile {
	
	
	
	

	public static void main(String[] args) throws Exception {
		
		JFileChooser chooser = new JFileChooser();
		chooser.setDialogTitle("chhosing file which you wanna copy");
		int result = chooser.showDialog(null, "copy");
		if(result != chooser.APPROVE_OPTION) {
			System.exit(0);
		}
		String f = chooser.getSelectedFile().toString();
		BufferedReader infile = new BufferedReader(new FileReader(f));
		PrintWriter outfile = new PrintWriter(new FileWriter(f + ".txt"));
				
		while(infile.ready()) {
			outfile.println(infile.readLine());
		}
		
		infile.close();
		outfile.close();
		
		
		
	}

}
