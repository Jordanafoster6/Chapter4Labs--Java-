import java.util.Scanner;

public class phoneBillDemo {

	public static void main(String[] args) 
	{
		
		Scanner keyboard = new Scanner(System.in);
		phoneBill bill1 = new phoneBill();
		
		System.out.print("Enter the letter of the phone package you subscribed to. \n");
		System.out.print("-------------------------- \n");
		System.out.print("Package | Letter to Enter \n");
		System.out.print("--------------------------\n");
		System.out.print("Package A:      A  \n");
		System.out.print("Package B:      B  \n");
		System.out.print("Package C:      C  \n");
		System.out.print("-------------------------- \n");
		String character = keyboard.nextLine();
		
		bill1.setPackageLetter(character.charAt(0));
		
		System.out.print("Enter the number of minutes you used this month. \n");
		bill1.setMin(keyboard.nextInt());
		
		System.out.print("--------------------------------- \n");
		System.out.printf("The package you selected was: Package %S \n", character);
		System.out.print("---------------------------------\n");
		System.out.printf("Minutes: %d \n", bill1.getMin());
		System.out.printf("Total: $%.2f \n", bill1.getTotal());
		System.out.print("--------------------------------- \n");
		
		keyboard.close();
	
	}
}
