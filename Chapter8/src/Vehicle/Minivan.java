/*

Program: Minivan.java          Last Date of this Revision: 29-Mar-2022

Purpose: A Class which makes a blueprint for a Minivan.

Author: Qasim Amar, 
School: CHHS
Course: Computer Programming 30
 

*/

package Vehicle;

public class Minivan extends Vehicle {
	
	int cargoSize;
	
	//A constructor to make a minivan
	public Minivan(int RA, String CO, String ENG, int NOS, int size) {
		super(RA, CO, ENG, NOS);
		cargoSize = size;
	}
	
	//Returns the value for cargo size of the minivan and number of seats
	public String space() {
		return("The cargo size is " + cargoSize + " cubic feet along with " + NumOfSeats + " seats.");
	}

	//Returns the description of the minivan
	public String description()
    {
        return("This is a van coloured " + Color + ". " + "It has a range of " +  Range + "km, with a " + Engine + " engine. ");
    }
}