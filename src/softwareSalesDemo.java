import java.util.Scanner;

public class softwareSalesDemo {

	public static void main(String[] args) 
	{
		
		Scanner keyboard = new Scanner(System.in);
		softwareSales sale1 = new softwareSales();
		
		System.out.print("Enter how many units of software were sold.");
		sale1.setUnitsSold(keyboard.nextDouble());
		
		System.out.println("----------------------------");
		System.out.printf("Number of units sold: %.0f \n", sale1.getUnitsSold());
		System.out.printf("Total Cost: $%.2f \n", sale1.getTotalCost());
		System.out.println("----------------------------");

		
		
	}
}