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

    while (true) {

        System.out.println("Distance: " + sonar.getDistance() + " mm");
       

    for(int i=0; i<4; i++ ) {
   
   
   
    if (sonar.getDistance() < 300) {
    ///Turn in one direction
       leftMotors.setTargetVelocity(1);
       rightMotors.setTargetVelocity(-1);


       //Wait for 1 second
       Thread.sleep(1240);
    } else {
       
   
    //Move forward at full speed
    leftMotors.setTargetVelocity(-1);
    rightMotors.setTargetVelocity(-1);
 
    //Wait for 2 second
    Thread.sleep(1500);
   
    leftMotors.setTargetVelocity(0);
    rightMotors.setTargetVelocity(0);
    Thread.sleep(800);

  ///Turn in one direction
    leftMotors.setTargetVelocity(1);
    rightMotors.setTargetVelocity(-1);


    //Wait for 1 second
    Thread.sleep(620);
    leftMotors.setTargetVelocity(0);
    rightMotors.setTargetVelocity(0);
    Thread.sleep(800);
    }
    }
     
    }
}
}
