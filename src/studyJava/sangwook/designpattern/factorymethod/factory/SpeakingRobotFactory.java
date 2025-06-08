package studyJava.sangwook.designpattern.factorymethod.factory;

import studyJava.sangwook.designpattern.factorymethod.entity.Robot;
import studyJava.sangwook.designpattern.factorymethod.entity.SpeakingRobot;

public class SpeakingRobotFactory extends RobotFactory {

    private SpeakingRobotFactory() {
    }

    private static class SingleInstanceHolder {
        private static final SpeakingRobotFactory INSTANCE = new SpeakingRobotFactory();
    }

    public static SpeakingRobotFactory getInstance() {
        return SingleInstanceHolder.INSTANCE;
    }

    @Override
    protected Robot createRobot() {
        return new SpeakingRobot();
    }
}
