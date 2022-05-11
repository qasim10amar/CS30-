import java.io.File;
import java.util.Scanner;

/*

Program: MyFileP1.java          Last Date of this Revision: Apr 7, 2022

Purpose: Create a MyFile application that prompts the user for the names of a file and then displays a message that indicates whether the file exists or not.

Author: Qasim Amar, 
School: CHHS
Course: Computer Programming 30
 
*/

public class MyFileP1 {


	public static void main(String[] args) 
	{

		Scanner input = new Scanner(System.in);
		
		//Initialize a string named F
		String F;
		
		do {
			
		//Asks user to enter file name
		System.out.println("Enter File Name: ");
		
		//String F that holds the name of the file
		F = input.next();
		
		//Creates a new file object
		File textFile = new File(F);
		
		//Checks if file exists
		if (textFile.exists()) 
		{
			System.out.println("File exists.");
		} 
		
		else 
		{
			System.out.println("File does not exist.");
		}
		
		
	} 
		//Runs the program indefinitely
		while(true);
	}

}


/* Screen Dump

Enter File Name: 
C:\Users\54150001\Desktop\code.txt
File exists.
Enter File Name: 
C:\Users\54150001\Desktop\hello
File does not exist.

*/