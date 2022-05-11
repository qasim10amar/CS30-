/*

Program: StatsP1.java          Last Date of this Revision: Apr 11, 2022

Purpose: Create a Stats application that reads names and scores from a data file names test1.dat and then display each name and score and average, lowest, and highest score.

Author: Qasim Amar, 
School: CHHS
Course: Computer Programming 30
 
*/

import java.io.*;
import java.text.NumberFormat;

public class StatsP1 {

		
		public static void main(String[] args) {
			
			int NumScore = 0;
			double Avg;
			double TotScore = 0;
			double lowest = 100; 
			double highest = 0;
			String Name;
			String Score;
			
			//Times number by 100 and adds percent sign
			NumberFormat percent = NumberFormat.getPercentInstance();
			
			//Creates new file named test1.dat
			File dataFile= new File("test1.dat");


			FileReader in;
			BufferedReader readFile;

			try {
			
			
			in = new FileReader(dataFile);
			readFile = new BufferedReader(in);
			
			//Writes the name to the file
			Name=readFile.readLine();
			System.out.println(Name);
			   
			//Reads file until nothing is left to read
			while ((Score = readFile.readLine()) != null) {
				
			
			//Calculates absolute lowest score
			Double Test = Double.parseDouble(Score);
			if (Test < lowest) {
				lowest = Test;
			}
			
			//Calculates absolute highest score
			if (Test > highest) {
				highest = Test;
			}
			
			//Holds the scores
			TotScore+= Double.parseDouble(Score);
			
			//Counts number of scores entered
			NumScore+=1;
			
			//Displays the scores entered
			System.out.println(Score);
			   
			}
			
			//Displays the name and the lowest, highest, and average score
		    Avg = TotScore/NumScore;
		    System.out.print( "\n" + "Name: " + Name + "\n" + "Average = " + percent.format(Avg/100)
		    + "\n" + "Lowest Score :" + percent.format(lowest/100) + "\n" + "Highest Score: " + percent.format(highest/100));
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
 
Qasim Amar
43
100
56
78
93

Name: Qasim Amar
Average = 74%
Lowest Score :43%
Highest Score: 100%
 
*/