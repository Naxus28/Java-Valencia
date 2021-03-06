
public class Toaster2 extends Machine {
	private int temp;
	private int minTemp;
	private int maxTemp;
	
	
	public Toaster2()
	{
		this("Toaster");
	}
	
	public Toaster2(String name)
	{
		this(name, 70, 100);
	}
	
	public Toaster2(String name, int minTemp, int maxTemp)
	{
		setName(name);
		this.minTemp = minTemp;
		this.maxTemp = maxTemp;
		this.temp = this.minTemp;
	}
	
	public void heatUp()
	{
		if (!on)
		{
			System.out.println("Plese turn the " + getName() + " on first.");
			return;
		}
		
		System.out.println("Toaster is heating up.");
		
		while(on && temp < maxTemp)
		{
			System.out.println(getName() + " temperature is at " + temp + " degress.");
			temp+=5;
		}
		
		System.out.println(getName() + " heated up to " + temp + " degress.");	
	}
	
	public void coolDown()
	{
		if (!on || temp == 0)
		{
			System.out.println("The " + getName() + " temperature is already 0 degrees.");
			return;
		}
		
		System.out.println("Toaster is cooling down.");
		
		while(on && temp > minTemp)
		{
			System.out.println(getName() + " temperature is at " + temp + " degress.");
			temp-=5;
		}
		
		System.out.println(getName() + " cooled down to " + temp + " degress.");	
	}
}
