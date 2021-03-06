
public class RaggedArray {

	public static void main(String[] args) {
		double [][] data;
		data = new double [4][]; // we don't specify the length of the inner array because it is not a square array
		
		data[0] = new double [3];
		data[1] = new double [5];
		data[2] = new double [6];
		data[3] = new double [2];
		
		int dataIndex = 0;
		
		for(int row = 0; row < data.length; row++)
		{
			for(int col = 0; col < data[row].length; col++)
			{
				dataIndex++;
				data[row][col] = dataIndex;
			}
			
		}
		
		
		for(int row = 0; row < data.length; row++)
		{
			for(int col = 0; col < data[row].length; col++)
			{
				System.out.print(data[row][col] + "\t");	
			}
			
			System.out.println();
			
		}	
	}
}

/*
 * Result
	1.0		2.0		3.0
	4.0		5.0		6.0		7.0		8.0	
	9.0		10.0	11.0	12.0	13.0	14.0	
	15.0	16.0	
 */
