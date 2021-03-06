
public class Garage extends Building {
	private int carsCount;
	private int	length; 
	private int	width;
	private String floorType;
	
	/**
	 * default constructor
	 */
	public Garage() {}
	
	public Garage(int cars, int length, int width, String floorType, int windows) {
		super(1, windows);
		this.carsCount = cars;
		this.length = length;
		this.width = width;
		this.floorType = floorType;
	}
	
	/**
	 * @return the cars
	 */
	public int getCars() {
		return carsCount;
	}
	
	/**
	 * @param cars the cars to set
	 */
	public void setCars(int cars) {
		this.carsCount = cars;
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
	 * @return the floorType
	 */
	public String getFloorType() {
		return floorType;
	}
	
	/**
	 * @param floorType the floorType to set
	 */
	public void setFloorType(String floorType) {
		this.floorType = floorType;
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
		return super.toString() + " Garage lenght: " + length + ", width: " + width + ", area: " + getArea() + 
				", perimeter: " + getPerimeter() + ", number of cars capacity: " + carsCount + 
					", floor type: " + floorType + "\n";
	}
}
