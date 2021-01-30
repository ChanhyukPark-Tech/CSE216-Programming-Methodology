package NewScrollingList;

import java.awt.*;

import javax.swing.*;

public class ListFrame extends JFrame{
	
	private Counter[] model;	
	private JList items;
		
	public ListFrame(Counter[] model) {
		this.model = model ;
		items = new JList(model);				// ���⼭ model �� Counter �����̹Ƿ� toString �ڵ�����
												// toString �� ����ǰ� ����ü�� Jlist �� ������ 
		
		JScrollPane sp = new JScrollPane(items);
		Container cp = getContentPane();
		cp.setLayout(new GridLayout(2,1));
		
		cp.add(sp);
		
		JPanel p = new JPanel(new GridLayout(2,1));
		p.add(new ListButton("Go" , model , this));
		p.add(new ExitButton("Exit"));
		
		cp.add(p);
		
		update(); // initialize the view of the list
		
		setTitle("ListExample");
		pack();
		setVisible(true);
	}
	
	public int getSelection() {
		return items.getSelectedIndex();
		
	}
	
	public void update() {
		items.clearSelection();
	}
	
	
}
