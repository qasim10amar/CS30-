/*

Program: University.java          Last Date of this Revision: 20-Mar-2022

Purpose: An application that tests the class of University and creates a profile for a person at the university

Author: Qasim Amar, 
School: CHHS
Course: Computer Programming 30
 

*/

package UEmployee;

import java.util.Scanner;

public class University 
{

    public static UEmployee assignEmployee() {
        //Creating variable for each value
		String firstName, lastName, department, job, choice;
                Double salary;
        //Creating scanner
		Scanner input = new Scanner(System.in);

        //Asking the user to input profile values
		System.out.print("What is your first name: ");
        firstName = input.nextLine();
		System.out.print("What is your last name: ");
		lastName = input.nextLine();
		System.out.print("What is your job: ");
		job = input.nextLine();
        System.out.print("What is your department: ");
        department = input.nextLine();
        System.out.print("Select either Job or Deparment: ");
		choice = input.nextLine();
        System.out.print("What is your salary: ");
		salary = input.nextDouble();

                //Creating a single string for name
                String name = firstName + " " + lastName;
                
                //Checking to see the choice the person made
                if (choice.equalsIgnoreCase("J"))
                {
                    //Sending value to staff if job is chosen
                    return(new Staff(name, salary, job));
                }
                else
                {
                    //Sending value to faculty if department is chosen
                    return(new Faculty(name, salary, department));
                }
                
    }
    

    public static void main(String[] args) 
    {   
        //Creating new objects for each employee
        UEmployee emp1, emp2, emp3;
        emp1 = assignEmployee();
        emp2 = assignEmployee();
	    emp3 = assignEmployee();

        //Outputting the information that the user inputed
        System.out.println("Universities Employees are: ");
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        
       
    }

}
/* Screen Dump:

What is your first name: Qasim
What is your last name: Amar
What is your job: Student
What is your department: Math
Select either Job or Deparment: D
What is your salary: 1000
What is your first name: John
What is your last name: Jones
What is your job: Engineer
What is your department: Science
Select either Job or Deparment: J
What is your salary: 25000
What is your first name: Mike
What is your last name: Cole
What is your job: Teacher
What is your department: English
Select either Job or Deparment: D
What is your salary: 12000
Universities Employees are: 
Qasim Amar makes $1,000.00 and works in the Math department
John Jones makes $25,000.00 and works as a Engineer
Mike Cole makes $12,000.00 and works in the English department

*/