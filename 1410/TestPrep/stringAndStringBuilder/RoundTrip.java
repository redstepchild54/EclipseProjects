package stringAndStringBuilder;

public class RoundTrip {
	public static void main(String[] args) {
		
		String[] cities = {"Berlin", "Weimar", "Heidelberg", "Muenchen"};
		
		StringBuilder sb = new StringBuilder();
		
		int count = 1;
		
		for (String el : cities)
		{
			sb.append(el);
			if (count != cities.length)
				sb.append(" To ");
			count++;
		}
		System.out.println(sb);
	}
}
