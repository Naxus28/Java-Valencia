
public class Person {
	private String firstName;
	private String lastName;
	int age;
	
	//Create a Person array that can store up to 1000 objects
	

	// constructor
	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	
	// getters and setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getFullName() {
		return firstName + " " + lastName;
	}
	
	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public boolean equals(Object obj) {

		if (obj == null || !(obj instanceof Person)) {
			return false;
		}
		
		// check if age and name are the same
		if (this.age != ((Person) obj).age || this.firstName != ((Person) obj).firstName || this.lastName != ((Person) obj).lastName) {
			return false;
		}
		
		return true;
	}


	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
		
}
