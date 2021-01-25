package AdventureGame;

public class Explore implements PlayerBehavior {
	
	String password;
	String my_name;
	RoomBehavior location;
	
	public Explore(String password , String name ) {
		this.password = password;
		this.my_name = name;
		location = null;
	}
	
	public String name() {
		return my_name;
		
	}
	
	public String speak() {
		return this.password;
	}
	
	public void exitRoom() {
		if(location != null ) {
			location.exit(this);
			location = null;
		}
	}
	
	public boolean explore(RoomBehavior r) {
		if(location != null) {
			exitRoom();			// exit current room to go to room r
		}
		boolean went_inside = r.enter(this);
			if(went_inside) {
				location = r;
			}
			return went_inside;
	}
	
	public RoomBehavior locationOf() {
		return location;
	}

}
