package AdventureGame;

public class Explorer implements PlayerBehaviour {
	private String name , secret_word;
	private RoomBehaviour where_I_am;
	
	public Explorer(String n , String w) {
		name = n ; 
		secret_word = w;
		where_I_am = null;
	}
	
	public String speak() {
		return secret_word;
	}
	
	public void exitRoom() {
		if(where_I_am != null) {
			where_I_am.exit(this);
			where_I_am = null ;
		}
	}
	
	public boolean explore(RoomBehaviour r) {
		if(where_I_am !=null) exitRoom();
		boolean went_inside = r.enter(this);
		if(went_inside) {
			where_I_am = r;
		}
		return went_inside;
	}
	public RoomBehaviour locationOf() {
		return where_I_am;
	}
}
