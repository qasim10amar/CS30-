/*

Program: Vehicle.java          Last Date of this Revision: 28-Mar-2022

Purpose: A class that is abstract which defines the general details and actions of a vehicle

Author: Qasim Amar, 
School: CHHS
Course: Computer Programming 30
 
*/

package Vehicle;

abstract class Vehicle {
	public int Range;
	public String Color;
	public String Engine;
	public int NumOfSeats;

	//A constructor that defines the attributes of a vehicle
	public Vehicle(int RA, String CO, String ENG, int NOS) {
		Range = RA;
		Color = CO;
		Engine = ENG;
		NumOfSeats = NOS;
	
	}
	
	 //Returns the range
	 public int getRange() {
	 	return(Range);
	 }

     //Returns the color
	 public String Color() {
	 	return(Color);
	 }

	 //Returns the engine
	 public String Engine() {
	 	return(Engine);
	 }

	 //Returns the number of seats
	 public int NumOfSeats() {
	 	return(NumOfSeats);
	 }
	 
	 //Returns the attributes of the vehicle
	 public String toString()
	    {
	        return("It has a range of " +  Range + " with an a" + Engine + ". ");
	    }

	 //Returns the cargo space
	abstract String space();
	
	//Returns the description of the vehicle
	abstract String description();
	
}