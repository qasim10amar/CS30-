/*

Program: Car.java          Last Date of this Revision: 31-Mar-2022

Purpose: An application which displays the three Vehicle classes.

Author: Qasim Amar, 
School: CHHS
Course: Computer Programming 30
 

*/

package Vehicle;

public class Tester {

	public static void main(String[] args) 
    {
		Car car1 = new Car(500, "white", "V4", 5, 16);
		Minivan van1 = new Minivan(700, "black", "V6", 7, 18);
		Truck truck1 = new Truck(600, "red", "V8", 2, 20);
		System.out.println(car1.description());
		System.out.println(car1.space());
		System.out.println("\n"+ van1.description());
		System.out.println(van1.space());
		System.out.println("\n"+ truck1.description());
		System.out.println(truck1.space());
	}
}

/* Screen Dump:

This is a car coloured white. It has a range of 500km, with a V4 engine. 
The trunk size is 16 cubic feet along with 5 seats.

This is a van coloured black. It has a range of 700km, with a V6 engine. 
The cargo size is 18 cubic feet along with 7 seats.

This is a truck coloured red. It has a range of 600km, with a V8 engine. 
The cargo bed size is 20 cubic feet along with 2 seats.

*/