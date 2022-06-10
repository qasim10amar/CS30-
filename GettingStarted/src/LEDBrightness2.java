/*

Program: LEDBrightness2.java          Last Date of this Revision: May 22, 2022
Purpose: Modify your program so the brightness of your LED slowly increases and decreases before turning off.

Author: Qasim Amar
School: CHHS
Course: CS30

*/


//Add Phidgets Library 
import com.phidget22.*;

public class LEDBrightness2 {
    //Handle Exceptions 
    public static void main(String[] args) throws Exception{

        //Create 
        DigitalOutput redLED = new DigitalOutput();

        //Address 
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);

        //Open 
        redLED.open(1000);

        //Use your Phidgets with Duty Cycle | Duty Cycle controls the power to your Phidget (Digital Output object). Duty Cycle values range from 0.0 - 1.0.);
        boolean running = true;
        double x = 0;
        double rate = 0.1;
        while (running) {
        	redLED.setDutyCycle(x);
        	x += rate;
        	if (x > 0.9) {
        		rate *= -1;
        	}
        	if (x < 0.1) {
        		running = false;
        	}
            Thread.sleep(100);
        }
        redLED.setDutyCycle(0);
    }
}
  
 



