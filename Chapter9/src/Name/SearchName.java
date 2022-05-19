/*

Program: SearchName.java          Last Date of this Revision: May 14, 2022

Purpose: Performs linear search on a string array.

Author: Qasim Amar, 
School: CHHS
Course: Computer Programming 30
 

*/

package Name;

public class SearchName {

	
	    //Searches an array to find position of a string
		public static int linear(String[] array, String Name) {
		int index = 0;

		//Runs program until the string has been found or the array has ended
		while ((! array[index].equals(Name)) && (index < array.length - 1)) {
		index += 1;
		}

		//Returns the position of the string or if not found returns -1
		if (array[index].equals(Name)) {
		return(index+1);
		} else {
		return(-1);
		}
		}
		
	}