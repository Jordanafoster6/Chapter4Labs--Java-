import java.util.Scanner;

public class phoneBillDemo2 {

	public static void main(String[] args) {
		
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
		
		if(character.equals("a") || character.equals("A"))
		{
			System.out.print("--------------------------------- \n");
			System.out.print("You selected: Package A \n");
			System.out.print("---------------------------------\n");
			System.out.printf("Megabytes Used: %d \n", bill1.getMin());
			System.out.printf("Package Total: $%,.2f \n", bill1.getPackageATotal());
			System.out.print("--------------------------------- \n");
			if(bill1.getPackageATotal() > bill1.getPackageBTotal())
			{
				System.out.printf("Package B Total: $%,.2f \n", bill1.getPackageBTotal());
				System.out.printf("Purchasing package B would have saved you: $%,.2f \n", (bill1.getPackageATotal() - bill1.getPackageBTotal()));
			}
			if(bill1.getPackageATotal() > bill1.getPackageCTotal())
			{
				System.out.printf("Package C Total: $%.2f \n", bill1.getPackageCTotal());
				System.out.printf("Purchasing package C would have saved you: $%,.2f \n", (bill1.getPackageATotal() - bill1.getPackageCTotal()));
			}
		}
		
		if(character.equals("b") || character.equals("B"))
		{
			System.out.print("--------------------------------- \n");
			System.out.print("You selected: Package B \n");
			System.out.print("---------------------------------\n");
			System.out.printf("Megabytes Used: %d \n", bill1.getMin());
			System.out.printf("Package Total: $%,.2f \n", bill1.getPackageBTotal());
			System.out.print("--------------------------------- \n");
			if(bill1.getPackageBTotal() > bill1.getPackageCTotal())
			{
				System.out.printf("Package C Total: $%,.2f \n", bill1.getPackageCTotal());
				System.out.printf("Purchasing package C would have saved you: $%,.2f \n", (bill1.getPackageBTotal() - bill1.getPackageCTotal()));
			}
		}
		
		if(character.equals("c") || character.equals("C"))
		{
			System.out.print("--------------------------------- \n");
			System.out.print("You selected: Package C \n");
			System.out.print("---------------------------------\n");
			System.out.printf("Megabytes Used: **unlimited minutes**) \n");
			System.out.printf("Total Cost: $%,.2f \n", bill1.getPackageCTotal());
			System.out.print("--------------------------------- \n");
		}
		keyboard.close();

	}

}
