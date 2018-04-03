package printReverse;

public class PrintReverse {
	
	private static void printRev (String str)
	{
		for (int i = str.length(); i>0; i--)
		{
			System.out.printf("%c", str.charAt(i-1));
		}
	}

	public static void main(String[] args) {
		printRev("Bill");
		StringBuilder sb = new StringBuilder();
		
		sb.append("Hello");
		System.out.print(sb.capacity());
	}

}
