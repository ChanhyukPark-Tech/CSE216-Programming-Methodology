package AdventureGame;

public class AdventureGame {

	public static void main(String[] args) {
		BasicRoom[] room = new BasicRoom[3];
		room[0] = new BasicRoom("Mango" , "Mango1");
		room[1] = new BasicRoom("fuck" , "fuck1");
		
		Explorer[] player = new Explorer[3];
		player[0] = new Explorer("chanhyuk " , "Mango1");
		player[1] = new Explorer("chasadadk " , "Mango1");
		
		
		System.out.println( room[0].enter(player[0]));		
		System.out.println(room[1].enter(player[0]));
		
		
	}

}
