package Edit;

import java.awt.*;
import javax.swing.*;

public class EditFrame extends JFrame{
	 // the EditModel, a subclass of JTextArea, is the ``model'' for the frame:
	private EditModel buffer = new EditModel("" , 15 ,15);       // "" what means ?
	
	public EditFrame() {
		ReplaceFrame second_frame = new ReplaceFrame(buffer);
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		JMenuBar mbar = new JMenuBar();
		
		JMenu file = new JMenu("file");
		file.add(new ClearMenuItem("NEW", buffer));
		file.add(new QuitMenuItem("exit"));
		mbar.add(file);					// attach menu to menu bar;
		
		JMenu edit = new JMenu("Edit");
		edit.add(new CutMenuItem("Cut", buffer));
		edit.add(new CopyMenuItem("Copy", buffer));
		edit.add(new PasteMenuItem("Paste" , buffer));
		
		
		edit.addSeparator(); // ------------------------------------------------
		
		JMenu search = new JMenu("Search"); // defines the "Search" submenu
		search.add(new FindMenuItem("Find" , buffer ));
		search.add(new ReplaceMenuItem("Replace" , second_frame));
		
		edit.add(search);				// search 를 edit 안에 넣어준다는것이 중요하다 
		mbar.add(edit);					// 그리고 마지막에 mbar.add(edit); ( search 까지 추가한 후에)
		
		setJMenuBar(mbar);				// attach menu bar to frame  window 에 붙히기 필수작업
		
		JScrollPane sp = new JScrollPane(buffer);			// not bar but pane
		cp.add(sp,BorderLayout.CENTER);
		setTitle("EditFrame");				// 이 set 3단계 마지막에 
		pack();								// 알아서 내용물에 맞게 크기조정
		setVisible(true);
	}
}
