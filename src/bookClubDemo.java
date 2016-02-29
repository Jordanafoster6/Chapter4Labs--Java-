import java.util.Scanner;

public class bookClubDemo {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		bookClub book1 = new bookClub();
		
		System.out.print("Enter the number of books you purchased.");
		book1.setBookNum(keyboard.nextInt());
		keyboard.nextLine();
		
		System.out.println("----------------------------");
		if(book1.getBookNum() == 0)
		{
			System.out.println("You earned 0 points.");
		}
		else if(book1.getBookNum() == 1)
		{
			System.out.println("You earned 5 points.");
		}
		else if(book1.getBookNum() == 2)
		{
			System.out.println("You earned 15 points.");
		}
		else if(book1.getBookNum() == 3)
		{
			System.out.println("You earned 30 points.");
		}
		else if(book1.getBookNum() >= 4)
		{
			System.out.println("You earned 60 points.");
		}
		System.out.println("----------------------------");
		keyboard.close();
	}

}
