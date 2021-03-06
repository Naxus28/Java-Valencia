
/**
 * Using generics in the comparable interface is the preferred approach because it prevents runtime errors: 
 * code will not compile if we try to compare objects that are not of type "Room" (say a room and a garage).
 * If we don't use generics code will compile when we try to compare objects of different types but we will 
 * have a runtime error
 */
public class Room implements Comparable<Room> {
	private int length; 
	private int	width; 
	private int	closets;
	
	private String floorCovering, roomName;
	
	/**
	 * default constructor
	 */
	public Room() {}
	
	
	public Room(int length, int width, String floorCovering, int closets, String roomName) {
		this.length = length;
		this.width = width;
		this.floorCovering = floorCovering;
		this.closets = closets;
		this.roomName = roomName;
	}
	

	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}

	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * @return the floorCovering
	 */
	public String getFloorCovering() {
		return floorCovering;
	}

	/**
	 * @param floorCovering the floorCovering to set
	 */
	public void setFloorCovering(String floorCovering) {
		this.floorCovering = floorCovering;
	}

	/**
	 * @return the closets
	 */
	public int getClosets() {
		return closets;
	}

	/**
	 * @param closets the closets to set
	 */
	public void setClosets(int closets) {
		this.closets = closets;
	}
	
	/**
	 * @return the roomName
	 */
	public String getRoomName() {
		return roomName;
	}


	/**
	 * @param roomName the roomName to set
	 */
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	
	/**
	 * @return the area
	 */
	public int getArea() {
		return width * length;
	}
	
	/**
	 * @return the perimeter
	 */
	public int getPerimeter() {
		return 2 * (width + length);
	}
	
	@Override
	public String toString() {
		return "Room lenght: " + length + " feet, width: " + width + " feet, area: " + getArea() + 
				" sq ft., perimeter: " + getPerimeter() + " feet, floor covering: " + floorCovering + 
					", and number of closets: " + closets;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Room)) {
			return false;
		}
		
		boolean isEqual = this.width == ((Room)obj).width 
				&& this.length == ((Room)obj).length
				&& this.closets == ((Room)obj).closets
				&& this.floorCovering.equals(((Room)obj).floorCovering);
		
		if (!isEqual) {
			return false;
		}
		
		return true;
	}
	
	
	@Override
	public int compareTo(Room other) {
		final int EQUAL = 0,
				  SMALLER = -1,
				  BIGGER = 1;
		
		if (this.getArea() > other.getArea()) {
			return BIGGER;
		} else if (this.getArea() < other.getArea()) {
			return  SMALLER;
		}  
		
		return EQUAL;
	}

}
