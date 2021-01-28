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
		
		edit.add(search);				// search �� edit �ȿ� �־��شٴ°��� �߿��ϴ� 
		mbar.add(edit);					// �׸��� �������� mbar.add(edit); ( search ���� �߰��� �Ŀ�)
		
		setJMenuBar(mbar);				// attach menu bar to frame  window �� ������ �ʼ��۾�
		
		JScrollPane sp = new JScrollPane(buffer);			// not bar but pane
		cp.add(sp,BorderLayout.CENTER);
		setTitle("EditFrame");				// �� set 3�ܰ� �������� 
		pack();								// �˾Ƽ� ���빰�� �°� ũ������
		setVisible(true);
	}
}
