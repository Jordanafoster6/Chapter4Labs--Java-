
public class BMI {

	private double weight;
	private double height;
	
	public void setWeight(double w)
	{
		weight = w;
	}
	public void setHeight(double h)
	{
		height = h;
	}
	
	public double getWeight()
	{
		return weight;
	}
	public double getHeight()
	{
		return height;
	}
	
	public double getBMI()
	{
		return weight * (703 / (height * height));
	}

	
}
