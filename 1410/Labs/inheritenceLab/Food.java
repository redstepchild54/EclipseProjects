package inheritenceLab;

public class Food {

	private int calroies;
	private int fat;
	private int carbs;
	private int protein;

	public Food(int calroies, int fat, int carbs, int protein) {
		this.calroies = calroies;
		this.fat = fat;
		this.carbs = carbs;
		this.protein = protein;
	}

	public int getCalroies() {
		return calroies;
	}

	public void setCalroies(int calroies) {
		this.calroies = calroies;
	}

	public int getFat() {
		return fat;
	}

	public void setFat(int fat) {
		this.fat = fat;
	}

	public int getCarbs() {
		return carbs;
	}

	public void setCarbs(int carbs) {
		this.carbs = carbs;
	}

	public int getProtein() {
		return protein;
	}

	public void setProtein(int protein) {
		this.protein = protein;
	}

	public void rot() {
		System.out.println("I'm dying!");
	}

	public void ripen() {
		System.out.println("I'm Still Alive");
	}
}
