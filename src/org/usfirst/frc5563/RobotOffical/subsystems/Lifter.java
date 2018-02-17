package org.usfirst.frc5563.RobotOffical.subsystems;

import org.usfirst.frc5563.RobotOffical.RobotMap;
import org.usfirst.frc5563.RobotOffical.commands.IntakeCommand;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Lifter extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	   private final WPI_VictorSPX victorSPX3 = RobotMap.lifterVictorSPX3;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new IntakeCommand());
    }

	public void liftUp(double value) {
		victorSPX3.set(value);
	}
}
