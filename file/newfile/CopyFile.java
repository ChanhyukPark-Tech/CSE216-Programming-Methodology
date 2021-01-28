package newfile;


import java.io.*;

import javax.swing.JFileChooser;

public class CopyFile {

	public static void main(String[] args) throws IOException {
		JFileChooser chooser = new JFileChooser();
		chooser.setDialogTitle("복사할 파일을 선택해주세요 ");
		
		int result = chooser.showDialog(null, "Copy");
		if(result !=chooser.APPROVE_OPTION) {
			System.exit(0);
		}
		
		String f = chooser.getSelectedFile().toString();
		BufferedReader infile = new BufferedReader(new FileReader(f));
		PrintWriter outfile = new PrintWriter(new FileWriter(f + ".txt"));
		
		while(infile.ready()) {
			outfile.print(infile.readLine());
		}
		infile.close();
		outfile.close();
		  
		
	}}
