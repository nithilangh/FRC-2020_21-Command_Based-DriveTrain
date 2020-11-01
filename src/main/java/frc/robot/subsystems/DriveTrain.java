/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PWMTalonSRX;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {
  /**
   * Creates a new DriveTrain.
   */
  private final SpeedController m_leftMotors = 
    new SpeedControllerGroup(new PWMTalonSRX(Constants.DriveConstants.frontLeftMotorPort), new PWMTalonSRX(Constants.DriveConstants.backLeftMotorPort));
  private final SpeedController m_rightMotors = 
    new SpeedControllerGroup(new PWMTalonSRX(Constants.DriveConstants.frontRightMotorPort), new PWMTalonSRX(Constants.DriveConstants.backRightMotorPort));
  private final DifferentialDrive m_drive = new DifferentialDrive(m_leftMotors, m_rightMotors);

  public DriveTrain() {
    
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void arcadeDrive(double speed, double turn){
    m_drive.arcadeDrive(speed, turn);
  }

  public void tankDrive(double leftSpeed, double rightSpeed){
    m_drive.tankDrive(leftSpeed, rightSpeed);
  }

  public void stop(){
    m_drive.stopMotor();
  }

}
