/*

Program: SearchName.java          Last Date of this Revision: May 14, 2022

Purpose:

Author: Qasim Amar, 
School: CHHS
Course: Computer Programming 30
 

*/

package Name;

public class SearchName {


		public static int linear(String[] array, String Name) {
		int index = 0;

		while ((! array[index].equals(Name)) && (index < array.length - 1)) {
		index += 1;
		}

		if (array[index].equals(Name)) {
		return(index+1);
		} else {
		return(-1);
		}
		}
		
	}