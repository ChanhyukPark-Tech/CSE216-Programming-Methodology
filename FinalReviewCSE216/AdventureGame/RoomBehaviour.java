package AdventureGame;

public interface RoomBehaviour {
	public boolean enter(PlayerBehaviour p);
	public void exit(PlayerBehaviour p);
	public PlayerBehaviour occupantOf();
	
}
