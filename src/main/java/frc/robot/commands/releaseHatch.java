/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class releaseHatch extends Command {
  public releaseHatch() {
  requires(Robot.pneu);
  }


  @Override
  protected void initialize() {
  }

 
  @Override
  protected void execute() {
           Robot.pneu.Forward();
  }

 
  @Override
  protected boolean isFinished() {
    return false;
  }


  @Override
  protected void end() {
            Robot.pneu.Reverse();
  }


  @Override
  protected void interrupted() {
           end();
  }
}
