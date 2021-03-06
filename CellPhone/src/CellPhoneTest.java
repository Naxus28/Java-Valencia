
public class CellPhoneTest {

	public static void main(String[] args) {
		
		// android -- first constructor
		CellPhone android = new CellPhone("Android", "black", "(407) 304-2987", "HTC Bolt");
		System.out.println(android);
		android.setNumericPassword("3452");
		System.out.println(android);
		android.setOn(true);
		android.setNumericPassword("3452");
		System.out.println(android);
		
		System.out.println("=======================\n");
		
		// iPhone -- fourth constructor
		CellPhone iPhone = new CellPhone("iPhone", "white", "(407) 890-4534", "7s",  "2 years", true, true);
		System.out.println(iPhone);
		iPhone.setOn(true);
		iPhone.setNumericPassword("349800");
		System.out.println(iPhone);
		iPhone.setNumericPassword("9800");
		System.out.println(iPhone);
		iPhone.setOnCall(true);
		System.out.println(iPhone);
	}

}
