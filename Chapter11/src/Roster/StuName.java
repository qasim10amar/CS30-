/*

Program: StuName.java          Last Date of this Revision: Apr 14, 2022

Purpose: Create a StuName class that has member variables firstName and lastName and a toString() member method.

Author: Qasim Amar,
School: CHHS
Course: Computer Programming 30
 
*/

package Roster;


public class StuName {
	
	String firstName, lastName;
	
	public StuName(String name)
    {          
		int idx = name.lastIndexOf(' ');
		firstName = name.substring(0, idx);
		lastName  = name.substring(idx + 1);
	}
	 public String toString() {
		 return firstName + " " + lastName;
	 }
}
