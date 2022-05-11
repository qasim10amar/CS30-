import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*

Program: MyFileP2.java          Last Date of this Revision: Apr 7, 2022

Purpose: Create a MyFile application that creates a file named zzz.txt  and then display a message indicating the file has been created and prompts user to delete or keep the file.

Author: Qasim Amar, 
School: CHHS
Course: Computer Programming 30
 
*/


public class MyFileP2 {

	public static void main(String[] args) 
	{
			Scanner input = new Scanner(System.in);
			
			//Initializes a string named F
			String F;
			
			try {
				
				 //Creates a file object named zzz.txt
			     File fileName = new File("zzz.txt");
			     
			      //Creates new file
			      fileName.createNewFile();
			      
			      //Displays to user that the file has been created
			      System.out.println("File created: " + fileName.getName());
			     
			     //Asks user if they want to keep the file
			     System.out.println("Do you want to keep: " + fileName.getName() + " y for (Yes) n for (No)");
			     
			      //String F that holds the name of the file
			     F = input.next();
			     
			     //Saves file if user chooses to keep the file
			     if (F.equalsIgnoreCase("y")) {
			     System.out.println( fileName.getName() + " Has Been Saved");
			     
			     } 
			     
			     //Deletes file if user chooses to delete it
			     else if (F.equalsIgnoreCase("n"))  {
			     fileName.delete();
			     System.out.println( fileName.getName() + " Has Been Deleted");
			     }
			     
			   }
				
			     catch (IOException e) {
			     System.out.println("An error occurred.");
			     System.err.println("IOException " + e.getMessage());
			     
			   }

	


	}

}

/* Screen Dump
 
File created: zzz.txt
Do you want to keep: zzz.txt y for (Yes) n for (No)
y
zzz.txt Has Been Saved

File created: zzz.txt
Do you want to keep: zzz.txt y for (Yes) n for (No)
n
zzz.txt Has Been Deleted
 
*/
