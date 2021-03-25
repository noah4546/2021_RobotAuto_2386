package frc.auton.mode.testing;

import frc.auton.drive.DriveToPoint;
import frc.auton.drive.DriveWait;
import frc.auton.mode.AutonBuilder;
import frc.auton.mode.AutonMode;

public class Test1 implements AutonMode {

    @Override
    public void addToMode(AutonBuilder ab) {
        ab.addCommand(new DriveToPoint(20, 0, 0, 0, 4, 0.5, 15000));
        ab.addCommand(new DriveWait());
    }
    
}