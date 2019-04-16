/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;



/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;

// Motor Controllers
public static int leftMasterPort = 1;
public static int leftSlavePort = 2;
public static int rightMasterPort = 3;
public static int rightSlavePort = 4;

// Driver + Co Controllers
public static int driverPort = 0;
public static int copilotPort = 1;

//PneumaticSubsystem
// DriveSubsystem 

public static final int cimMaxRPM = 5310;
public static final int cimCoderSensorUnitsPerRotation = 80 ;
public static final double LowGearRatio = 7.56 ;
public static final double HighGearRatio = 22.67;
public static final double wheelDiameter = 6; // inches

// Random Doohickeys

// Formula for distance 
//(cimMaxRPM  / 600) * (SensorUnitsPerRotation / LowGearRatio) MAX ENCODER VELOCITY 

/*
Encoder enc;
enc = new Encoder(0, 1, false, Encoder.EncodingType.k4X);
*/


}
