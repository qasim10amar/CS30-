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
	
	public Car(int RA, String CO, String ENG, int NOS, int size) {
		super(RA, CO, ENG, NOS);
		trunkSize = size;
	}
	
	public String space() {
		return("The trunk size is " + trunkSize + " cubic feet along with " + NumOfSeats + " seats.");
	}

	public String description()
    {
        return("This is a car coloured " + Color + ". " + "It has a range of " +  Range + "km, with a " + Engine + " engine. ");
    }
}

		
	



		
	
	


