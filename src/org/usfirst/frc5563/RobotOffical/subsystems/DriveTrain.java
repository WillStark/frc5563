// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5563.RobotOffical.subsystems;

import org.usfirst.frc5563.RobotOffical.RobotMap;
import org.usfirst.frc5563.RobotOffical.commands.*;
import edu.wpi.first.wpilibj.command.Subsystem;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS

import edu.wpi.first.wpilibj.drive.DifferentialDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class DriveTrain extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
      private final DifferentialDrive differentialDrive1 = RobotMap.driveTrainDifferentialDrive1;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new DriveCommand());
    }

	public void drive(double rawAxis, double rawAxis2) {
		// TODO Auto-generated method stub
		differentialDrive1.tankDrive(-.85*rawAxis, -.85*rawAxis2, true);
		differentialDrive1.setSafetyEnabled(false);
		//driveSlow = Robot.driveTrain.drive(-.5, -.5);
		//driveFast = Robot.driveTrain.drive(-.75, -.75);
		//stop = Robot.driveTrain.drive(0,0);
		//turnLeft = 
		//turnRight =
	}
	
	public void rightTurn(){
		this.drive(-0.85,0.95);	
	}
	
	public void leftTurn(){
		this.drive(0.95,-0.85);	
	}

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

}

