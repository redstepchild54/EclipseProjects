package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ExampleGenerics {

	public static void main(String[] args) {
		Set<Square> squareSet = new HashSet<>(Arrays.asList(new Square(1), 
				new Square(2), new Square(2), new Square(3), new Square(3), new Square(3)));
		System.out.println("squareSet: " + squareSet);
		
		List<Square> squareList = new ArrayList<>(Arrays.asList(new Square(1), 
				new Square(2), new Square(2), new Square(3), new Square(3), new Square(3)));
		System.out.println("original squareList: "  + squareList);
		
		
		List<Square> squareList2 = new ArrayList<>();
		for (Square el: squareList)
			squareList2.add(el);
		
		int j;
		for (int i = 0; i < squareList.size(); i++)
		{
			j = i+2;
			if(j >= squareList.size())
				j -= squareList.size();
			
			squareList.set(i, squareList2.get(j));
		}
		
		System.out.println();
		System.out.println("Rotated List: " + squareList);
		System.out.println();
		
		System.out.println("Are the second and third list elements equal?");
		
		if(squareList.get(1).equals(squareList.get(2)))
			System.out.println("Yes");
		
		System.out.printf("%-8s","Decimal:");
		for (Square el: squareList)
			System.out.printf("%-3d", el.getSide());
		System.out.println();
		
		System.out.printf("%-8s", "Binary:");
		for (Square el: squareList)
			System.out.printf("%-3s", Integer.toBinaryString(el.getSide()));
		System.out.println();
	}
}
