
public class phoneBill {

	private char packageCharacter;
	private int minutes;
	private double total;
	
	public void setPackageLetter(char packLetter)
	{
		packageCharacter = packLetter;
	}
	
	public char getPackageLetter()
	{
		return packageCharacter;
	}
	
	public void setMin(int min)
	{
		minutes = min;
	}
	
	public int getMin()
	{
		return minutes;
	}
	
	public double getTotal()
	{
		if(packageCharacter == 'a' || packageCharacter == 'A')
		{
			if(minutes <= 450)
			{
				total = 39.99;
			}
			else if(minutes > 450)
			{
				total = ((minutes - 450) * 0.45) + 39.99;
			}
		}
		
		if(packageCharacter == 'b' || packageCharacter == 'B')
		{
			
			if(minutes <= 900)
			{
				total = 59.99;
			}
			else if(minutes > 900)
			{
				total = ((minutes - 900) * 0.40) + 59.99;
			}
		}
		
		if(packageCharacter == 'c' || packageCharacter == 'C')
		{
			total = 69.99;
			
		}
		return total;
	}

	public double getPackageATotal()
	{
		total = 0;
		if(minutes <= 450)
		{
			total = 39.99;
		}
		else if(minutes >= 450)
		{
			total = ((minutes - 450) * 0.45) + 39.99;
		}
		return total;
	}
	
	public double getPackageBTotal()
	{
		total = 0;
		if(minutes <= 900)
		{
			total = 59.99;
		}
		else if(minutes >= 900)
		{
			total = ((minutes - 900) * 0.40) + 59.99;
		}
		return total;
	}
	
	public double getPackageCTotal()
	{
		total = 69.99;
		return total;
	}
}
