package studyJava.sangwook.designpattern.factorymethod;

import studyJava.sangwook.designpattern.factorymethod.entity.Robot;
import studyJava.sangwook.designpattern.factorymethod.factory.DancingRobotFactory;

public class RobotMain {
    public static void main(String[] args) {
//        Robot robot = new DancingRobotFactory().orderRobot("abc@naver.com");

        //factory 싱글톤 처리
        Robot robot = DancingRobotFactory.getInstance().orderRobot("abc@naver.com");

        //하나의 factory에서 1개의 객체 생성 지원

    }
}
