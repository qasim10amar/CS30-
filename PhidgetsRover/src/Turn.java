/*

Program: Turn.java          Last Date of this Revision: Jun 8, 2022
Purpose: Learn to turn rover.

Author: Qasim Amar
School: CHHS
Course: CS30

*/

//Add Phidgets Library
import com.phidget22.*;

public class Turn {

  public static void main(String[] args) throws Exception {


  	//Connect to wireless rover
      Net.addServer("", "192.168.100.1", 5661, "", 0);
  	//Create
      DCMotor leftMotors = new DCMotor();
      DCMotor rightMotors = new DCMotor();

      //Address
      leftMotors.setChannel(0);
      rightMotors.setChannel(1);

      //Open
      leftMotors.open(5000);
      rightMotors.open(5000);
     
//      //Move forward at full speed
//      leftMotors.setTargetVelocity(-1);
//      rightMotors.setTargetVelocity(-1);
//   
//      //Wait for 2 second
//      Thread.sleep(2000);
//     
//      //Turn in one direction
//      leftMotors.setTargetVelocity(1);
//      rightMotors.setTargetVelocity(-1);
//
//      //Wait for 2 second
//      Thread.sleep(2000);
//
//      //Stop motors
//      leftMotors.setTargetVelocity(0);
//      rightMotors.setTargetVelocity(0);
      Forward(rightMotors, leftMotors);
      Turn180(rightMotors, leftMotors);
      Forward(rightMotors, leftMotors);
      Turn180(rightMotors, leftMotors);
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
      Thread.sleep(2000);

      //Stop motors
      leftMotors.setTargetVelocity(0);
      rightMotors.setTargetVelocity(0);
      
      //Wait for 2 second
      Thread.sleep(2000);
  }
  
}
