package NewEditor;

import java.awt.*;
import javax.swing.*;

public class EditFrame extends JFrame {
	
	private EditModel model = new EditModel("" , 15 , 50);
	public EditFrame() {
		
		ReplaceFrame second_frame = new ReplaceFrame(model);
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		JMenuBar mbar = new JMenuBar();
		JMenu file = new JMenu("File");
		file.add(new ClearMenuItem("New ", model));
		file.add(new QuitMenuItem("Quit"));
		mbar.add(file);
		
		JMenu edit = new JMenu("Edit");
		edit.add(new CutMenuItem("Cut" , model));
		edit.add(new CopyMenuItem("Copy" , model));
		edit.add(new PastMenuItem("Paste" , model));
		
		edit.addSeparator();
		
		JMenu search = new JMenu("search");
		search.add(new FindMenuItem("Find" , model));
		search.add(new ReplaceMenuItem("Replace" ,  second_frame));
		
		edit.add(search);
		
		mbar.add(edit);
		setJMenuBar(mbar);
		
		JScrollPane sp = new JScrollPane(model);  		// text창에 scroll 달기
		cp.add(sp , BorderLayout.CENTER);
		setTitle("EditFrame");  pack(); setVisible(true);
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		new EditFrame();
		
	}

}
