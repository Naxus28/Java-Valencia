import java.util.Random;

public class MultipleCatchBlocks {
	public static void main(String[] args) {
		Random r = new Random();
		int[] array = {10, 20};
		
		// r.nextInt() generates a random number
		// r.nextInt(somenumber) generates a random number from 0 to <somenumber> i.e.  r.nextInt(10); 0 - 10
		
		/**
		 * the order of exceptions in the catch blocks don't matter 
		 * because both ArrayIndexOutOfBoundsException and ArithmeticException are children of RuntimeException
		 */
		try {
			int result = array[r.nextInt(array.length + 1)] / r.nextInt(2);
			System.out.println("no exceptions");
		} catch(ArrayIndexOutOfBoundsException aobe) {
			System.out.println(aobe.toString());
		} catch(ArithmeticException ae) {
			System.out.println(ae.toString());
		}
	}
}
