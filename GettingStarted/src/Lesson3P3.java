/*

Program: Lesson3P3.java          Last Date of this Revision: May 22, 2022
Purpose: Modify your code to the count the total number of button presses.

Author: Qasim Amar
School: CHHS
Course: CS30

*/

//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file. 
import com.phidget22.*;

public class Lesson3P3 {
	
    public static void main(String[] args) throws Exception{

        int counter = 0;
         
         //Create | Create objects for your buttons and LEDs.
         DigitalInput redButton = new DigitalInput();
         DigitalOutput redLED = new DigitalOutput();
         DigitalInput greenButton = new DigitalInput();
         DigitalOutput greenLED = new DigitalOutput();

         //Address | Address your four objects which lets your program know where to find them.
         redButton.setHubPort(0);
         redButton.setIsHubPortDevice(true);
         redLED.setHubPort(1);
         redLED.setIsHubPortDevice(true);
         greenButton.setHubPort(5);
         greenButton.setIsHubPortDevice(true);
         greenLED.setHubPort(4);
         greenLED.setIsHubPortDevice(true);

         //Open | Connect your program to your physical devices.
         redButton.open(1000);
         redLED.open(1000);
         greenButton.open(1000);
         greenLED.open(1000);

         //Use your Phidgets | This code will turn on the LED when the matching button is pressed and turns off the LED when the matching button is released. The sleep function slows down the loop so the button state is only checked every 150ms.
         while(true){
             
             if( redButton.getState()){
                 redLED.setState(true);
                 counter++;
                 System.out.println("The buttons have been pressed " + counter + " time thus far ");
             } else {
                 redLED.setState(false);
             }

             if(greenButton.getState()){
                 greenLED.setState(true);
                 counter++;
                 System.out.println("The buttons have been pressed " + counter + " time thus far ");
             } else {
                 greenLED.setState(false);
             }
                 
             Thread.sleep(150);
             
         }
     }
 }
   

