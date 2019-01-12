/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc7108.TestRobot.commands;

import org.usfirst.frc7108.TestRobot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class CompressorSwitcher extends Command {
  boolean status;
  boolean switchFlag = false;
  public CompressorSwitcher(boolean _status) {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
   _status = this.status;
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    if(status == true){
      switchFlag = false;
      Robot.pneumatic.openCompressor();
      switchFlag = true;
    }
    else if (status == false){
      switchFlag = false;
      Robot.pneumatic.closeCompressor();
      switchFlag = true;
    }
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return switchFlag;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
