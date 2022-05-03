import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Scanner;

/*

Program: StatsP2.java          Last Date of this Revision: Apr 11, 2022

Purpose: 

Author: Qasim Amar, 
School: CHHS
Course: Computer Programming 30
 
*/



public class StatsP2 {


	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		FileWriter out;
		BufferedWriter writeFile;
		String Name;
		Double Score;
		int NumScore;	
		double Avg;
		double[] Grades;
		double lowest;
		double highest;
		double TotScore = 0;
		NumberFormat percent = NumberFormat.getPercentInstance();
		

		File dataFile = new File("GradeReport.txt");

		try {
		out = new FileWriter(dataFile);
		writeFile = new BufferedWriter(out);

		System.out.println("Enter your Name : ");
		Name=input.nextLine();
		writeFile.write(Name);
		writeFile.newLine();

		System.out.println("How many Scores would you Like to Enter? : ");
		NumScore = input.nextInt();
		Grades = new double[NumScore];

		System.out.println("Enter " + NumScore + " class Score: ");

		for( int i =0; i<NumScore; i++) {
		Score=input.nextDouble();
		TotScore += Score;
		Grades[i] = Score;
		writeFile.write(String.valueOf(Score));
		writeFile.newLine();
		}

		Avg = TotScore/NumScore;

		    highest =Grades[0];
		    lowest=Grades[0] ;
		   
		    for (int i = 1; i < Grades.length; i++) 
		    {
		    if (Grades[i] > highest)
		    highest = Grades[i];
		    else if (Grades[i] < lowest)
		    lowest = Grades[i];
		    }
		   
		    System.out.print( "\n" + Name + "\n" + "Average = " + percent.format(Avg/100)
		    + "\n" + "Lowest Score :" + lowest + "\n" + "Highest Score: " + highest);
		   
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

		

/* Screen Dump
 
Enter your Name : 
Qasim Amar
How many Scores would you Like to Enter? : 
5
Enter 5 class Score: 
100
95
78
67
83

Qasim Amar
Average = 85%
Lowest Score :67.0
Highest Score: 100.0
 
*/
 
