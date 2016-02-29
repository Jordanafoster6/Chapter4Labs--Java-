import java.util.Scanner;

public class tempPointsDemo {

	public static void main(String[] args) 
	{
		
		Scanner keyboard = new Scanner(System.in);
		tempPoints temp1 = new tempPoints();
		
		System.out.print("Enter a temperature. (negative or positive)");
		temp1.setTemperature(keyboard.nextDouble());
		
		System.out.print("----------------------------------------------------- \n");
		System.out.printf("The tempearture you entered was: %.2f degrees. \n", temp1.getTemperature());
		System.out.print("----------------------------------------------------- \n");
		if(temp1.isEthylFreezing() == true)
		{
			System.out.print("The Temperature you entered can freeze Ethyl Alcohol. \n");
		}
		if(temp1.isEthylBoiling() == true)
		{
			System.out.print("The Temperature you entered can boil Ethyl Alcohol. \n");
		}
		if(temp1.isOxygenFreezing() == true)
		{
			System.out.print("The Temperature you entered can freeze Oxygen. \n");
		}
		if(temp1.isOxygenBoiling() == true)
		{
			System.out.print("The Temperature you entered can boil Oxygen. \n");
		}
		if(temp1.isWaterFreezing() == true)
		{
			System.out.print("The Temperature you entered can freeze Water. \n");
		}
		if(temp1.isWaterBoiling() == true)
		{
			System.out.print("The Temperature you entered can boil Water. \n");
		}
		System.out.print("----------------------------------------------------- \n");
		keyboard.close();
	}
}