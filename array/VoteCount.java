import javax.swing.JOptionPane;

public class VoteCount {

	public static void main(String[] args) {
		int num_candidate = 4;
		int[] votes = new int[num_candidate];
		
		boolean processing = true;
		while(processing) {
			String s = JOptionPane.showInputDialog("type you wanna vote");
			int wanttovote = new Integer(s).intValue();
			if(wanttovote >=0 && wanttovote < 4) {
				votes[wanttovote] ++;
			} else {
				processing = false;
			}
		}
		
		for(int i=0 ; i<num_candidate ; i++) {
			System.out.println("기호" + i + "번 득표수는 " + votes[i] + "  표 입니다."); 
		}
	}

}
