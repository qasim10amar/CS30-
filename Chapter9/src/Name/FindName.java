/*

Program: FindName.java          Last Date of this Revision: May 14, 2022

Purpose: 

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
		System.out.println("How many names do you want to enter: ");
		int numNames = input.nextInt();
		input.nextLine();
		String Name;
		int location;
		String names[] = new String[numNames];

		for(int i=0 ; i<names.length; i++) {
		System.out.println("Enter name: " + (i+1));
		names[i] = input.nextLine();
		}


		System.out.println("Which name do you want to find: ");
		Name=input.nextLine();

		location = SearchName.linear(names, Name);

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

