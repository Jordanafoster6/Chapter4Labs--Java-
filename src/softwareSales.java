
public class softwareSales {
		
	private double unitsSold;
	private double totalCost;
	
	public void setUnitsSold(double u)
	{
		unitsSold = u;
	}
	public double getUnitsSold()
	{
		return unitsSold;
	}
	
	public double getTotalCost()
	{
		if(unitsSold < 10)
		{
			totalCost = (unitsSold * 99.0);
		}
		else if(unitsSold >= 10 && unitsSold <= 19)
		{
			totalCost = (99.0 * unitsSold) * .80;
		}
		else if(unitsSold >= 20 && unitsSold <= 49)
		{
			totalCost = (99.0 * unitsSold) * .70;
		}
		else if(unitsSold >= 50 && unitsSold <= 99)
		{
			totalCost = (99.0 * unitsSold) * .60;
		}
		else if(unitsSold >= 100)
		{
			totalCost = (99.0 * unitsSold) * .50;
		}
		
		return totalCost;
	}

}
