/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.commands.DriveManually;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.subsystems.PneumaticSubsystem;
import frc.robot.OI;
/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  public static DriveSubsystem DriveSubsystem = new DriveSubsystem();
  public static PneumaticSubsystem PneumaticSubsystem = new PneumaticSubsystem();
  public static OI oi;
  boolean toggle;
  boolean belt;
  Command m_autonomousCommand;
  SendableChooser<Command> m_chooser = new SendableChooser<>();

  /**
   * This function is run when the robot is first started up and should be
   * used for any initialization code.
   */
  @Override
  public void robotInit() {

  oi = new OI();
  m_chooser.setDefaultOption("Default Auto", new DriveManually());
    // chooser.addOption("My Auto", new MyAutoCommand());
    SmartDashboard.putData("Auto mode", m_chooser);
  
Robot.PneumaticSubsystem.random1.set(Value.kOff);
Robot.PneumaticSubsystem.random2.set(Value.kOff);   


  }

  /**
   * This function is called every robot packet, no matter the mode. Use
   * this for items like diagnostics that you want ran during disabled,
   * autonomous, teleoperated and test.
   *
   * <p>This runs after the mode specific periodic functions, but before
   * LiveWindow and SmartDashboard integrated updating.
   */
  @Override
  public void robotPeriodic() {
  }

  /**
   * This function is called once each time the robot enters Disabled mode.
   * You can use it to reset any subsystem information you want to clear when
   * the robot is disabled.
   */
  @Override
  public void disabledInit() {
  }

  @Override
  public void disabledPeriodic() {
    Scheduler.getInstance().run();
  }

  /**
   * This autonomous (along with the chooser code above) shows how to select
   * between different autonomous modes using the dashboard. The sendable
   * chooser code works with the Java SmartDashboard. If you prefer the
   * LabVIEW Dashboard, remove all of the chooser code and uncomment the
   * getString code to get the auto name from the text box below the Gyro
   *
   * <p>You can add additional auto modes by adding additional commands to the
   * chooser code above (like the commented example) or additional comparisons
   * to the switch structure below with additional strings & commands.
   */
  @Override
  public void autonomousInit() {
    m_autonomousCommand = m_chooser.getSelected();

    /*
     * String autoSelected = SmartDashboard.getString("Auto Selector",
     * "Default"); switch(autoSelected) { case "My Auto": autonomousCommand
     * = new MyAutoCommand(); break; case "Default Auto": default:
     * autonomousCommand = new ExampleCommand(); break; }
     */

    // schedule the autonomous command (example)
    if (m_autonomousCommand != null) {
      m_autonomousCommand.start();
    }
  }

  /**
   * This function is called periodically during autonomous.
   */
  @Override
  public void autonomousPeriodic() 
  {
    Scheduler.getInstance().run();
  }

  @Override
  public void teleopInit() {
    // This makes sure that the autonomous stops running when
    // teleop starts running. If you want the autonomous to
    // continue until interrupted by another command, remove
    // this line or comment it out.


//DO NOT CHANGE
   belt = false;
   toggle = true;
    if (m_autonomousCommand != null) {
      m_autonomousCommand.cancel();
    }
  }


  /*
   * This function is called periodically during operator control.
   */
  @Override
  public void teleopPeriodic() 
  {
    PneumaticSubsystem.random1.set(Value.kReverse);
    PneumaticSubsystem.random2.set(Value.kForward);
    Scheduler.getInstance().run();
 
if (toggle && oi.driver.getRawButton(1)) { // Only execute once per Button push
  toggle = false;  // Prevents this section of code from being called again until the Button is released and re-pressed
  if (belt) {  // Decide which way to set the motor this time through (or use this as a motor value instead)
    belt= false;
    Robot.PneumaticSubsystem.transmission.set(Value.kForward);
  } else {
    belt= true;
    Robot.PneumaticSubsystem.transmission.set(Value.kReverse);
  }
} else if(Robot.oi.driver.getRawButton(1) == false) { 
    toggle = true; // Button has been released, so this allows a re-press to activate the code above.
}
 }
 
  
  // This function is called periodically during test mode.
  
  @Override
  public void testPeriodic() {
  }
}
