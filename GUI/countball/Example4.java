package GUI;

public class Example4 {

	public static void main(String[] args) {
		Counter model = new Counter(0);
		Drawing drawing = new Drawing(model);
		Frame4 view = new Frame4(model,drawing);
		
	}

}
