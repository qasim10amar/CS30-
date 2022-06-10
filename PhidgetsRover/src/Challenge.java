/*

Program: Challenge.java          Last Date of this Revision: June 9, 2022

Purpose: An application that 

Author: Create a program that moves your rover around the square of tape.
School: CHHS
Course: Computer Programming 30
 

*/

//Add Phidgets Library
import com.phidget22.*;

public class Challenge {
public static void main(String[] args) throws Exception {

    //Connect to wireless rover
    Net.addServer("", "192.168.100.1", 5661, "", 0);

    //Create
    DCMotor leftMotors = new DCMotor();
    DCMotor rightMotors = new DCMotor();
    DistanceSensor sonar = new DistanceSensor();

    //Address
    leftMotors.setChannel(0);
    rightMotors.setChannel(1);

    //Open
    leftMotors.open(5000);
    rightMotors.open(5000);
    sonar.open(5000);

    
    int i = 0;
    boolean running = true;
    boolean normal = true;
    while (running) {

        System.out.println("Distance: " + sonar.getDistance() + " mm");
       
        if (sonar.getDistance() < 800) {
            Turn180(rightMotors, leftMotors);
            i = 0;
            if (normal) {
            	normal =  false;
            }
            else {
            	normal = true;
            }
        } 
        else {
        	Forward(rightMotors, leftMotors);
        	if (normal) {
        		Left(rightMotors, leftMotors);
        	}
        	else {
        		Right(rightMotors, leftMotors);
        	}
        }
        i++;
        if (i > 3) {
        	running = false;
        }
    }

}
     
    public static void Turn180(DCMotor rightMotors, DCMotor leftMotors) throws Exception {
  	  //Turn in one direction
        leftMotors.setTargetVelocity(1);
        rightMotors.setTargetVelocity(-1);

        //Wait for 2 second
        Thread.sleep(1000);

        //Stop motors
        leftMotors.setTargetVelocity(0);
        rightMotors.setTargetVelocity(0);
        
        //Wait for 2 second
        Thread.sleep(2000);
    }
    
    public static void Forward(DCMotor rightMotors, DCMotor leftMotors) throws Exception {
  	  //Turn in one direction
        leftMotors.setTargetVelocity(-1);
        rightMotors.setTargetVelocity(-1);

        //Wait for 2 second
        Thread.sleep(1200);

        //Stop motors
        leftMotors.setTargetVelocity(0);
        rightMotors.setTargetVelocity(0);
        
        //Wait for 2 second
        Thread.sleep(2000);
    }
    
    public static void Left(DCMotor rightMotors, DCMotor leftMotors) throws Exception {
    	  //Turn in one direction
          leftMotors.setTargetVelocity(1);
          rightMotors.setTargetVelocity(-1);

          //Wait for 2 second
          Thread.sleep(750);

          //Stop motors
          leftMotors.setTargetVelocity(0);
          rightMotors.setTargetVelocity(0);
          
          //Wait for 2 second
          Thread.sleep(2000);
      }
    
    public static void Right(DCMotor rightMotors, DCMotor leftMotors) throws Exception {
  	  //Turn in one direction
        leftMotors.setTargetVelocity(-1);
        rightMotors.setTargetVelocity(1);

        //Wait for 2 second
        Thread.sleep(750);

        //Stop motors
        leftMotors.setTargetVelocity(0);
        rightMotors.setTargetVelocity(0);
        
        //Wait for 2 second
        Thread.sleep(2000);
    }
  }
