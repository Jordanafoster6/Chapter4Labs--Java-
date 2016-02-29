
public class shippingCharges {

	private double packageWeight;
	private double total;
	private int milesShipped;
	private int milesIncrement;
	
	public void setWeight(double w)
	{
		packageWeight = w;
	}
	
	public void setMiles(int m)
	{
		milesShipped = m;		
		if((milesShipped % 500) == 0 && !(milesShipped < 500)){
			milesIncrement = milesShipped / 500;
		} else{
			milesIncrement = (milesShipped / 500) + 1;
		}
	}
	
	public double getWeight()
	{
		return packageWeight;
	}
	
	public int getMiles()
	{
		return milesShipped;
	}
	
	public double getTotal()
	{
		if(packageWeight <= 2)
		{
			total = 1.10 * milesIncrement;
		}
		else if(packageWeight > 2 && packageWeight < 6)
		{
			total = 2.20  * milesIncrement;
		}
		else if(packageWeight > 6 && packageWeight < 10)
		{
			total = 3.70 * milesIncrement;
		}
		else if(packageWeight > 10)
		{
			total = 4.80 * milesIncrement;
		}
		return total;
	}
	
}
