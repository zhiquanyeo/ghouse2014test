/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package edu.wpi.first.wpilibj.templates;


import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SimpleRobot;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the SimpleRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class DemoRobot extends SimpleRobot {
    //Robot components
    //RobotDrive chassis = new RobotDrive(1,2);
    
    //Two stick drive?
    Joystick leftStick = new Joystick(1);
    //Joystick rightStick = new Joystick(2);
    
    
    
    /**
     * This function is called once each time the robot enters autonomous mode.
     */
    public void autonomous() {
        
    }

    /**
     * This function is called once each time the robot enters operator control.
     */
    public void operatorControl() {
        //Turn safety on
        //chassis.setSafetyEnabled(true);
        while(isOperatorControl() && isEnabled()) {
            System.out.println("X: " + leftStick.getX() + 
                                ", Y: " + leftStick.getY() + 
                                ", Z: " + leftStick.getZ());
            //chassis.tankDrive(leftStick, rightStick);
        }
    }
    
    /**
     * This function is called once each time the robot enters test mode.
     */
    public void test() {
    
    }
}
