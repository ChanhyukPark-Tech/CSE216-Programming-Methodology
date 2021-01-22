import javax.swing.JOptionPane;
// VoteCount tallies the votes for election candidates.
// input : a sequence of votes, terminated by a -1
// output : the listing of the candidates and their tallied votes 
public class VoteCount {

	public static void main(String[] args) {
		int num_candidates = 4;                       // how many candidates
		int[] votes = new int[num_candidates]; 	      // holds the votes;
													  // recall that each element is initialized to 0
//		collect the votes:
		
		boolean processing = true;
		while(processing) { 
			int v = new Integer(JOptionPane.showInputDialog("Vote for (0,1,2,3)")).intValue();
			
			if( v >= 0 && v < votes.length) {
				votes[v] = votes[v] + 1 ;
			}
			else { processing = false;}
		}
//		print the totals:
		
		for( int i = 0; i != votes.length; i ++ ) {
			System.out.println("Candidate " + i + " has " + votes[i] + " votes ");
		}
		
	}}