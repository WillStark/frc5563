// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5563.RobotOffical.commands;
import edu.wpi.first.wpilibj.Preferences;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc5563.RobotOffical.Robot;
import org.usfirst.frc5563.RobotOffical.RobotMap;

import com.ctre.phoenix.motorcontrol.NeutralMode;

/**
 *
 */
public class AutonomousCommandM extends Command {

	double autoSpeed;
	double autoDelay;
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
 
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
    public AutonomousCommandM() {
 

    	// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.driveTrain);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    	
    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
    	Preferences prefs = Preferences.getInstance();
    	autoSpeed = prefs.getDouble("Auto Speed", .75);
    	autoDelay = prefs.getDouble("Auto Delay",3.5);
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
    	RobotMap.driveTrainDifferentialDrive1.setSafetyEnabled(false);
    	RobotMap.driveTrainVictorSPX1.setNeutralMode(NeutralMode.Brake);
    	RobotMap.driveTrainVictorSPX2.setNeutralMode(NeutralMode.Brake);
    	RobotMap.driveTrainVictorSPX6.setNeutralMode(NeutralMode.Brake);
    	RobotMap.driveTrainVictorSPX7.setNeutralMode(NeutralMode.Brake);
    	Robot.driveTrain.drive(autoSpeed,(autoSpeed-.03));
    	Robot.lifter.liftUp(-.08); 
    	Timer.delay(2.2);
    	Robot.lifter.liftUp(0);
    	Robot.driveTrain.drive(0, 0);/**/
    	//or maybe this should be something driving to the sides.
    	RobotMap.driveTrainVictorSPX1.setNeutralMode(NeutralMode.Coast);
    	RobotMap.driveTrainVictorSPX2.setNeutralMode(NeutralMode.Coast);
    	RobotMap.driveTrainVictorSPX6.setNeutralMode(NeutralMode.Coast);
    	RobotMap.driveTrainVictorSPX7.setNeutralMode(NeutralMode.Coast);
    	RobotMap.driveTrainDifferentialDrive1.setSafetyEnabled(false);
  
    }
    

    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    @Override
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
    protected void interrupted() {
    }
}
