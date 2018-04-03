package review;

import java.util.ArrayList;

public class ArrayListReview 
{
	public static void main(String[] args) 
	{
		ArrayList<String> fruit = new ArrayList<String>();

		fruit.add("apple");
		fruit.add("pear");
		fruit.add("orage");
		fruit.add(1,"grape");
		
		fruit.remove("apple");
		
		boolean containskiwi = fruit.contains("kiwi");
		System.out.println(containskiwi);
		
		int indexApple = fruit.indexOf("pear");
		System.out.println(indexApple);
		
		System.out.println(fruit);
		
		fruit.clear();
		System.out.println(fruit);
		
		
	}
}
