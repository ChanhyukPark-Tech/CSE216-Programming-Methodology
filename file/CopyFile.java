import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class CopyFile {
	public CopyFile() throws IOException {
		
		JFileChooser chooser = new JFileChooser();
		chooser.setDialogTitle("원하시는 복사파일 " );
		
		int result =  chooser.showDialog(null  , "Copy");
		if(result != chooser.APPROVE_OPTION) {
			System.exit(0);
		} else {
			String s = chooser.getSelectedFile().toString();
			BufferedReader infile = new BufferedReader(new FileReader(s));
			PrintWriter outfile = new PrintWriter(new FileWriter(s + ".txt"));
			while(infile.ready()) {
				outfile.println(infile.readLine());
			}
			
			infile.close();
			outfile.close();
		}
		
	}

	public static void main(String[] args) throws IOException {
		new CopyFile();
		
	}

}
