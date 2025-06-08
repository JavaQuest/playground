package studyJava.sangwook.designpattern.factorymethod.factory;

import studyJava.sangwook.designpattern.factorymethod.entity.Robot;

public abstract class RobotFactory {

    public Robot orderRobot(String email) {
        //앞뒤로 전처리 후처리 가능
        validate(email);

        Robot robot = createRobot();

        sendEmailTo(email);

        return robot;
    }


    protected abstract Robot createRobot();


    private void validate(String email) {
        System.out.println(email + " 확인되었습니다.");
    }

    private void sendEmailTo(String email) {
        System.out.println(email + "님의 로봇이 제조완료되었습니다.");
    }
}
