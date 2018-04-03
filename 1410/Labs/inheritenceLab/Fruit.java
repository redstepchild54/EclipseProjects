package inheritenceLab;

public class Fruit extends PlantBased{

	public boolean isTreeFruit;
	public boolean isSweet;
	
	public Fruit(int calroies, int fat, int carbs, boolean isTreeFruit, boolean isSweet) {
		super(calroies, fat, carbs, 0);
		this.isTreeFruit = isTreeFruit;
		this.isSweet = isSweet;
	}

	@Override
	public void rot()
	{
		System.out.println("I'm just more ripe now!");
	}
	
	public void fallOffTree()
	{
		System.out.println("Ouch!");
	}

	public boolean isTreeFruit() {
		return isTreeFruit;
	}

	public void setTreeFruit(boolean isTreeFruit) {
		this.isTreeFruit = isTreeFruit;
	}

	public boolean isSweet() {
		return isSweet;
	}

	public void setSweet(boolean isSweet) {
		this.isSweet = isSweet;
	}
	
	

}
