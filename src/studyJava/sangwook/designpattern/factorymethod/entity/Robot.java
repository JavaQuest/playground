package studyJava.sangwook.designpattern.factorymethod.entity;

public abstract class Robot {
    private String name;
    private String color;

    public Robot(String name, String color) {
        this.name = name;
        this.color = color;
    }
}
