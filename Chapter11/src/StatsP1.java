/*

Program: StatsP1.java          Last Date of this Revision: Apr 11, 2022

Purpose: 

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
			String Name;
			String Score;
			NumberFormat percent = NumberFormat.getPercentInstance();
			File dataFile= new File("test1.dat");


			FileReader in;
			BufferedReader readFile;

			try {
			
			in = new FileReader(dataFile);
			readFile = new BufferedReader(in);
			Name=readFile.readLine();
			System.out.println(Name);
			   
			while ((Score = readFile.readLine()) != null) {
			TotScore+= Double.parseDouble(Score);
			NumScore+=1;
			System.out.println(Score);
			   
			}
			
		    Avg = TotScore/NumScore;
		    System.out.print("\n" + Name + " Average = " + percent.format(Avg/100));

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

Qasim Amar Average = 74%
 
*/