import javax.swing.*;

public class ComputeAverage {
	public static double computeAverage(int how_many) {
		
		double total_points = 0.0; //����
		int count = 0;  // �󸶳� �о���? ���� ī����
		while (count < how_many)
		// �� �ݺ����� ������ �����Ѵ�. ���� �Һ��� (loop invariant)
		// total_score == exam_1 + exam_2 + ... + exam_count
		{
			//���������� �Է� �޴´�
			String input = JOptionPane.showInputDialog("Type next exam score: ");
			int score = Integer.parseInt(input);
			total_points = total_points + score;
			count = count + 1;
			//���� ����� �μ�
			System.out.println("count = " + count + " total_points " + total_points);
		}
		return (total_points / how_many);
	}

	public static void main(String[] args) {
		System.out.println(computeAverage(3));
	}

}
