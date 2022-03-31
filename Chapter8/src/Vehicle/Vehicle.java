package Vehicle;

/**
 * Vehicle class.
 */
abstract class Vehicle {
	private int Range;
	private String Color;
	private String Engine;
	private double Tires;
	private int NumOfSeats;

	/**
	 * constructor
	 * pre: none
	 * post: A vehicle has been created.
	 */
	public Vehicle(int RA, String CO, String ENG, int NOS, double TI) {
		Range = RA;
		Color = CO;
		Engine = ENG;
		Tires = TI;
		NumOfSeats = NOS;
	
	}
	
		
	/**
	 * Returns the fEHwy
	 * pre: none
	 * post: The highway fuel economy has been returned
	 */
	 public int getRange() {
	 	return(Range);
	 }


	/**
	 * Returns the fECity
	 * pre: none
	 * post: The city fuel economy has been returned
	 */
	 public String Color() {
	 	return(Color);
	 }


	/**
	 * Returns the seating capacity
	 * pre: none
	 * post: The seating capacity has been returned
	 */
	 public String Engine() {
	 	return(Engine);
	 }


	/**
	 * Returns the cargo volume
	 * pre: none
	 * post: The cargo volume has been returned
	 */
	 public int NumOfSeats() {
	 	return(NumOfSeats);
	 }
	 
	 public double Tires() {
		 	return(Tires);
		 }

	/**
	 * Should return the appropriate name of the cargo area
	 * and the capacity.
	 * pre: none
	 * post: The name of the cargo container and its capacity 
	 * has been returned
	 */
	abstract String seats();
	
	
	/**
	 * Should return a description of the car's typical use
	 * pre: none
	 * post: A description of the car's typical use has been returned.
	 */
	abstract String description();
}