import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TestAthletes {
	static String menuChoice;
	static Baseballer Barry = new Baseballer("Barry", "Blank", 24);
	static Footballer Payton = new Footballer("Payton", "Manning", 29);
	static HockeyPlayer  Mario = new HockeyPlayer("Mario", "Lanza", 30);
	
    // initialize person array and assign three sports men to it
    static ArrayList<Person> people = new ArrayList<Person>(1000);

	public static void main(String[] args) {
		people.add(Barry);
		people.add(Payton);
		people.add(Mario);
	    menuAction();
	}
	
	// helper methods
	private static void menuAction() {
		menuChoice = getUserChoice();
		
		if (menuChoice == "Add a new athlete") {
			addAthlete();
			menuAction();
		} else if (menuChoice == "Display all athletes") {
			displayAthletes();
			menuAction();
		} else if (menuChoice == "Compare if any two athletes are equal") {
			compareAtheletes();
			menuAction();
		} else if (menuChoice == "Display what each athlete does") {
			displayAthletesActions();
			menuAction();
		} else if (menuChoice == "Quit") {
			JOptionPane.showMessageDialog(null, "GOODBYE");
	    	System.exit(0);
		}
	}
	
	private static void addAthlete() {
		String [] sports = {"baseball", "football", "hockey", "golf", "tennis"};
		JTextField firstName = new JTextField();
		JTextField lastName = new JTextField();
		JTextField age = new JTextField();
		JTextField sport = new JTextField();
		
		Object [] fields ={
			"First Name", firstName,
			"Last Name", lastName,
			"Age", age,
			"Sport (choose from football, baseball, hockey, golf, or tennis)", sport
		};
		
		int result = JOptionPane.showConfirmDialog(null, fields, 
	               "Please enter the following information for your athlete", JOptionPane.OK_CANCEL_OPTION);
		
		if (result == JOptionPane.OK_OPTION) {
		    String athleteFirstName = firstName.getText();
		    String athleteLastName = lastName.getText();
		    int athleteLastAge = Integer.parseInt(age.getText());
		    String inputSport = sport.getText().toLowerCase();
	
		    if (!Arrays.asList(sports).contains(inputSport)) {
		    	JOptionPane.showMessageDialog(null, "Please choose a sport from the list");
		    	addAthlete();
		    } else {
		    	Person newAthlete;
		    	
		    	// all variable assignments below are examples polymorphism
		    	if (inputSport.equals("baseball")) {
		    		newAthlete = new Baseballer(athleteFirstName, athleteLastName, athleteLastAge);
		    	} else if (inputSport.equals("football")) {
		    		newAthlete = new Footballer(athleteFirstName, athleteLastName, athleteLastAge);
		    	} else if (inputSport.equals("hockey")) {
		    		newAthlete = new HockeyPlayer(athleteFirstName, athleteLastName, athleteLastAge);
		    	} else if (inputSport.equals("golf")) {
		    		newAthlete = new Golfer(athleteFirstName, athleteLastName, athleteLastAge);
		    	} else {
		    		newAthlete = new Tennist(athleteFirstName, athleteLastName, athleteLastAge);
		    	}
		    	
		    	people.add(newAthlete);
		    }
	      }
	}

	private static void displayAthletesActions() {
		String intro = "I am ";
		
		// the instanceof operator and casting are elements of polymorphism
		 for(Person athlete: people) {	
	    	if (athlete instanceof Baseballer) {
	    		System.out.println(intro + ((Baseballer)athlete).getFullName());
	    		((Baseballer)athlete).doThis("I swing my bat.");
	    	} else if (athlete instanceof Footballer) {
	    		System.out.println(intro + ((Footballer)athlete).getFullName());
	    		((Footballer)athlete).doThis("I throw footballs.");
	    	} else if (athlete instanceof HockeyPlayer) {
	    		System.out.println(intro + ((HockeyPlayer)athlete).getFullName());
	    		((HockeyPlayer)athlete).doThis("I skate on ice and wear heavy gear when I play.");
	    	} else if (athlete instanceof Golfer) {
	    		System.out.println(intro + ((Golfer)athlete).getFullName());
	    		((Golfer)athlete).doThis("I swing my club and hit a small ball.");
	    	} else {
	    		System.out.println(intro + ((Tennist)athlete).getFullName());
	    		((Tennist)athlete).doThis("I swing my racket and hit a ball over a net.");
	    	}

	    	System.out.println("------------------\n");
	    }
	}

	private static void displayAthletes() {
		for(Person athlete: people) { 
			System.out.println(athlete);
		}
	}

	public static Person selectAthlete() {
		return getAthleteFromMenu("Choose an athlete", "Athletes menu", people);
	}
	
	public static void compareAtheletes() {
		Person athleteOne = selectAthlete();
		Person athleteTwo = selectAthlete();
		String result = athleteOne.equals(athleteTwo) 
						? "Chosen athletes are the same"
						: "Chosen athletes are NOT the same";
		System.out.println(result);
	}
	
	private static Person getAthleteFromMenu(String content, String title, ArrayList<Person> people) {
		Person [] athletes = people.toArray(new Person[people.size()]);
		
		Person selectedValue = (Person) JOptionPane.showInputDialog(null, content, title,
					JOptionPane.INFORMATION_MESSAGE, null,
					athletes, athletes[0]);
		 
		 return selectedValue;
	}
	
	/**
	 * menu helpers
	 * @return
	 */
	private static String getUserChoice() {
		String[] options = { 
			"Add a new athlete", 
			"Display all athletes", 
			"Compare if any two athletes are equal", 
			"Display what each athlete does",
			"Quit"
		};
		
		return optionMenu("Choose an action", "Actions menu", options);
	}
	
	private static String optionMenu(String content, String title, String[] options) {
		 String selectedValue = (String) JOptionPane.showInputDialog(null, content, title,
					JOptionPane.INFORMATION_MESSAGE, null,
					options, options[0]);
		 
		 return selectedValue;
	}

}
