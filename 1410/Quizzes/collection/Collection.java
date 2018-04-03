package collection;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Collection {

	public static void main(String[] args) {

		List<Character> letters = Arrays.asList('a', 'r', 'o', 'u', 'n', 'd');
		Collections.sort(letters, Collections.reverseOrder());
		System.out.println(letters);

		List<Character> letterss = Arrays.asList('a', 'r', 'o', 'u', 'n', 'd');
		Collections.reverse(letterss);
		System.out.println(letterss);
		

	}

}
