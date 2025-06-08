package studyJava.sangwook.designpattern.factorymethod.factory;

import studyJava.sangwook.designpattern.factorymethod.entity.DancingRobot;
import studyJava.sangwook.designpattern.factorymethod.entity.Robot;

public class DancingRobotFactory extends RobotFactory{

    private DancingRobotFactory() {
    }

    private static class SingleInstanceHolder {
        private static final DancingRobotFactory INSTANCE = new DancingRobotFactory();
    }

    public static DancingRobotFactory getInstance() {
        return DancingRobotFactory.SingleInstanceHolder.INSTANCE;
    }

    @Override
    public Robot createRobot() {
        return new DancingRobot();
    }
}
