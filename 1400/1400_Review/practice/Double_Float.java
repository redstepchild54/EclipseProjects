package practice;
import java.util.Scanner;

public class Double_Float 
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Number1: ");
		double number1 = input.nextDouble();
		
		System.out.print("Number2: ");
		float number2 = input.nextFloat();
		
		System.out.printf("number1: %.2f%n", number1);
		System.out.printf("number2: %.2f%n", number2);
	}

}
