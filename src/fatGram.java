
public class fatGram {

	private double calories;
	private double fatGrams;
	
	public void setCalories(double c)
	{
		calories = c;
	}
	
	public void setFatGrams(double f)
	{
		fatGrams = f;
	}
	
	public double getCalories()
	{
		return calories;
	}
	
	public double getFatGrams()
	{
		return fatGrams;
	}
	
	public double getPercentage()
	{
		return (fatGrams * 9.0) / calories;
	}
	
}
