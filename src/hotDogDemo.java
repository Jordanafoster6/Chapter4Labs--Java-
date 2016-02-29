import java.util.Scanner;

public class hotDogDemo {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		hotDog hot1 = new hotDog();
		
		System.out.print("Enter the number of people attending.");
		hot1.setAttendees(keyboard.nextInt());
		
		System.out.print("Enter the number of hotdogs each person gets.");
		hot1.setHotDogs(keyboard.nextInt());
		keyboard.nextLine();
		
		System.out.println("----------------------------");
		System.out.printf("Minimum # of Hotdog Packages: %d \n", hot1.miniHotDog());
		System.out.printf("Minimum # of Bun Packages: %d \n", hot1.miniBuns());
		System.out.printf("# of Hotdogs Left Over: %d \n", hot1.dogsLeft());
		System.out.printf("# of Buns Left Over: %d \n", hot1.bunsLeft());
		System.out.println("----------------------------");
		keyboard.close();
		

	}

}
