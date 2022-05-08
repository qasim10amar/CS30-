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
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);	
		String fileName;
		boolean Running = true;
		do {
			
			System.out.println("Enter File Name: ");
			fileName = input.nextLine();
			File textFile = new File(fileName);
		
			if (textFile.exists()) 
			{
				System.out.println("Enter word/phrase to search: ");
				String searchWord = input.nextLine();
				System.out.println("Enter word/phrase to replace with: ");
				String replacementWord = input.nextLine();
				
				String line, newLine;
				try {
				
				FileReader in = new FileReader(textFile);
				BufferedReader readFile = new BufferedReader(in);
				StringBuffer inputBuffer = new StringBuffer();
				
				while ((line = readFile.readLine()) != null) {
					newLine = line.replace(searchWord, replacementWord);
					inputBuffer.append(newLine);
		            inputBuffer.append('\n');
				}
					
				readFile.close();
				in.close();
				
				// write the new string with the replaced line OVER the same file
		        FileOutputStream fileOut = new FileOutputStream(fileName);
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
				Running = false;
			} 
			
			else 
			{
				System.out.println("File does not exist.");
			}
		} 
		while(Running);
		
	}

}

