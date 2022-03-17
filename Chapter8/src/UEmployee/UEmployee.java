/*

Program: UEmployee.java          Last Date of this Revision: 2-Oct-2020

Purpose: An application that takes in information about the user name and salary

Author: Hamza Amar, 
School: CHHS
Course: Computer Programming 30
 

*/

package UEmployee;


public class UEmployee 
{
    //Creating public varaibles
    String employee;
    Double salary;
    
    //Having constructer take name, salary and thier choice
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
/* Screen Dump:

*/