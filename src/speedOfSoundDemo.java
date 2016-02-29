import java.util.Scanner;

public class speedOfSoundDemo {

	public static void main(String[] args) 
	{
		
		Scanner keyboard = new Scanner(System.in);
		speedOfSound speed1 = new speedOfSound();
		
		System.out.print("Enter the what type of matter the sound is traveling through. \n");
		System.out.print("---------------- \n");
		System.out.print("Air \n");
		System.out.print("Water \n");
		System.out.print("Steel \n");
		System.out.print("---------------- \n");
		String matter = keyboard.nextLine();
		
		System.out.print("Enter the distance the sound is traveling.");
		speed1.setDistance(keyboard.nextInt());
		
		if(matter.equals("air") || matter.equals("Air") || matter.equals("AIR"))
		{
			System.out.printf("Time to travel distance: %d seconds.", speed1.getSpeedAir());			
		}
		
		else if(matter.equals("water") || matter.equals("Water") || matter.equals("WATER"))
		{
			System.out.printf("Time to travel distance: %d seconds.", speed1.getSpeedWater());
		}
		
		else if(matter.equals("steel") || matter.equals("Steel") || matter.equals("STEEL"))
		{
			System.out.printf("Time to travel distance: %d seconds.", speed1.getSpeedSteel());
		}
		keyboard.close();
		
	}
}
