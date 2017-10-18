import java.util.Random;

public class Milk {
	public static void main(String[] args) {
		
		try {
			drinkMilk();
		} catch (OutOfMilkException ome) {
			System.out.print(ome);
		}

	}
	
	public static void drinkMilk() throws OutOfMilkException {
		final int THRESHOLD = 1000;
		final int NUMERATOR = 15;
		int random;
		long startTimeMills = System.currentTimeMillis();
		Random r = new Random();
		
		while(true) {
			try {
				random = NUMERATOR / r.nextInt(THRESHOLD);
				System.out.print("Gulp ");
			} catch(ArithmeticException ae) {
				System.out.println();
				long finishTimeMills = System.currentTimeMillis();
				throw new OutOfMilkException(finishTimeMills - startTimeMills);
			} 
		}
	}

}
