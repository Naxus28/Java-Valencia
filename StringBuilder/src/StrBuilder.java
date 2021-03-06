
public class StrBuilder {
	public static void main(String[] args) {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append("Welcome");
		strBuilder.append(" ");
		strBuilder.append("to");
		strBuilder.append(" ");
		strBuilder.append("JAVA");
		System.out.println(strBuilder); // Welcome to JAVA
		
		strBuilder.insert(11, "HTML and "); // Welcome to HTML and JAVA
		System.out.println(strBuilder);
		
		strBuilder.delete(8, 11);
		System.out.println(strBuilder); // Welcome HTML and JAVA
		
		strBuilder.deleteCharAt(8);
		System.out.println(strBuilder); // Welcome TML and JAVA
		
		strBuilder.reverse();
		System.out.println(strBuilder); // AVAJ dna LMT emocleW
		strBuilder.reverse();
		
		strBuilder.replace(8,  11, "to JavaScript");
		System.out.println(strBuilder); // Welcome to JavaScript and JAVA
		
		strBuilder.setCharAt(15, 's');
		System.out.println(strBuilder); // Welcome to Javascript and JAVA
		
		
		// toString -- returns a string obj from the builder
		String str = strBuilder.toString();
		System.out.println(str);
		
		// capacity--sets the builder's capacity--if capacity is exceeded (say we increase he builder's length) the JVM increases the capacity automatically
		StringBuilder strBuilder1 = new StringBuilder();		
		System.out.println(strBuilder1.capacity()); // defaults to 16
		
		StringBuilder strBuilder2 = new StringBuilder(12); // sets capacity (char[]) to 12--improves performance if capacity is known
		System.out.println(strBuilder2.capacity()); // 12
		
		strBuilder2.append("Hello World!!!");
		System.out.println(strBuilder2.length()); // 14
		System.out.println(strBuilder2.capacity()); // capacity is now increased to 26: 2*(previous char[] size + 1)
		
		// because the length is 14 we don't need 26 capacity so we can trim the builder to not waste memory
		strBuilder2.trimToSize();
		System.out.println(strBuilder2.capacity()); // 14
		
		
		// setLength--length has to be equal or less than capacity
		strBuilder2.setLength(10); // decreases the length, thus removes chars from the string
		System.out.println(strBuilder2); // Hello Worl
		
		strBuilder2.setLength(14); // increases length, but chars that were removed from the builder are lost
		System.out.println(strBuilder2.length()); // 14
		System.out.println(strBuilder2); // Hello Worl
	}
}
