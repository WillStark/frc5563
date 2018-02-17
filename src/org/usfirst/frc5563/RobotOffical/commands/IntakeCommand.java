package org.usfirst.frc5563.RobotOffical.commands;

import org.usfirst.frc5563.RobotOffical.Robot;

import edu.wpi.first.wpilibj.Preferences;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class IntakeCommand extends Command {

	private double intakeSpeed;
	
    public IntakeCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.lifter);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Preferences prefs = Preferences.getInstance();
    	intakeSpeed = prefs.getDouble("Intake Speed", .1);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	Robot.lifter.liftUp(intakeSpeed);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
