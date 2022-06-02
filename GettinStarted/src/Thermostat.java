
//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file. 
import com.phidget22.*;
import static java.lang.Math.abs;

public class Thermostat {
    public static void main(String[] args) throws Exception{

       int temp = 21;
       final int setTemp = 21;
       int counter=0;
       boolean print;
       int s = 10000;
        
        

        //Create | Here you have created a TemperatureSensor object. TemperatureSensor is a class in your Phidgets library that gathers temperature data from your Phidget. 
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        DigitalOutput redLED = new DigitalOutput();
        DigitalOutput greenLED = new DigitalOutput();
        DigitalInput greenButton = new DigitalInput();
        DigitalInput redButton = new DigitalInput();
        
        //Address 
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        
        //Open | Open establishes a connection between your object and your physical Phidget. You provide a timeout value of 1000  to give the program 1000 milliseconds (1 second) to locate your Phidget. If your Phidget can't be found, an exception will be thrown.
        temperatureSensor.open(1000);
        redLED.open(1000);
        greenLED.open(1000);
        greenButton.open(1000);
        redButton.open(1000);
       
        //Use your Phidgets | This code will print the temperature every 150ms
        while (true) {
            
            
           counter++;
         if (greenButton.getState()) {
           temp++;
       } else if ( redButton.getState()) {
           temp--;
       } else if ( abs(setTemp - temp) == 2 || abs(setTemp - temp) == 1 || abs(setTemp - temp) == 0) {
            greenLED.setState(true);
            redLED.setState(false);

        } else if (( abs(setTemp - temp) != 2)){
            redLED.setState(true);
            greenLED.setState(false);
        } 
         
         Thread.sleep(200);
    }

    }
} 