package org.usfirst.frc5563.RobotOffical.commands;

import org.usfirst.frc5563.RobotOffical.Robot;
import org.usfirst.frc5563.RobotOffical.subsystems.Intake;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class TakeInCommand extends Command {

	private double intakeSpeed;
	private boolean isTakeIn = true;
	
    public TakeInCommand(boolean direction) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	isTakeIn = direction;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if (isTakeIn) {
    		Robot.intake.intake(1.0);
    	}else{
    		Robot.intake.intake(-1.0);
    	}
    	Timer.delay(.05);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.intake.intake(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
