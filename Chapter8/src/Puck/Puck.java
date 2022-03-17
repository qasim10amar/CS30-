/*

Program: Puck.java          Last Date of this Revision: 

Purpose: An application that 

Author: Qasim Amar, 
School: CHHS
Course: Computer Programming 30
 

*/
package Puck;

public class Puck extends Disk 
{
    //Assigning variables for weights
    private double weight;
    private double maxStandard = 5.5;
    private double minStandard = 5.0;
    private double maxYouth = 4.5;
    private double minYouth = 4.0;
    
    //Creating to see which kind of puck
    public boolean standard, youth;
    
    //Making the constructor
    public Puck(double w)
    {
        //Sends values to disk
        super(1.5, 1); 
        
        weight = w;
        //Checking to see if you what kind of puck it is
        if (weight >= minStandard && maxStandard >= weight)
        {
            standard = true;
            youth = false;
        }
        else if (weight >= minYouth && maxYouth >= weight)
        {
            youth = true;
            standard= false;
        }
        else
        {
            youth = false;
            standard= false;
        }
        
    }
    
    //Creating class to tell weight
    public double getWeight()
        {
            return(weight);
        }
        
    //Class that outputs the type of puck into a string
    public String getDivision()
        {
            String div = "";
            
            if (standard)
            {
                div = "adult";
            }
            if (youth)
            {
                div = "youth";
            }
            return(div);
        } 
    
    //Checking to see if different pucks are the same weight
    public boolean equals(Object obj) 
    {
		Puck testObj = (Puck)obj;
		
	 	if (testObj.getWeight() == weight) 
	 		 {
			return(true);
		} else {
			return(false);
		}
	}
    
    //Creating the string output for the class puck
    public String toString() {
		String puckString;

		puckString = "The puck has a weight of " + weight +
					" and the puck is used in the " + getDivision() + " division.";
	 	return(puckString);
	}
}

	
	
	
	
	
	
	
	

