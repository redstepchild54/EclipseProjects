package practice;

public class Compund_Operators 
{

	public static void main(String[] args) 
	{
		int total = 0;
		total = total + 3;
		total = total + 2;
		total = total + 6;
		total += 3;
		total += 1;
		
		System.out.printf("Total: %d\n", total);
		
		double cash = 10;
		cash = cash - 3.5;
		cash -= 2;
		cash -= 2.7;
		
		System.out.printf("Cash left: $%.2f",  cash);
	}

}
