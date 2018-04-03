package wrapperClassGuiLab;

public class DemoWrapperClass {
	
	public String minMax()
	{
		StringBuilder sb = new StringBuilder();
		
		sb.append("Byte:\n");
		sb.append("Min: "+ Byte.MIN_VALUE + "\n");
		sb.append("Max: " + Byte.MAX_VALUE + "\n");
		
		sb.append("\n");
		
		sb.append("Short:\n");
		sb.append("Min: "+ Short.MIN_VALUE + "\n");
		sb.append("Max: " + Short.MAX_VALUE + "\n");
		
		sb.append("\n");
		
		sb.append("Integer:\n");
		sb.append("Min: "+ Integer.MIN_VALUE + "\n");
		sb.append("Max: " + Integer.MAX_VALUE + "\n");
		
		sb.append("\n");
		
		sb.append("Long:\n");
		sb.append("Min: "+ Long.MIN_VALUE + "\n");
		sb.append("Max: " + Long.MAX_VALUE + "\n");
		
		return sb.toString();
	}
	
	public String toBinary(int number)
	{
		StringBuilder sb = new StringBuilder();
		
		sb.append("Binary: " + Integer.toBinaryString(number) + "\n");
		sb.append("Octal : " + Integer.toOctalString(number) + "\n");
		sb.append("Hex   : " + Integer.toHexString(number) + "\n");
		
		return sb.toString();
	}
	
	public String charProperties(char c)
	{
		StringBuilder sb = new StringBuilder();
		
		sb.append("White space: " + Boolean.toString(Character.isWhitespace(c)) + "\n");
		sb.append("Digit: " + Boolean.toString(Character.isDigit(c)) + "\n");
		sb.append("Letter: ");
		if (Character.isLetter(c))
			if (Character.isUpperCase(c))
				sb.append(c + "|" + Character.toLowerCase(c));
			else
				sb.append(c + "|" + Character.toUpperCase(c));
		else
			sb.append("False");	
		sb.append("\n");
		
		return sb.toString();
	}

}
