
public class Athlete extends Person {
	public Athlete(String firstName, String lastName, int age) {
		super(firstName, lastName, age);
	}
	
	public void doThis() {
		System.out.println("I am " + getFullName() + ". " + getAthleteAction());
	}
	
	private String getAthleteAction() {
		String atheleteAction = "";
		
		if (this instanceof Baseballer) {
			atheleteAction = "I hit something.";
		} else if (this instanceof Footballer) {
			atheleteAction = "I tackle something.";
		} else if (this instanceof Golfer) {
			atheleteAction = "I put it in the hole.";
		} else if (this instanceof HockeyPlayer) {
			atheleteAction = "I sit in a penalty box.";
		} 
		
		return atheleteAction;
	}
	

	@Override
	public String toString() {
		return "Athlete [getFullName()=" + getFullName() + " getAthleteAction()=" + getAthleteAction() + "]";
	}
	
	
}
