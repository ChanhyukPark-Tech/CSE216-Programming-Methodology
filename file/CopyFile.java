package file;

import java.io.*;

import javax.swing.*;

public class CopyFile {

	public static void main(String[] args) throws IOException {
		JFileChooser chooser = new JFileChooser();			//JFileChooser 를 사용해서 입력대화상자 만듬
		chooser.setDialogTitle("choosing file which you wanna copy");
		int result = chooser.showDialog(null, "COPY");
		if(result != chooser.APPROVE_OPTION) {
			System.exit(0);
		}
		String f = chooser.getSelectedFile().toString();
		BufferedReader infile = new BufferedReader(new FileReader(f));
		PrintWriter outfile = new PrintWriter(new FileWriter(f + ".out"));
		while(infile.ready()) {
			outfile.println(infile.readLine());
		}
		infile.close();
		outfile.close();
		
		
	}

}
