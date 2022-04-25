import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
	
		File dataFile = new File("StuScores.dat");
		FileWriter out;
		BufferedWriter = writeFile;
		Scanner input = new Scanner(System.in);
		double score;
		String name;

		try {
			out = new FileWriter(dateFile);
			writeFile = new BufferedWriter(out);
			for (int i = 0; i < 5; i++) {
				System.out.print("Enter student name: ");
				name = input.next();
				System.out.print("Enter test score: ");
				score = input.nextDouble();
				writeFile.write(name);
				writeFile.newLine();
				writeFile.write(String.valueOf(score));
				writeFile.newLine();
			}
			writeFile.close();
			out.close();
			System.out.println("Data written to file.");
		}   catch (IOException e) {
			System.out.println("Problem writing to file.");
			System.err.println("IOException: " + e.getMessage());
		}
	}

}


/* Screen Dump
 
*/