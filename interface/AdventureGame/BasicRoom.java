package AdventureGame;

public class BasicRoom implements RoomBehavior{

		private PlayerBehavior occupant; // who is inside the room at the moment
		private String rooms_name;
		private String secret_word;		// the password for room
		
		
		public BasicRoom(String name , String password) {       // constructor 로 name , password
			rooms_name = name;
			secret_word = password;
		}
		
		public boolean enter(PlayerBehavior p) {
			boolean result = false;
			if(secret_word.equals(p.speak())) {					// 왜 null 지정해줘야함?
				occupant = p;
				return true;
				
			}
				return false;
		}
		
		public void exit(PlayerBehavior p) {
			if(occupant == p) {
				occupant = null;
			}
			
		}
		public PlayerBehavior occupantOf() {
			return occupant;
		}


}
