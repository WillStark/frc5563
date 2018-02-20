package org.usfirst.frc5563.RobotOffical.subsystems;


import org.usfirst.frc5563.RobotOffical.RobotMap;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */

public class Intake extends Subsystem {
    public static WPI_VictorSPX intakeVictorSPX4 = RobotMap.intakeVictorSPX4;
    public static WPI_VictorSPX intakeVictorSPX5 = RobotMap.intakeVictorSPX5;
   // private final DifferentialDrive differentialDrive2 = RobotMap.differentialDrive2;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
	public void intake(double value) {
		intakeVictorSPX4.set(value);
		intakeVictorSPX5.set(-value);
	}
}

