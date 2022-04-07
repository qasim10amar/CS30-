import java.io.File;
import java.util.Scanner;

/*

Program: MyFileP1.java          Last Date of this Revision: Apr 7, 2022

Purpose: 

Author: Qasim Amar, 
School: CHHS
Course: Computer Programming 30
 
*/

public class MyFileP1 {


	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		String F;
		
		do {
			
		System.out.println("Enter File Name: ");
		F = input.next();
		
		File textFile = new File(F);
		
	
		if (textFile.exists()) 
		{
			System.out.println("File already exists.");
		} 
		
		else 
		{
			System.out.println("File does not exist.");
		}
		
		
	} 
		while(true);
	}

}


/* Screen Dump

Enter File Name: 
C:\Users\54150001\Desktop\code.txt
File already exists.
Enter File Name: 
C:\Users\54150001\Desktop\hello
File does not exist.

*/