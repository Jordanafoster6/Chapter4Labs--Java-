import java.util.Scanner;

public class testScoresDemo {

	public static void main(String[] args) 
	{
		
		Scanner keyboard = new Scanner(System.in);
		testScores ex1 = new testScores();
		
		char letterGrade = ' ';
		
		System.out.print("Enter the first test score.");
		ex1.setTestOne(keyboard.nextDouble());
		
		System.out.print("Enter the second test score.");
		ex1.setTestTwo(keyboard.nextDouble());
		
		System.out.print("Enter the third test score.");
		ex1.setTestThree(keyboard.nextDouble());
		
		if(ex1.getTestAverage() >= 90 && ex1.getTestAverage() <= 100)
		{
			letterGrade = 'A';
		}
		else if(ex1.getTestAverage() >= 80 && ex1.getTestAverage() <= 89)
		{
			letterGrade = 'B';
		}
		else if(ex1.getTestAverage() >= 70 && ex1.getTestAverage() <= 79)
		{
			letterGrade = 'C';
		}
		else if(ex1.getTestAverage() >= 60 && ex1.getTestAverage() <= 69)
		{
			letterGrade = 'D';
		}
		else if(ex1.getTestAverage() < 60)
		{
			letterGrade = 'F';
		}
		
		System.out.println("----------------------------");
		System.out.printf("Test One: %.2f \n", ex1.getTestOne());
		System.out.printf("Test Two: %.2f \n", ex1.getTestTwo());
		System.out.printf("Test Three: %.2f \n", ex1.getTestThree());
		System.out.println("----------------------------");
		System.out.printf("Test Avg: %.2f \n", ex1.getTestAverage());
		System.out.println("Letter Grade: " + letterGrade + ". \n");
		System.out.println("---------------------------- \n");
		
	}
	
}
