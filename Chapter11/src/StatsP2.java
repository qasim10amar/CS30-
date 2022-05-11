import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Scanner;

/*

Program: StatsP2.java          Last Date of this Revision: Apr 14, 2022

Purpose: Modify the Stats application to allow the user to enter the names and grades of the students.

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
String fileName;
File dataFile;
NumberFormat percent = NumberFormat.getPercentInstance();

//User enters name of the file object which is created
System.out.println("Enter the name of the file: ");
fileName=input.next();
dataFile = new File(fileName);
input.nextLine();

try {
	
out = new FileWriter(dataFile);
writeFile = new BufferedWriter(out);

//Prompts user to enter name
System.out.println("Enter your Name : ");
Name=input.nextLine();

//Writes the name in the file
writeFile.write(Name);

writeFile.newLine();

//Asks user for number of test scores to enter
System.out.println("How many Scores would you Like to Enter? : ");
NumScore = input.nextInt();

//Creates a array that holds each individual mark
Grades = new double[NumScore];

//Asks the user to enter test scores
System.out.println("Enter " + NumScore + " class Score: ");

//Writes all test scores into file and the array
for( int i =0; i<NumScore; i++) {
Score=input.nextDouble();
TotScore += Score;
Grades[i] = Score;
writeFile.write(String.valueOf(Score));
writeFile.newLine();
}

//Calculates average score
Avg = TotScore/NumScore;

   //Calculates lowest and highest score
   highest =Grades[0];
   lowest=Grades[0] ;
   for (int i = 1; i < Grades.length; i++)
   {
   if (Grades[i] > highest)
   highest = Grades[i];
   else if (Grades[i] < lowest)
   lowest = Grades[i];
   }
 
   //Displays the name and lowest, highest, and average score
   System.out.print( "\n" + "Name: " + Name + "\n" + "Average = " + percent.format(Avg/100)
   + "\n" + "Lowest Score :" + percent.format(lowest/100) + "\n" + "Highest Score: " + percent.format(highest/100));
 
   //Stops writing in the file
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
 
Enter the name of the file:
Marks
Enter your Name :
Qasim Amar
How many Scores would you Like to Enter? :
5
Enter 5 class Score:
100
92
83
74
87

Name: Qasim Amar
Average = 87%
Lowest Score :74%
Highest Score: 100%
 
*/

 
