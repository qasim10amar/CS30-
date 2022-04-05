/*

Program: UEmployee.java          Last Date of this Revision: 18-Mar-2022

Purpose: An application that takes in information about the user name and salary

Author: Qasim Amar, 
School: CHHS
Course: Computer Programming 30
 

*/

package UEmployee;


public class UEmployee 
{
    //Creating public variables
    String employee;
    Double salary;
    
    //Having constructor take name, salary and their choice
    public UEmployee(String name, Double sal, String choice) 
    {
        employee = name;
        salary = sal;
    }
    
    //Creating class to output the name
    public String getEmployee() 
    {
	return(employee);
    }
    
    //Creating class to output their salary
    public Double getSalary()
    {
        
        return(salary);
    }
    
}
