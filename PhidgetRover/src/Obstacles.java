/*

Program: Obstacles.java          Last Date of this Revision: Jun 8, 2022
Purpose: Learn how to avoid obstacles using your Sonar Phidget.

Author: Qasim Amar
School: CHHS
Course: CS30

*/

//Add Phidgets Library
import com.phidget22.*;

public class Obstacles {
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
         
          if (sonar.getDistance() < 200) {
              //Object detected! Stop motors
              leftMotors.setTargetVelocity(1);
              rightMotors.setTargetVelocity(1);
          } else {
              //Move forward slowly (25% max speed)
              leftMotors.setTargetVelocity(-0.25);
              rightMotors.setTargetVelocity(-0.25);
          }

          //Wait for 100 milliseconds
          Thread.sleep(100);
      }
  }
}