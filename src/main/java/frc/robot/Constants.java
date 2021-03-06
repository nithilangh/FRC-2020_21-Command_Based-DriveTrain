/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static final class DriveConstants{
        // PWM port numbers for corresponding motors
        public static final int frontLeftMotorPort = 0;
        public static final int frontRightMotorPort = 1;
        public static final int backLeftMotorPort = 2;
        public static final int backRightMotorPort = 3;
        
    }

	public static final class Joystick{
        public static final int Port = 0;
        public static final int LeftStickXAxis = 0;
        public static final int LeftStickYAxis = 1;
        public static final int RightStickXAxis = 2;
        public static final int RightStickYAxis = 3;
    }

    public static final class Autonomous{
        public static final double DriveForwardTime = 5; //in seconds
        public static final double DriveSpeed = 0.5; //percentage of drive speed used
    }
}
