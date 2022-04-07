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
			
			do {
				
			System.out.println("Enter File Name: ");
			F = input.next();
			
			File textFile = new File("zzz.txt");
			

			
			
			try 
			{
				textFile.createNewFile();
				System.out.println("New File Created. ");
			}	
			
			catch (IOException e) 
			{
				System.out.println("File Could Not Be Created. ");
				System.err.println("IOExeption: " + e.getMessage());	
			} 
			
			
		}

	
			while(true);

	}

}

/* Screen Dump
 

 
*/
