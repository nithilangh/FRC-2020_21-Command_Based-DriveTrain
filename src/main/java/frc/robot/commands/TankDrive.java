/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.DriveTrain;

public class TankDrive extends CommandBase {
  /**
   * Creates a new TankDrive.
   */
  private final DriveTrain m_driveTrain;
  private final Joystick m_joyStick;


  public TankDrive(DriveTrain dt, Joystick j) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_driveTrain = dt;
    m_joyStick = j;
    addRequirements(m_driveTrain);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_driveTrain.tankDrive(-m_joyStick.getRawAxis(Constants.Joystick.LeftStickYAxis),
                          -m_joyStick.getRawAxis(Constants.Joystick.RightStickYAxis));
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
