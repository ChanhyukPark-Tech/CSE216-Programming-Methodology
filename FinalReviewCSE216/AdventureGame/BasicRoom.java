package AdventureGame;

public class BasicRoom implements RoomBehaviour {
	private PlayerBehaviour occupant;
	private String rooms_name;
	private String secret_word;
	
	public BasicRoom(String name , String word) {
		occupant = null ;
		rooms_name = name;
		secret_word = word;
	}
	
	public boolean enter(PlayerBehaviour p) {
		if(occupant == null && secret_word.equals(p.speak())){
			occupant = p ;
			return true ;
			
		}
			return false; 		
	}
	
	public void exit(PlayerBehaviour p) {
		if(occupant == p) {
			occupant = null;
		}
	}
	
	public PlayerBehaviour occupantOf()
	{
		return occupant;
	}
}
