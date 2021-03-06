
public class Machine {
	public boolean on;
	public String name;
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName() 
	{
		return this.name;
	}
	
	public void turnOn()
	{
		if (!on)
		{
			this.on = true;
			System.out.println("The " + name  + " is on.");
		}
		else
		{
			System.out.println("The " + name  + " is already on.");
		}
	}
	
	public void turnOff()
	{
		if (on)
		{
			this.on = false;
			System.out.println("The " + name  + " is off.");
		}
		else
		{
			System.out.println("The " + name  + " is already off.");
		}
	}
}
