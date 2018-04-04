package exceptionLab;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LabExceptionHandilng
{
	public static void main(String[] args)
	{
		try
		{
			int digit = numberFromUser();
			int result = sevenModulusN(digit);
			System.out.printf("7 %% %d = %d", digit, result);
		}
		catch(Exception e)
		{
			System.out.println("A problem Occured. " + e.getMessage());
			System.out.println();
		}
	}

	private static int numberFromUser()
	{
		Scanner input = new Scanner(System.in);
		boolean loopFinished = false;
		int returnValue = 0;
		do
		{
			try
			{
				System.out.print("number: ");
				returnValue = input.nextInt();
				loopFinished = true;
			}
			catch (InputMismatchException e)
			{
				input.nextLine();
				System.out.println("ERROR: Please enter an Integer.\n");
			}
		} while(!loopFinished);
		return returnValue;
	}

	private static int sevenModulusN(int number)
	{
		if(number == 0)
			throw new IllegalArgumentException("Can't calculate 7 % 0.");
		return 7 % number;
	}
}
