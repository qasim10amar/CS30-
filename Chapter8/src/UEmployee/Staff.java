/*

Program: Staff.java          Last Date of this Revision: 

Purpose: An application that takes in information about the job and outputs it

Author: , 
School: CHHS
Course: Computer Programming 30
 

*/

package UEmployee;

import java.text.NumberFormat;


public class Staff extends UEmployee
{
    String job;
    NumberFormat money = NumberFormat.getCurrencyInstance();
    //Taking in name, salary and the job he choose
    	public Staff(String person, Double salary, String title) 
        {        
            //Sending values to parent classes
            super(person, salary, title);
            //Assinging job to a public varaible
            job = title;
	}
        
        //Creating a way to output job
        public String Job()
        {
            return(job);
        }
            
        //creating a sentance for the class
        public String toString() {
	 	return(super.getEmployee() + " makes " + money.format(super.getSalary()) + " and works as a " + Job());
	}
}
/* Screen Dump:

*/