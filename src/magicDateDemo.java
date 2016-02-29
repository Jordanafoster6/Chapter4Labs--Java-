import java.util.Scanner;

public class magicDateDemo {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		magicDate magic1 = new magicDate();
		
		System.out.print("Enter a month.(1-12)");
		magic1.setMonth(keyboard.nextInt());
		
		System.out.print("Enter a day.(1-31)");
		magic1.setDay(keyboard.nextInt());
		
		System.out.print("Enter a year.(yy)");
		magic1.setYear(keyboard.nextInt());
		
		System.out.println("----------------------------");
		if(magic1.isMagic() == true)
		{
			System.out.printf("The date you entered is a magic number! \n");
		}
		else
		{
			System.out.printf("The date you entered is NOT a magic number... \n");
		}
		System.out.println("----------------------------");
		
		

	}

}
