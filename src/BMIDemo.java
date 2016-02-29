import java.util.Scanner;

public class BMIDemo {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		BMI bmi1 = new BMI();
		
		System.out.print("Enter your height.");
		bmi1.setHeight(keyboard.nextDouble());
		
		System.out.print("Enter your weight.");
		bmi1.setWeight(keyboard.nextDouble());
		
		System.out.println("----------------------------");
		System.out.printf("Weight: %.2f lbs\n", bmi1.getWeight());
		System.out.printf("Height: %.0f inches\n", bmi1.getHeight());
		System.out.printf("BMI: %.0f \n", bmi1.getBMI());
		System.out.println("----------------------------");
		if(bmi1.getBMI() < 18.5)
		{
			System.out.println("You are underweight.");
		}
		else if(bmi1.getBMI() >= 18.5 && bmi1.getBMI() <= 25)
		{
			System.out.println("You are an optimal weight.");
		}
		else if(bmi1.getBMI() > 25)
		{
			System.out.println("You are overweight.");
		}
		System.out.println("----------------------------");
		
		keyboard.close();
	}

}
