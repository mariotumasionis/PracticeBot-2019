/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class PneumaticSubsystem extends Subsystem {

  //Compressor and accompanying solenoids
public static Compressor c = new Compressor(10);
public static DoubleSolenoid transmission = new DoubleSolenoid(10,0,1);
public static DoubleSolenoid random1 = new DoubleSolenoid(10,2,3);
public static DoubleSolenoid random2 = new DoubleSolenoid(10,4,5);


  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
