/*

Program: Truck.java          Last Date of this Revision: 30-Mar-2022

Purpose: A Class which makes a blueprint for a Truck.

Author: Qasim Amar, 
School: CHHS
Course: Computer Programming 30
 

*/

package Vehicle;

public class Truck extends Vehicle {
	
	int cargoBedSize;
	
	//A constructor to make a truck
	public Truck(int RA, String CO, String ENG, int NOS, int size) {
		super(RA, CO, ENG, NOS);
		cargoBedSize = size;
	}
	
	//Returns the value for cargo bed of the truck and number of seats
	public String space() {
		return("The cargo bed size is " + cargoBedSize + " cubic feet along with " + NumOfSeats + " seats.");
	}

	//Returns the description of the truck
	public String description()
    {
        return("This is a truck coloured " + Color + ". " + "It has a range of " +  Range + "km, with a " + Engine + " engine. ");
    }
}

