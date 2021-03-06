import java.util.Scanner;

public class TwoDimensionalArrayFromuserInput {

	public static void main(String[] args) {
		
		// initialize arrays with user's input
		int[][] matrix = new int [3] [3];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter " + matrix.length + " rows " + matrix[0].length + " columns"); // matrix[0].length works because it is a square arrays
		
		for(int row = 0; row < matrix.length; row++) {
			for(int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = input.nextInt();
			}
		}
		
		input.close();
		
		System.out.println("This is your matrix: ");
		for(int row = 0; row < matrix.length; row++) {
			for(int column = 0; column < matrix[row].length; column++) {
				System.out.print(matrix[row][column] + "\t");
			}
			System.out.println("");
		}
		
		
	}
}
