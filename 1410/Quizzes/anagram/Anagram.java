package anagram;

public class Anagram {
	private static void printAnagram(String prefix, String word)
	{
		if(word.length()<=1)
		{
			System.out.println(prefix+word);
		}
		else
		{
			printAnagram(prefix+word.charAt(0), word.substring(1));
		}
	}

}
