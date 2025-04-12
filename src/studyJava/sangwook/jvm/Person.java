package studyJava.sangwook.jvm;

public class Person {
    private String name = "Kim";

    public String getName() {
        return name;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    public void setName(String name) {
        this.name = name;
    }
}
