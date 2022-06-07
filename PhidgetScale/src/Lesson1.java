/*
Program: Lesson1.java     Last Date of this Revision:  June 3, 2022
Author: Qasim Amar 
School: CHHS
Course: Computer Programming 30
 
*/

//Add Phidgets Library
import com.phidget22.*;

public class Lesson1 {
    public static void main(String[] args) throws Exception{

        //Create
        VoltageRatioInput scale = new VoltageRatioInput();
        
        //Open
        scale.open(1000);
        
        //Use your Offset Value
        double offsetValue = 9.650937286043045E-4;

        
        //Use your Phidgets
        while(true){

            //Calculate Weight (kg)
            double weight = 4700 * (scale.getVoltageRatio() - offsetValue);
            
            //Display Weight
            System.out.println(String.format("%.3f kg", weight));      
            
            
            //Display Weight in Grams
            /*
            System.out.println(String.format("%.3f g", weight*1000));      
            */
            
            //Display Weight in Pounds
            /*
            System.out.println(String.format("%.3f lbs", weight*2.205));      
            */
            
            Thread.sleep(250);
        }
    }    
}

/* 
Screen Dump;
-4.728 kg
-4.728 kg
-4.266 kg
-4.309 kg
-4.107 kg
*/