
/**	
 * 
 * @author gabrielferraz
 * this class tests if instances of Telephone can be created
 * it throws InvalidTelephoneException if telephone format is wrong
 */
public class TelephoneTest {

	public static void main(String[] args) {
		
		// succeeds
		try {
			Telephone tel = new Telephone("4075822213");
			System.out.println(tel);
		} catch (InvalidTelephoneException ite) {
			System.out.println(ite.toString());
		}
		
		// succeeds
		try {
			Telephone tel = new Telephone("407 342 1243");
			System.out.println(tel);
		} catch (InvalidTelephoneException ite) {
			System.out.println(ite.toString());
		}
		
		// fails
		try {
			Telephone tel = new Telephone("407.582.2213");
			System.out.println(tel);
		} catch (InvalidTelephoneException ite) {
			System.out.println(ite.toString());
		}
		
		// fails
		try {
			Telephone tel = new Telephone("(407) 582-2213");
			System.out.println(tel);
		} catch (InvalidTelephoneException ite) {
			System.out.println(ite.toString());
		}
		
		// fails
		try {
			Telephone tel = new Telephone("407 5828 22234");
			System.out.println(tel);
		} catch (InvalidTelephoneException ite) {
			System.out.println(ite.toString());
		}
	}
}
