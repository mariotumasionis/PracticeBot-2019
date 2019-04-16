/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.RobotMap;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.
  // public Joystick stick = new Joystick(RobotMap.driverPort); 
  
  

  public Joystick driver = new Joystick(RobotMap.driverPort);
  public Joystick copilot = new Joystick(RobotMap.copilotPort);
  public JoystickButton aButton = new JoystickButton(driver,1);
  public JoystickButton bButton = new JoystickButton(driver,2);
  public JoystickButton xButton = new JoystickButton(driver,3);
  public JoystickButton yButton = new JoystickButton(driver,4);
public JoystickButton leftBumper = new JoystickButton(driver,5);
public JoystickButton rightBumper = new JoystickButton(driver,6);
  public JoystickButton selectButton = new JoystickButton(driver,7);
  public JoystickButton startButton = new JoystickButton(driver,8);
public JoystickButton leftStickClick = new JoystickButton(driver,9);
public JoystickButton rightStickClick = new JoystickButton(driver,10);
  public double leftX = driver.getRawAxis(0);
  public double leftY = driver.getRawAxis(1);
  public double rightX = driver.getRawAxis(4);
  public double rightY = driver.getRawAxis(5);
public double leftTrigger = driver.getRawAxis(2);
public double rightTrigger = driver.getRawAxis(3);



// public boolean active = false;
// public boolean toggle = true;


  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());
}
