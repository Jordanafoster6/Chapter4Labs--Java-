import java.util.Scanner;

public class romanNumerals {

	public static void main(String[] args) 
	{
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a number between 1 and 10.");
		int userNum = keyboard.nextInt();
		
		if(userNum == 1)
		{
			System.out.println("I");
		}
		else if(userNum == 2)
		{
			System.out.println("II");
		}
		else if(userNum == 3)
		{
			System.out.println("III");
		}
		else if(userNum == 4)
		{
			System.out.println("IV");
		}
		else if(userNum == 5)
		{
			System.out.println("V");
		}
		else if(userNum == 6)
		{
			System.out.println("VI");
		}
		else if(userNum == 7)
		{
			System.out.println("VII");
		}
		else if(userNum == 8)
		{
			System.out.println("VIII");
		}
		else if(userNum == 9)
		{
			System.out.println("IX");
		}
		else if(userNum == 10)
		{
			System.out.println("X");
		}
		else
		{
			System.out.println("You have not entered a number between 1 and 10.");
		}
		
	}
		
}
