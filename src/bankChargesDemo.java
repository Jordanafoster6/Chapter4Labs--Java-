import java.util.Scanner;

public class bankChargesDemo {

	public static void main(String[] args) 
	{
		String answer;
		char letter;
		
		Scanner keyboard = new Scanner(System.in);
		bankCharges account1 = new bankCharges();
		
		System.out.print("Have you paid your current monthly payment? (Y) or (N)");
		answer = (keyboard.nextLine());
		
		System.out.print("Whats your current account balance?");
		account1.setBalance(keyboard.nextDouble());

		letter = answer.charAt(0);
				
		if(letter == 'N' || letter == 'n')
		{
			account1.setMonthlyFee();
		}
		if(letter == 'Y' || letter == 'y')
		{
			System.out.println("Thank you for paying your bill on time.");
		}
		
		System.out.print("How many checks did you write this month?");
		account1.setChecksWritten(keyboard.nextDouble());
		
		System.out.println("----------------------------");
		System.out.printf("Number of Checks: %.0f \n", account1.getChecksWritten());
		System.out.printf("Check Fee: $%.2f \n", account1.getCheckFee());
		System.out.println("----------------------------");
		System.out.printf("Total Service Fee: $%.2f \n", account1.getServiceTotal());
		System.out.printf("Account Total: $%.2f \n", account1.getBalance());
		System.out.println("----------------------------");
	  
		keyboard.close();
	}
}
