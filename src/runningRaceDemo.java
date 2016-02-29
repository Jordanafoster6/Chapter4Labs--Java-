import java.util.Scanner;

public class runningRaceDemo {

	public static void main(String[] args) 
	{
		
		Scanner keyboard = new Scanner(System.in);
		runningRace runner1 = new runningRace();
		
		System.out.print("Enter first runner name.");
		runner1.setName(keyboard.nextLine());
		
		System.out.print("Enter first runner time in minutes.");
		runner1.setTime(keyboard.nextInt());
		keyboard.nextLine();
		
		runningRace runner2 = new runningRace();
		
		System.out.print("Enter second runner name.");
		runner2.setName(keyboard.nextLine());
		
		System.out.print("Enter second runner time in minutes.");
		runner2.setTime(keyboard.nextInt());
		keyboard.nextLine();
		
		runningRace runner3 = new runningRace();
		
		System.out.print("Enter third runner name.");
		runner3.setName(keyboard.nextLine());
		
		System.out.print("Enter third runner time in minutes.");
		runner3.setTime(keyboard.nextInt());
		keyboard.nextLine();
	
			if(runner1.getTime() < runner2.getTime() && runner1.getTime() < runner3.getTime() && runner2.getTime() < runner3.getTime())
			{
				System.out.println("----------------------------");
				System.out.printf("First Place: %s Time: %d \n", runner1.getName(), runner1.getTime());
				System.out.printf("Second Place: %s Time: %d \n", runner2.getName(), runner2.getTime());
				System.out.printf("Third Place: %s Time: %d \n", runner3.getName(), runner3.getTime());
				System.out.println("----------------------------");
			}
			else if(runner1.getTime() < runner2.getTime() && runner1.getTime() < runner3.getTime() && runner3.getTime() < runner2.getTime())
			{
				System.out.println("----------------------------");
				System.out.printf("First Place: %s Time: %d \n", runner1.getName(), runner1.getTime());
				System.out.printf("Second Place: %s Time: %d \n", runner3.getName(), runner3.getTime());
				System.out.printf("Third Place: %s Time: %d \n", runner2.getName(), runner2.getTime());
				System.out.println("----------------------------");
			}
			else if(runner2.getTime() < runner1.getTime() && runner2.getTime() < runner3.getTime() && runner1.getTime() < runner3.getTime())
			{
				System.out.println("----------------------------");
				System.out.printf("First Place: %s Time: %d \n", runner2.getName(), runner2.getTime());
				System.out.printf("Second Place: %s Time: %d \n", runner1.getName(), runner1.getTime());
				System.out.printf("Third Place: %s Time: %d \n", runner3.getName(), runner3.getTime());
				System.out.println("----------------------------");
			}
			else if(runner2.getTime() < runner1.getTime() && runner2.getTime() < runner3.getTime() && runner3.getTime() < runner1.getTime())
			{
				System.out.println("----------------------------");
				System.out.printf("First Place: %s Time: %d \n", runner2.getName(), runner2.getTime());
				System.out.printf("Second Place: %s Time: %d \n", runner3.getName(), runner3.getTime());
				System.out.printf("Third Place: %s Time: %d \n", runner1.getName(), runner1.getTime());
				System.out.println("----------------------------");
			}
			else if(runner3.getTime() < runner1.getTime() && runner3.getTime() < runner2.getTime() && runner2.getTime() < runner1.getTime())
			{
				System.out.println("----------------------------");
				System.out.printf("First Place: %s Time: %d \n", runner3.getName(), runner3.getTime());
				System.out.printf("Second Place: %s Time: %d \n", runner2.getName(), runner2.getTime());
				System.out.printf("Third Place: %s Time: %d \n", runner1.getName(), runner1.getTime());
				System.out.println("----------------------------");
			}
			else if(runner3.getTime() < runner1.getTime() && runner3.getTime() < runner2.getTime() && runner1.getTime() < runner2.getTime())
			{
				System.out.println("----------------------------");
				System.out.printf("First Place: %s Time: %d \n", runner3.getName(), runner3.getTime());
				System.out.printf("Second Place: %s Time: %d \n", runner1.getName(), runner1.getTime());
				System.out.printf("Third Place: %s Time: %d \n", runner2.getName(), runner2.getTime());
				System.out.println("----------------------------");
			}
			
	}
	
}
