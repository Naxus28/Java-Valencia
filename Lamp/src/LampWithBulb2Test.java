/**
 * 
 */

/**
 * @author gabrielferraz
 *
 */
public class LampWithBulb2Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LightBulb bulb = new LightBulb();
		LampWithBulb2 lamp = new LampWithBulb2(bulb); // constructor requires an argument
		
		lamp.turnOn();
		lamp.turnOn();
		lamp.turnOff();
		lamp.turnOff();
	}

}
