import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexValenciaCourses {
	public static final String regex = "(([A-Z]{3})\\s(\\d{4}[A-Z]{0,})(\\s\\d){2}\\s([4-9]|[0-9]{2,3}))";
	
	public static void main(String[] args) {
		
		try(BufferedReader bufferedReader = new BufferedReader(new FileReader("valencia.txt"));
				PrintWriter printer = new PrintWriter("courses.txt")
			) 
		{        	
            Pattern pattern = Pattern.compile(regex);
      	  	
            String line;
            
            int counter = 0;
            
            while ((line = bufferedReader.readLine()) != null) {
               Matcher matcher = pattern.matcher(line);
               while (matcher.find()) {

            	  printer.println(matcher.group(0));
            	 
                  System.out.println(matcher.group(0));
                  
                  counter++;
               }
            }
            
            printer.println("Number of courses: " + counter);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
