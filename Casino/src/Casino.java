import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Casino {
	/**
	 * class globals
	 */
	final static float quarterValue = (float) 0.25;
	static int quartersInJar = 100;
	static int machine = 1;
	static int paidQuarters = 0;
	static int totalTimesPlayed = 0;
	static int mOneTotalTimesPlayed = 0;
	static int mTwoTotalTimesPlayed = 0;
	static int mThreeTotalTimesPlayed = 0;
	static PrintWriter printer;

 /**	
  * main method
  * @param args
  */
  public static void main(String[] args) {
	  // clear text file for every build/run
	  if(totalTimesPlayed == 0) {
		  printerHelper("", false);
	  }
	  
	  play();
  }
  
  /**
   * entry method
   */
  static private void play() {
	  while (quartersInJar > 0) {
		  totalTimesPlayed++;
		  quartersInJar--; 
		  
		  if (machine == 1) {
			  mOneTotalTimesPlayed++;
			  
			  if (mOneTotalTimesPlayed % 33 == 0) {
				  updateQuartersAndCallPrintMethod(); 
			  }
			  
		  }
		  else if (machine == 2) {
			  mTwoTotalTimesPlayed++;
			  
			  if (mTwoTotalTimesPlayed % 99 == 0) {
				  updateQuartersAndCallPrintMethod(); 
			  }
		  }
		  else if (machine == 3) {
			  mThreeTotalTimesPlayed++;
			  
			  if (mThreeTotalTimesPlayed % 9 == 0) {
				  updateQuartersAndCallPrintMethod(); 
			  }  
			  
			  machine = 0;
		  }
		  
		  machine++;
		  
		  if (quartersInJar == 0) {
			  printerHelper("Total times played: " + Integer.toString(totalTimesPlayed), true);
		  }
	  }
  }
  
  /**
   * helper method to print msgs
   * @param msg
   * @param stream
   */
  static private void printerHelper(String msg, boolean stream) {
	  try {
			 printer = new PrintWriter(new FileOutputStream("src/casino.txt", stream));
			 printer.println(msg);
			 printer.close();
		  } catch (FileNotFoundException e) {
			 e.printStackTrace();
		  }
  }
  
  /**
   * updates values when Vera wins and calls method that output results
   * @param quartersInJar
   * @param paidQuarters
   */
  static private void updateQuartersAndCallPrintMethod() {  
	  paidQuarters = getPaidQuarters();
	  quartersInJar+=paidQuarters;
	  
	  float amountWon = getQuarterAmountInDollars(paidQuarters);
	  float dollarsInJar = getQuarterAmountInDollars(quartersInJar);
	  
	  printOutputToTxtFile(machine, amountWon, quartersInJar, dollarsInJar);
  }
  
  /**
   * helper method--gets paid quarters per machine
   * @return
   */
  static private int getPaidQuarters() {  
	  switch (machine) {
	  	case 1:
	  		return 25;
	  	case 2:
	  		return 75;
	  	case 3:
	  		return 7;
	  	default:
	  		return 0;
	  }
  }
  
  /**
   * helper method--converts quarters count to dollars
   * @param quartersCount
   * @return
   */
  static private float getQuarterAmountInDollars(int quartersCount) {
	  float dollarAmount = quartersCount * quarterValue;
	  return dollarAmount;
  }
  
  /**
   * helper method--outputs results when Vera wins
   * @param currMachine
   * @param amountWon
   * @param quartersInJar
   * @param dollarsInJar
   */
  static private void printOutputToTxtFile(int currMachine, float amountWon, int quartersInJar, float dollarsInJar) {
	  try {
		printer = new PrintWriter(new FileOutputStream("src/casino.txt", true));
		printer.println("Machine played: " + machine);
		printer.println("Machine paid: $" + amountWon);
		printer.println("Remaining quarters in jar: " + quartersInJar);
		printer.println("Remaining dollars in jar: $" + dollarsInJar);
		printer.println("");
		printer.println("=================");
		printer.println("");
		printer.close();
	  } 
	  catch (FileNotFoundException e) {
		  e.printStackTrace();
	  }
  }
}

/*====EOF====*/




