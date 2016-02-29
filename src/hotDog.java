
public class hotDog {

	private int hotDogsPerPerson;
	private int attendees;
	private int dogPackNum;
	private int bunPackNum;
	private int dogsLeft;
	private int bunsLeft;
	private int hotDogsNeeded;
	
	public void setHotDogs(int h)
	{
		hotDogsPerPerson = h;
	}
	public void setAttendees(int a)
	{
		attendees = a;
	}
	public int miniHotDog()
	{
		hotDogsNeeded = (attendees * hotDogsPerPerson);
		if(hotDogsNeeded % 10 == 0)
		{
			dogPackNum = hotDogsNeeded / 10;
		}
		else if(hotDogsNeeded % 10 != 0)
		{
			dogPackNum = (hotDogsNeeded / 10) + 1 ;
		}
		return dogPackNum;
	}
	public int miniBuns()
	{
		hotDogsNeeded = (attendees * hotDogsPerPerson);
		if(hotDogsNeeded % 8 == 0)
		{
			bunPackNum = hotDogsNeeded / 8;
		}
		else if(hotDogsNeeded % 8 != 0)
		{
			bunPackNum = (hotDogsNeeded / 8) + 1 ;
		}
		return bunPackNum;
	}
	public int dogsLeft()
	{
		hotDogsNeeded = (attendees * hotDogsPerPerson);
		if(hotDogsNeeded % 10 == 0 )
		{
			dogsLeft = 0;
		}
		else if(hotDogsNeeded % 10 != 0 )
		{
			dogsLeft = (hotDogsNeeded % 10);
		}
		return dogsLeft;
	}
	public int bunsLeft()
	{
		hotDogsNeeded = (attendees * hotDogsPerPerson);
		if(hotDogsNeeded % 8 == 0)
		{
			bunsLeft = 0;
		}
		else if(hotDogsNeeded % 8 != 0)
		{
			bunsLeft = hotDogsNeeded % 8;
		}	
		return bunsLeft;	
	}
	
}
