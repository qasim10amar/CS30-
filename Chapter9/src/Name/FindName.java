/*

Program: FindName.java          Last Date of this Revision: May 14, 2022

Purpose: Uses search class and prompts user for names to fill an array and then prompt the user for the name to find.

Author: Qasim Amar, 
School: CHHS
Course: Computer Programming 30
 

*/

package Name;

import java.util.Scanner;
import java.lang.Math;

public class FindName {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Asks user for the amount of names they would like to enter
		System.out.println("How many names do you want to enter: ");
		int numNames = input.nextInt();
		input.nextLine();
		
		//Initializes variables
		String Name;
		int location;
		String names[] = new String[numNames];

		//Tells user to enter the names
		for(int i=0 ; i<names.length; i++) {
		System.out.println("Enter name: " + (i+1));
		names[i] = input.nextLine();
		}

		//Asks user which name they would like to find
		System.out.println("Which name do you want to find: ");
		Name=input.nextLine();

		//Uses linear search method from SearchName class with the chosen array and string
		location = SearchName.linear(names, Name);

		//Tells user the position of the string or the string was not found
		if (location == -1) {
		System.out.println("Sorry, n not found in array.");
		} else {
		System.out.println("Occurrence is element " + location);
		}

		}
		}

/* Screen Dump

How many names do you want to enter: 
3
Enter name: 1
Mike Smith
Enter name: 2
John Jo
Enter name: 3
Qasim Amar
Which name do you want to find: 
John Jo
Occurrence is element 2

*/

