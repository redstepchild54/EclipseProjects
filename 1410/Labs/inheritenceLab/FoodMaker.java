package inheritenceLab;

public class FoodMaker {

	public static void main(String[] args) {
		
		Fruit apple = new Fruit(10, 0, 15, true, true);

		System.out.println(apple.getCalroies());
		apple.rot();
		apple.fallOffTree();
		
	}

}
