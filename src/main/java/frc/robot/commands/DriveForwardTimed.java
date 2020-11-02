/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.DriveTrain;

public class DriveForwardTimed extends CommandBase {
  private final DriveTrain m_driveTrain;
  private boolean m_isFinished = false;
  private final Timer m_timer;

  /**
   * Creates a new DriveForwardTimed.
   */
  public DriveForwardTimed(DriveTrain dt) {
    m_driveTrain = dt;
    addRequirements(m_driveTrain);
    m_timer = new Timer();
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_timer.reset();
    m_isFinished = false;
    m_timer.start();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if(m_timer.get() < Constants.Autonomous.DriveForwardTime){
      m_driveTrain.arcadeDrive(Constants.Autonomous.DriveSpeed, 0);
    }
    else{
      m_isFinished = true;
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_driveTrain.stop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return m_isFinished;
  }
}
