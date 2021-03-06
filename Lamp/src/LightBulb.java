
public class LightBulb {

	private boolean lit;
	
	public void setLit(boolean param) 
	{
		if(lit && param)
		{
			System.out.println("The bulb is already lit.");
		}
		else if(!lit && !param)
		{
			System.out.println("The bulb is already unlit.");
		}
		else {
			lit = param;
			String str = lit ? "lit." : "unlit.";
			System.out.println("The bulb is " + str);
		}
	}
	
	public boolean isLit()
	{
		return lit;
	}
}
