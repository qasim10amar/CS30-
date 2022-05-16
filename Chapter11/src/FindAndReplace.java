/*

Program: FindAndReplace.java          Last Date of this Revision: Apr 14, 2022

Purpose: Create a FindAndReplace Application that prompts user for file name, a search word or phrase and a replacement word or phrase.

Author: Qasim Amar,
School: CHHS
Course: Computer Programming 30
 
*/


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import Roster.StuName;

public class FindAndReplace {

	public static void main(String[] args) {
		
		//Intilize varaible
		Scanner input = new Scanner(System.in);	
		String fileName;
		boolean Running = true;
		do {
			
			//Inputting File name
			System.out.println("Enter File Name: ");
			fileName = input.nextLine();
			File textFile = new File(fileName);
		
			//Checks to see if file name exist on computer
			if (textFile.exists()) 
			{
				//Asks user to input word to replace
				System.out.println("Enter word/phrase to search: ");
				String searchWord = input.nextLine();
				System.out.println("Enter word/phrase to replace with: ");
				String replacementWord = input.nextLine();
				
				//Initialize variables that will check each line of the file and replace with the new lines
				String line, newLine;
				try {
				
			    //Initialize file reader	
				FileReader in = new FileReader(textFile);
				BufferedReader readFile = new BufferedReader(in);
				StringBuffer inputBuffer = new StringBuffer();
				
				//Goes through each line in file till the end
				while ((line = readFile.readLine()) != null) {
					
					//Creates new line with the replaced word
					newLine = line.replace(searchWord, replacementWord);
					
					//Adds to input buffer
					inputBuffer.append(newLine);
		            inputBuffer.append('\n');
				}
					
				readFile.close();
				in.close();
				
				//Write the new string with the replaced line over the same file
		        FileOutputStream fileOut = new FileOutputStream(fileName);
		        
		        //Overwrites content in file with input buffer
		        fileOut.write(inputBuffer.toString().getBytes());
		        fileOut.close();
				}
				catch (FileNotFoundException e) {
					System.out.println("File does not exist or could not be found.");
					System.err.println("FileNotFoundException: " + e.getMessage());
					
					} 
					
				catch (IOException e) {
					System.out.println("Problem reading file.");
					System.err.println("IOException: " + e.getMessage());
					
					
					}
				//Exists loop when word is replaced
				Running = false;
			} 
			
			else 
			{
				//Tells user file does not exist if it doesn't
				System.out.println("File does not exist.");
			}
		} 
		
		//Keeps running loop when file doesn't exist
		while(Running);
		
	}

}

/* Screen Dump

Enter File Name: 
Test.txt
Enter word/phrase to search: 
spider
Enter word/phrase to replace with: 
ant

*/

