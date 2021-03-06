
public class AllMachines {

	public static void main(String[] args) {
		/* use variable of type "Machine" to store all types of machine objs so we can store these objs in the "allMachs" array
		 * arrays in Java can only have elements of the same type
		 * this is very limiting however because we can only call instance methods defined in the superclass (reference type) itself
		 * so if we had any method defined in the sub-classes Lamp or Toaster we wouldn't be able to invoke them
		 * on instances "lamp","lamp2", "toaster", and "toaster2"
		 * The way to access the runtime type directly is to use the "instanceof" operator (object casting)
		 * 
		 */ 
		
		Machine lamp = new Lamp();
		Machine lamp2 = new Lamp("Lamp2");
		Machine toaster = new Toaster();
		Machine toaster2 = new Toaster("Toaster2");
		Machine [] allMachs = { lamp, lamp2, toaster, toaster2 };
		
		for(Machine machine: allMachs)
		{
			machine.turnOn();
			machine.turnOff();
		}

	}

}
