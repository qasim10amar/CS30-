/*

Program: StatsP1.java          Last Date of this Revision: Apr 11, 2022

Purpose: 

Author: Qasim Amar, 
School: CHHS
Course: Computer Programming 30
 
*/

import java.io.*;

public class StatsP1 {

		
		public static void main(String[] args) {
			
		
			 File dataFile= new File("scores. dat");
			 FileReader in;
			 BufferedReader readFile;
			 String score;
			 double avgScore;
			 double totalScores = 0;
			 int numScores = 0;

			 try {

			 in = new FileReader(dataFile);
			 readFile = new BufferedReader(in);
			 while ((score= readFile.readLine ()) != null ) {
			 numScores += 1;
			 System.out.println(score);
			 totalScores += Double.parseDouble (score);
			 }
			 avgScore = totalScores / numScores;
			 System. out.println("Average =" + avgScore);
			 readFile.close();
			 in.close();
			 }
			 catch (FileNotFoundException e)
			 {
			 System. out. println("File does not exist or could not be found.");
			 System.err.println("FileNotFoundException:" + e. getMessage ());
			 }
			 catch (I0Exception e)
			 {
			 System.out.println("Problem reading file.");
			 System.err.println("I0Exception: "+ e.getMessage());

			 }
	}

}


/* Screen Dump
 
*/