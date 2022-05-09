/*

Program: StuRoster.java          Last Date of this Revision: Apr 14, 2022

Purpose: Create a Roster application that prompts user for the name of the file to store student names and then prompts the user for the number of students in the class, the first and last name and then stores and displays the roster.

Author: Qasim Amar,
School: CHHS
Course: Computer Programming 30
 
*/

package Roster;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StuRoster{
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int NameAmount;
		FileWriter out;
		BufferedWriter writeFile;
		String fileName;
		File dataFile;
		BufferedReader readFile;
		FileReader in;
		String StuName;
		int z = 1;
		
		System.out.println("Enter the name of the file: ");
		fileName=input.next();
		dataFile = new File(fileName);
		input.nextLine();
		
		System.out.println("How many names would you like to enter? : ");
		NameAmount = input.nextInt();
		input.nextLine();
		
	try {
		out = new FileWriter(dataFile);
		writeFile = new BufferedWriter(out);
		for (int i = 0; i < NameAmount; i++) {
			System.out.println("Enter first and last name of student " + (i+1) + " :");
			String Name = input.nextLine();
			StuName student = new StuName(Name);
			writeFile.write(student.toString());
			writeFile.newLine();
		}
		
		writeFile.close();
		out.close();
		
		in = new FileReader(dataFile);
	    readFile = new BufferedReader(in);
		while ((StuName = readFile.readLine()) != null) {
		   
		    System.out.println("\n" + "Student " + z + ": " + StuName);
		    z++;
		}
		readFile.close();
		in.close();
		
		
	    }
		catch (FileNotFoundException e) {

		System.out.println("File does not exist or could not be found.");
		System.err.println("FileNotFoundException: " + e.getMessage());

		}
		catch (IOException e) {
		System.out.println("Problem reading file.");
		System.err.println("IOException: " + e.getMessage());

		  }

		}
	 
}

/* Screen Dump

Enter the name of the file: 
Roster
How many names would you like to enter? : 
5
Enter first and last name of student 1 :
Qasim Amar
Enter first and last name of student 2 :
John Jo
Enter first and last name of student 3 :
Mike Smith
Enter first and last name of student 4 :
David Pitt
Enter first and last name of student 5 :
Smith Mason

Student 1: Qasim Amar

Student 2: John Jo

Student 3: Mike Smith

Student 4: David Pitt

Student 5: Smith Mason

 
*/



