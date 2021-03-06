import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class AlarmClock {
	private boolean on;
	SimpleDateFormat alarmDateFormat = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
	AlarmClockCalendar calendar;
	Calendar currentDateTime;
	Calendar alarmDateTime = new GregorianCalendar();
	
	/**
	 * class constructor
	 */
	public AlarmClock()
	{
		calendar = new AlarmClockCalendar();
	}
	
	/**
	 * sets alarm clock date-time
	 * @param year
	 * @param month
	 * @param day
	 * @param min
	 * @param sec
	 */
	public void setAlarmDateTime(int year, int month, int day, int hour, int min)
	{
		if (on) 
		{
			alarmDateTime.set(year, month, day, hour, min, 0);
		}
		else 
		{
			System.out.println("Please turn your alarm clock on before setting the alarm date and time.");
		}
	}
	
	/**
	 * gets alarm clock date-time
	 * @return
	 */
	public String getAlarmDateTime() 
	{
		String dateTime = alarmDateTime.getTime() == null
							? "Please set date-time on your alarm."
							: alarmDateFormat.format(alarmDateTime.getTime()) ;
		
		return dateTime;
	}
	
	/**
	 * turns alarm on
	 * @param turnOn
	 */
	public void turnOn(boolean turnOn)
	{	
		if(!turnOn) {
			System.out.println("Please use the method 'turnOff' to turn the alarm clock off.");
			return;
		}
		else 
		{
			if(on)
			{
				System.out.println("The alarm clock is already on.");
				System.out.println("This is the current date and time: " + calendar.getCurrentDateTime());
				System.out.println("The alarm is set to go off on: " + this.getAlarmDateTime());
			}
			else
			{
				on = true;
				System.out.println("Your alarm clock is on. You may now set your alarm.");
			}
		}
	}
	
	/**
	 * turns alarm off
	 * @param turnOff
	 */
	public void turnOff(boolean turnOff)
	{
		if(!turnOff) {
			System.out.println("Please use the method 'turnOn' to turn the alarm clock on.");
			return;
		}
		else
		{
			if(on)
			{
				on = false;
				System.out.println("The alarm clock is off.");
			}
			else
			{
				System.out.println("The alarm clock is already off.");
			}
			
		}
	}	
	
}
