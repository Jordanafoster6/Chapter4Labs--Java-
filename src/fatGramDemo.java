import java.util.Scanner;

public class fatGramDemo {

	public static void main(String[] args) 
	{
		
		Scanner keyboard = new Scanner(System.in);
		fatGram fat1 = new fatGram();
		
		System.out.print("Enter the number of calories in your food item.");
		fat1.setCalories(keyboard.nextInt());
		
		System.out.print("Enter the number of fat grams in your food item.");
		fat1.setFatGrams(keyboard.nextInt());
		
		if(fat1.getFatGrams() > fat1.getCalories())
		{
			System.out.println("Error, you have entere the data incorrectly.");
			
			System.out.print("Enter the number of calories in your food item.");
			fat1.setCalories(keyboard.nextInt());
			
			System.out.print("Enter the number of fat grams in your food item.");
			fat1.setFatGrams(keyboard.nextInt());
		}
		
		System.out.println("----------------------------");
		System.out.printf("Calories: %.0f \n", fat1.getCalories());
		System.out.printf("Fat Grams: %.0f \n", fat1.getFatGrams());
		System.out.println("----------------------------");
		System.out.printf("Fat Calories Percentage: %.2f%% \n", fat1.getPercentage() * 100);
		if(fat1.getPercentage() < .3)
		{
			System.out.println("The food is low in fat.");
		}
		System.out.println("----------------------------");
		
		keyboard.close();
	}
}
