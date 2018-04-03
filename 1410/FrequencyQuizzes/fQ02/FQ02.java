package fQ02;

/*****************************************************
* newWord
* 
* Given 2 strings of even length, a and b, 
* return a new string made of the middle two characters of b 
* and the middle two characters of a, so "abcdef" and "wxyz" yields "xycd". 
* If either string has a length less than 2 use "@@" instead of the middle characters.
* 
* newWord("abcd", "ab") → "abbc"
* newWord("", "mnopqrst") → "pq@@"
* newWord("", "") → "@@@@"  
* 
* **************************************************/

public class FQ02 {

	public static String newWord(String a, String b) {
		String c;
		String d;
		
		if (a.length() < 2)
			c = "@@";
		else
			c = a.substring(a.length()/2 - 1, a.length()/2 + 1);
		if(b.length() < 2)
			d = "@@";
		else
			d = b.substring(b.length()/2 - 1, b.length()/2 + 1);
		
		return d + c; // TODO
	}

	
	
	public static void main(String[] args) {
		test("abcd", "ab", "abbc");		
		test("ijklmn", "opqrstuv", "rskl");
		test("", "mnopqrst", "pq@@");
		test("", "", "@@@@");
	}

	private static void test(String a, String b, String expectedResult) {
		String result = newWord(a, b);
		System.out.printf("newWord(%s, %s) -> %s .. %s%n",	a, b, result,
			(expectedResult.equals(result) ? "ok" : ("should be " + expectedResult)));
	}
}