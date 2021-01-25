package AdventureGame;

public class AdventureGame {

	public static void main(String[] args) {
		RoomBehavior[] room = new RoomBehavior[3];
		PlayerBehavior[] player = new PlayerBehavior[3];
		
		room[0] = new BasicRoom("mango", "iphone");
		room[1] = new BasicRoom("manko", "iphone");
		room[2] = new BasicRoom("manco", "seonkyo");
		
		player[0] = new Explore("seonkyo" , " this i s m y name");
		
		
//		Explore seonkyo = new Explore("seonkyo" , "seonkyo");
		
		
		boolean success = player[0].explore(room[2]);
		System.out.println(success);
//		if(success) {
//			System.out.println(seonkyo.name() + "님이 입장하였습니다 " + seonkyo.locationOf());
//		}
	}

}
