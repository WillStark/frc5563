package org.usfirst.frc5563.RobotOffical.commands;

import org.usfirst.frc5563.RobotOffical.Robot;

import edu.wpi.first.wpilibj.Preferences;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class MoveArmCommand extends Command {

	private double intakeSpeed;
	private boolean isForward = true;
	
    public MoveArmCommand(boolean direction) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	this.isForward = direction;
    	requires(Robot.lifter);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Preferences prefs = Preferences.getInstance();
    	intakeSpeed = prefs.getDouble("Intake Speed", .1);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(isForward) {
    		Robot.lifter.liftUp(intakeSpeed);
    	} else {
    		Robot.lifter.liftUp(-intakeSpeed);
    	}
    	Timer.delay(.05);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.lifter.liftUp(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
