
public class Box2 {
	int Box_size;
	
	public Box2(int size) {
		this.Box_size = size;          // size �޾Ƽ� �ʱ�ȭ box �� ���� �ʱ�����ڴ� size �� ������� ���ٸ� ���� ���� ����
	}
//	boolean x_collision = false;
//	boolean y_collision = false;
																// �׳� return false return true �� �ص������� ��������� collision �̶�� boolean type ����
//	public boolean inHorizontalContact(int x_position) {		// x,y ���� ȭ�鿡�� �������� ó�����༭ collision �� true or false �� ��ȯ
//		if(x_position <= 0 || x_position >= this.Box_size -5) { 		// ���� �� �� method�� boolean ������ ��ȯ�޾Ƽ� moving ball ���� container��ü������
//			x_collision = true;									// �� boolean(collision) ���� true ��� �ӵ��� ��ȣ�� �ٲ��ִ� �������� 
//			return x_collision;
//		} return x_collision;
//	}
//
//	public boolean inVerticalContact(int y_position) {
//		if(y_position <= 0 || y_position >= this.Box_size - 5) {
//			y_collision = true;
//			return y_collision;
//	} return y_collision;
//}
	 public boolean inHorizontalContact(int x_position) // ���̽� ���Ӹ���� 
	  { return (x_position <= 0 ) || (x_position >= this.Box_size -5); }
	 // �ε����� ? 

	  /** inVerticalContact replies whether a position has contacted a
	    *  vertical wall.
	    * @param y_position - the position examined
	    * @return true, if  y_position  equals or exceeds the positions of the
	    *   vertical walls; return false, otherwise  */
	  public boolean inVerticalContact(int y_position)
	  { return (y_position <= 0 ) || (y_position >= this.Box_size - 5); }
	
	public int sizeOf() {
		return this.Box_size;
	}
}
