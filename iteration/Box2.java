
public class Box2 {
	int Box_size;
	
	public Box2(int size) {
		this.Box_size = size;          // size 받아서 초기화 box 가 같는 초기생성자는 size 만 받으면됌 별다른 받을 것이 없음
	}
//	boolean x_collision = false;
//	boolean y_collision = false;
																// 그냥 return false return true 로 해도되지만 명시적으로 collision 이라는 boolean type 지정
//	public boolean inHorizontalContact(int x_position) {		// x,y 각각 화면에서 나갈때를 처리해줘서 collision 을 true or false 로 반환
//		if(x_position <= 0 || x_position >= this.Box_size -5) { 		// 지금 이 두 method를 boolean 값으로 반환받아서 moving ball 에서 container객체를통해
//			x_collision = true;									// 이 boolean(collision) 값이 true 라면 속도의 부호를 바꿔주는 역할을함 
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
	 public boolean inHorizontalContact(int x_position) // 파이썬 게임만들기 
	  { return (x_position <= 0 ) || (x_position >= this.Box_size -5); }
	 // 부딪혓나 ? 

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
