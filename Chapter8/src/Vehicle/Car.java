/*

Program: Car.java          Last Date of this Revision: 29-Mar-2022

Purpose: A Class which makes a blueprint for a Car.

Author: Qasim Amar, 
School: CHHS
Course: Computer Programming 30
 

*/

package Vehicle;

public class Car extends Vehicle {
	
	int trunkSize;
	
	//A constructor to make a car
	public Car(int RA, String CO, String ENG, int NOS, int size) {
		super(RA, CO, ENG, NOS);
		trunkSize = size;
	}
	
	//Returns the value for trunk size of the car and number of seats
	public String space() {
		return("The trunk size is " + trunkSize + " cubic feet along with " + NumOfSeats + " seats.");
	}

	//Returns the description of the car
	public String description()
    {
        return("This is a car coloured " + Color + ". " + "It has a range of " +  Range + "km, with a " + Engine + " engine. ");
    }
}

		
	



		
	
	


