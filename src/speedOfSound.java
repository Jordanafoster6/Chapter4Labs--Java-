
public class speedOfSound {

	private int distance;
	private int airSpeed = 1100;
	private int waterSpeed = 4900;
	private int steelSpeed = 16400;
	
	
	public void setDistance(int feet)
	{
		distance = feet;
	}
	
	public int getSpeedAir()
	{
		return (distance / airSpeed);
	}
	
	public int getSpeedWater()
	{
		return (distance / waterSpeed);
	}
	
	public int getSpeedSteel()
	{
		return (distance / steelSpeed);
	}
	
	
	
}
