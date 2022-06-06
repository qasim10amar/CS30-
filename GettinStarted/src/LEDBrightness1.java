/*

Program: LEDBrightness1.java          Last Date of this Revision: May 22, 2022
Purpose: Change your Duty Cycle value to 0, 0.5, and 1. Note what happens to your LED with each value.

Author: Qasim Amar
School: CHHS
Course: CS30

*/

import com.phidget22.DigitalOutput;

public class LEDBrightness1 {
	
	//Handle Exceptions 
	public static void main(String[] args) throws Exception{

       double count=0;  // count starts at zero 
       boolean incrementCount =true;
     
      //Create 
      DigitalOutput redLED = new DigitalOutput();

      //Address 
      redLED.setHubPort(1);
      redLED.setIsHubPortDevice(true);

      //Open 
      redLED.open(1000);

      //Use your Phidgets with Duty Cycle 
      
  
  while (true) {
      
      if (incrementCount==true && count <=.99) { // if incrementCount is true which it starts as true count will incremetn by .1
          count+=.1;
      }else{

          count-=.1;  // if incrementCount is not true is will decrement the count by.1
           
      }
      if(incrementCount && count>=.99 && count>=.10000000000000003 ){
                                    // conditional where if incrementCount is true and the count has reached the boundary increment count will be false 
                                   //will go to the else and start decrementing 
          incrementCount=false;
      } else {
        
      }
         
      System.out.println(count);
     
       
  
  
           
           
        redLED.setDutyCycle(count);
        Thread.sleep(1000);
  
  }
      
  }
 
  
  }