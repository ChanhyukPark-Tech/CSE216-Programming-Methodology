import javax.swing.JOptionPane;

public class ComputeAverageModified {
	public static double computeAverage() {
		
		double total_points = 0.0;
		int count = 0;
		boolean processing = true;
		int score;
		while(processing) {
			String input = JOptionPane.showInputDialog("Type next exam score (or press Cancel to quit)");
			
			if (input == null) {
				processing = false ;
			} else {
				score = Integer.parseInt(input);
				total_points = total_points + score;
				count = count + 1 ;
				
				System.out.println("count : " + count + " total_points : " + total_points);
			       }
			
		}
		if ( count == 0 ) {
			throw new RuntimeException("error : no input supplied");		
		                  }
		return (total_points / count );

		
	}

	public static void main(String[] args) {
		System.out.println(computeAverage());
	}

}
