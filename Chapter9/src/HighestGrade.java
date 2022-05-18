/*

Program: HighestGrade.java          Last Date of this Revision: May 16, 2022

Purpose: 

Author: Qasim Amar, 
School: CHHS
Course: Computer Programming 30
 

*/

import java.text.NumberFormat;
import java.util.Scanner;

public class HighestGrade {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double Grades[] = new double[5];
		double Grade;

		double greatest=0;

		NumberFormat percent = NumberFormat.getPercentInstance();

		System.out.println("Enter 5 Grades between 0-100: " + "\n");


		for(int i=0; i<Grades.length; i++) {
		System.out.println("Enter Grade: " + (i+1));


		Grades[i] = input.nextInt();
		if (Grades[i]>100) {
		System.out.println("Please only enter Grades between 0-100" + "\n");
		i--;

		}
		}

		for(int i=0; i<Grades.length; i++) {
		Grade =Grades[i];

		if(Grades[i] >= greatest) {
		greatest = Grade;
		}
		}

		System.out.println("The Highest Grade is: " + percent.format(greatest/100));

		if (greatest<= 50 && greatest >=0) {
		System.out.println("Fail ");
		}
		else if (greatest<= 70 && greatest >=50) {
		System.out.println("More Effort Needed ");
		}
		else if (greatest<= 80 && greatest >=70) {
		System.out.println("Nice Try ");
		}
		else if (greatest<= 90 && greatest >=80) {
		System.out.println("Good Job ");
		}
		else if (greatest<= 99 && greatest >=90) {
		System.out.println("Very Good ");
		}
		else if (greatest == 100) {
		System.out.println("Perfect ");
		}
		}

		
	}

/* Screen Dump

Enter 5 Grades between 0-100: 

Enter Grade: 1
55
Enter Grade: 2
102
Please only enter Grades between 0-100

Enter Grade: 2
76
Enter Grade: 3
93
Enter Grade: 4
86
Enter Grade: 5
77
The Highest Grade is: 93%
Very Good 

*/

