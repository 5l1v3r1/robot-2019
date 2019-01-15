
package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Pneumatic extends Subsystem {
          public static final String Comppressor = null;
		private DoubleSolenoid db1;
          private DoubleSolenoid db2;
          private DoubleSolenoid db3;
          public Compressor compressor;
        public Pneumatic (){
                compressor = new Compressor();
                db1 = new DoubleSolenoid(1,2);
                db2 = new DoubleSolenoid(3,4);
                db3 = new DoubleSolenoid(5,6);

        }
  public void Off() {
          db1.set(Value.kOff);
          db2.set(Value.kOff);
          db3.set(Value.kOff);
  }
  public void Forward(){
          db1.set(Value.kForward);
          db2.set(Value.kForward);
          db3.set(Value.kForward);
  }
  public void Reverse (){
          db1.set(Value.kReverse);
          db2.set(Value.kReverse);
          db3.set(Value.kReverse);
  }
  public void initDefaultCommand() {

  } 
}