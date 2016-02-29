import java.util.Scanner;

public class timeCalculator {

	public static void main(String[] args) 
	{
		
		Scanner keyboard = new Scanner(System.in);
		
		int numMin = 0;
		int numSec = 0;
		int numHour = 0;
		int numDay = 0;
		
		System.out.print("Enter a number of seconds.");
		int userSeconds = keyboard.nextInt();
		
		
		
		if(userSeconds < 60)
		{
			System.out.println("The number of seconds you entered is less than 1 minute.");
		}
		else if(userSeconds >= 60 && userSeconds < 3600)
		{
			numMin = userSeconds / 60;
			numSec = userSeconds % 60;
			System.out.println("You entered " + userSeconds + " seconds.. Which is equivelant to " + numMin + " minutes and " + numSec + " seconds.");
		}
		else if(userSeconds >= 3600 && userSeconds < 86400)
		{
			numHour = userSeconds / 3600;
			System.out.println("You entered " + userSeconds + " seconds.. Which is equivelant to " + numHour + " hours.");
		}
		else if(userSeconds >= 86400)
		{
			numDay = userSeconds / 86400;
			System.out.println("You entered " + userSeconds + " seconds.. Which is equivelant to " + numDay + " days.");
		}
		
		
	}
		
}
