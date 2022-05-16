/*

Program: Squares.java          Last Date of this Revision: May 10, 2022

Purpose: Create a squares application that stores the square of an elements's in an integer array of 5 elements.

Author: Qasim Amar, 
School: CHHS
Course: Computer Programming 30
 
*/

public class Squares {

	public static void main(String[] args) {
		
		//Creates a new integer array with 5 elements
		int[] array = new int[5];

		//For loop that runs the length of the array number of times
		for (int i=0; i<array.length; i++) {
			
		//Stores the square of the index for each element starting from 0 to 4
		array[i]=(i * i);
		
		//Prints each elements of the array in order
		System.out.println(array[i]);
		

	}

}
}

/* Screen Dump

0
1
4
9
16

*/