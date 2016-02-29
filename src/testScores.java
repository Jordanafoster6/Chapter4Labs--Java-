
public class testScores {

	private double testOne;
	private double testTwo;
	private double testThree;
	
	public void setTestOne(double test)
	{
		testOne = test;
	}
	public void setTestTwo(double test)
	{
		testTwo = test;
	}
	public void setTestThree(double test)
	{
		testThree = test;
	}
	
	public double getTestOne()
	{
		return testOne;
	}
	public double getTestTwo()
	{
		return testTwo;
	}
	public double getTestThree()
	{
		return testThree;
	}
	
	public double getTestAverage()
	{
		return (testOne + testTwo + testThree) / 3;
	}
	
}
