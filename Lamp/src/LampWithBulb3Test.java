
public class LampWithBulb3Test {

	public static void main(String[] args) {
		ColoredLightBulb bulb = new ColoredLightBulb();
		bulb.setColor("blue");
		LampWithBulb3 lamp = new LampWithBulb3(); // uses constructor that doesn't require an argument
		LampWithBulb3 lamp2 = new LampWithBulb3(bulb); // uses constructor that requires an argument
		
		System.out.println("==========" + lamp.getClass() + "==========");
		lamp.turnOn();
		lamp.turnOn();
		lamp.turnOff();
		lamp.turnOff();
		
		System.out.println("==========" + lamp2.getClass() + "==========");
		lamp2.getClass();
		lamp2.turnOn();
		lamp2.turnOn();
		lamp2.turnOff();
		lamp2.turnOff();

	}

}
