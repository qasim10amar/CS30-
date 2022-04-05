/*

Program: Puck.java          Last Date of this Revision: 10-Mar-2022

Purpose: Application to test the puck class.

Author: Qasim Amar, 
School: CHHS
Course: Computer Programming 30
 

*/

package Puck;

public class TestPuck {
    
    public static void main(String[] args) {
				//Create a new puck
                Puck Hockey = new Puck(5.5);

        //Outputting the weight and the division of the puck
		System.out.println("Puck weight: " + Hockey.getWeight());
		System.out.println("Pucks division is: " + Hockey.getDivision());

                //Creating two new pucks to test
                Puck Hockey1 = new Puck(4.3);
                Puck Hockey2 = new Puck(5.1);
                
        //Testing to see if both pucks are equal or not
		if (Hockey1.equals(Hockey2)) 
                {
			System.out.println("Objects are equal.");
		} 
                else 
                {
			System.out.println("Objects are not equal.");
		}
        //Outputting the string for each
		System.out.println(Hockey1);
		System.out.println(Hockey2);
	}
}

/* Screen Dump:

Puck weight: 5.5
Pucks division is: adult
Objects are not equal.
The puck has a weight of 4.3 and the puck is used in the youth division.
The puck has a weight of 5.1 and the puck is used in the adult division.

*/
	



