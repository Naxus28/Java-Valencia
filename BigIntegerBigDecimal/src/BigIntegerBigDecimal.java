import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegerBigDecimal {

	public static void main(String[] args) {
		// BigInteger represents integers of ANY size
		// BigInteger and BigDecimal objects have methods to perform math operations: 
		// add, subtract, multiply, divide, compareTo
		
		BigInteger a = new BigInteger("34098785904983759");
		BigInteger b = new BigInteger("5904983759");
		BigInteger c = a.add(b);
		System.out.println(c);
		
		// BigDecimal represents floating point numbers of ANY size:
		// the divide method may throw an ArithmeticException if the result cannot be terminated
		// so we should use the overloaded divide method that takes a scale param and a round param in addition to the number itself
		BigDecimal d = new BigDecimal("20");
		BigDecimal e = new BigDecimal("3");
		BigDecimal f = d.divide(e, 10, BigDecimal.ROUND_UP); // max number of decimal points = 10, rounds up
		System.out.println(f); // 6.6666666667 -- last 66 is rounded up to 7
		
		BigDecimal g = d.divide(e, 10, BigDecimal.ROUND_DOWN); // max number of decimal points = 7, rounds down
		System.out.println(g); // 6.6666666666
		
		BigDecimal h = d.divide(e, 7, BigDecimal.ROUND_CEILING); // max number of decimal points = 5, rounds down
		System.out.println(h); // 6.6666667
	}

}
