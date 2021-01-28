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

public class ListFrame extends JFrame { 		//프레임에 리스트를 스크롤 처럼해서 위에 넣고 아래에는 버튼 2개를 넣을것이다! ok!
												//sp 에는 ltem 이들어간다 그 item 은 list 에서얻고
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
