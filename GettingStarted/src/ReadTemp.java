/*

Program: ReadTemp.java          Last Date of this Revision: May 22, 2022
Purpose: Convert temperature data from degrees Celsius to degrees Fahrenheit.

Author: Qasim Amar
School: CHHS
Course: CS30

*/

//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file. 
import com.phidget22.*;
import java.text.*;

public class ReadTemp {
    public static void main(String[] args) throws Exception{

        //Create | Here you have created a TemperatureSensor object. TemperatureSensor is a class in your Phidgets library that gathers temperature data from your Phidget. 
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        
        DecimalFormat df = new DecimalFormat("0.00");
        
        //Open | Open establishes a connection between your object and your physical Phidget. You provide a timeout value of 1000  to give the program 1000 milliseconds (1 second) to locate your Phidget. If your Phidget can't be found, an exception will be thrown.
        temperatureSensor.open(1000);

        //Use your Phidgets | This code will print the temperature every 150ms
        while (true) {
            System.out.println("Temperature: " + (df.format(temperatureSensor.getTemperature()*1.8 +32) + " �F" ));
            Thread.sleep(150);
        }
    }
}
  