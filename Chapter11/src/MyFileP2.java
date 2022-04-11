import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*

Program: MyFileP2.java          Last Date of this Revision: Apr 7, 2022

Purpose: 

Author: Qasim Amar, 
School: CHHS
Course: Computer Programming 30
 
*/


public class MyFileP2 {

	public static void main(String[] args) 
	{
			Scanner input = new Scanner(System.in);
			
			
			String F;
			
			try {
			     File fileName = new File("zzz.txt");
			     
			      fileName.createNewFile();
			      System.out.println("File created: " + fileName.getName());
			     
			     
			     System.out.println("Do you want to keep: " + fileName.getName() + " y for (Yes) n for (No)");
			     F = input.next();
			     
			     if (F.equalsIgnoreCase("y")) {
			     System.out.println( fileName.getName() + " Has Been Saved");
			     } else if (F.equalsIgnoreCase("n"))  {
			     fileName.delete();
			     System.out.println( fileName.getName() + " Has Been Deleted");
			     }
			     
			   } catch (IOException e) {
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
