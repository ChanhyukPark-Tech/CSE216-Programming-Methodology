package ScrollingList;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.List;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ListFrame extends JFrame { 		//�����ӿ� ����Ʈ�� ��ũ�� ó���ؼ� ���� �ְ� �Ʒ����� ��ư 2���� �������̴�! ok!
												//sp ���� ltem �̵��� �� item �� list �������
	private JList item;				// Not List but JList;
	private Counter2[] count;
	
	public ListFrame(Counter2[] model) {
		
		count = model;
		item = new JList(count);
		
		JScrollPane sp = new JScrollPane(item);
		
		Container cp = getContentPane();
		cp.setLayout(new GridLayout(2,1));
		cp.add(sp);
		
		JPanel p = new JPanel(new GridLayout(2,1));
		
		ListButton p1 = new ListButton("Go" , count , this);
		ExitButton p2 = new ExitButton("Exit button");
		p.add(p1); p.add(p2);
		cp.add(p); 
		update();
		
		
		setTitle("ListExample"); 
		
		pack();
		setVisible(true);
		
		
	}
	
	public int getSelection() {
		return item.getSelectedIndex();
	}
	
	public void update() {
		item.clearSelection();
	}
	
	
	
	
	

}
