package Roster;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
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
