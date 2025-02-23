package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class MotorSubsystem extends SubsystemBase {
	private static MotorSubsystem instance;

    public static MotorSubsystem getInstance() {
		if (instance == null)
			instance = new MotorSubsystem();
		return instance;
	}
    public MotorSubsystem() {
        //initialize values for private and public variables, etc.
          
        init();
      }
    
      
      /**
       * The init method resets and operational state of the subsystem
       */
      public void init() {
        // set initial stuff, etc.
      }
      
      @Override
      public void periodic() {
      }

}
