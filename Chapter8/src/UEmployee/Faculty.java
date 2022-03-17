/*

Program: Faculty.java          Last Date of this Revision: 2-Oct-2020

Purpose: An application that takes in information about the department and outputs it

Author: Hamza Amar, 
School: CHHS
Course: Computer Programming 30
 

*/
package UEmployee;

import java.text.NumberFormat;


public class Faculty extends UEmployee
{
    String ward;
    NumberFormat money = NumberFormat.getCurrencyInstance();
    //Taking in name, salary and the department he choose
    public Faculty(String person, Double salary, String department) 
        {            
            //Assinging department to public variable
            super(person, salary, department);
            ward = department;
	}
    //Creating class to send department name
    public String getDepartment()
        {
            return(ward);
        }
            
        
    //Outputting the string as a whole sentance
    public String toString() 
        {
            return(super.getEmployee() + " makes " + money.format(super.getSalary()) + " and works in the " + getDepartment() + " department");
        }
}
/* Screen Dump:

*/