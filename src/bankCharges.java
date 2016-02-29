
public class bankCharges {
	
	private double balance;
	private double checksWritten;
	private double checkFee;
	private double serviceFees;
	
 	public void setBalance(double bal)
	{
 		this.balance = bal;
	}
	public double getBalance()
	{
		return balance - serviceFees;
	}
	
	public void setChecksWritten(double c)
	{
		checksWritten = c;
	}
	public double getChecksWritten()
	{
		return checksWritten;
	}
	
	public double getCheckFee()
		 
	{
		if(checksWritten < 20)
		{
			checkFee = (checksWritten * .1);
		}
		else if(checksWritten > 20 && checksWritten < 39)
		{
			checkFee = (checksWritten * .08);
		}
		else if(checksWritten > 40 && checksWritten < 59)
		{
			checkFee = (checksWritten * .06);
		}
		else if(checksWritten < 60)
		{
			checkFee = (checksWritten * .04);
		}
		serviceFees += checkFee;
		return checkFee;
	}
	public void setMonthlyFee()
	{
		if(balance < 400.00)
 		{
 			serviceFees += 25.0;
 		}
 		else
 		{
 			serviceFees += 10.0;
 		}
	}
	
	public double getServiceTotal()
	{
		return serviceFees;
	}
}