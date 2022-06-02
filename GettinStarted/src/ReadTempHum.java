/*

Program: ReadTempHum.java          Last Date of this Revision: May 22, 2022
Purpose 1: Only print the humidity if it is above 30%. If it is bellow 30% print “Humidity is low”.
Purpose 2: Only print the temperature if it is above 21°C (70°F). If the temperature is below 21°C, print "Room is too cold".

Author: Qasim Amar
School: CHHS
Course: CS30

*/

//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file. 
import com.phidget22.*;

public class ReadTempHum {
    public static void main(String[] args) throws Exception{

        //Create | Here you've created a HumiditySensor and a TemperatureSensor object for your Humidity Phidget. This allows you to access both temperature and humidity data from your Phidget.
        HumiditySensor humiditySensor = new HumiditySensor();
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Open | Open establishes a connection between your object and your physical Phidget. You provide a timeout value of 1000 to give the program 1000 milliseconds (1 second) to locate your Phidget. If your Phidget can't be found, an exception occur.
        humiditySensor.open(1000);
        temperatureSensor.open(1000);

        //Use your Phidgets | This code will print humidity and temperature read by the sensor every 150ms.
        while(true){
            
        	//Practice 1
            /*if ( humiditySensor.getHumidity() > 30) {
                System.out.println("Humidity: " + humiditySensor.getHumidity() +" %RH");
            } else {
                System.out.println("Humidity is low");
            }
            */
        	
            //Practice 2
            if (temperatureSensor.getTemperature()> 21) {
                System.out.println("Temperature: " + temperatureSensor.getTemperature() + " ℃" );
            } else {     
                System.out.println("Room is too cold");
            }
            
            
            Thread.sleep(150);
        }
    }
}