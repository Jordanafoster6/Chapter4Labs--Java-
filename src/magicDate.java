
public class magicDate {

	private int month;
	private int day;
	private int year;
	
	public void setMonth(int m)
	{
		month= m;
	}
	public void setDay(int d)
	{
		day = d;
	}
	public void setYear(int y)
	{
		year = y;
	}
	
	public int getMonth()
	{
		return month;
	}
	public int getDay()
	{
		return day;
	}
	public int getYear()
	{
		return year;
	}
	
	public boolean isMagic()
	{
		if(month * day == year)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
