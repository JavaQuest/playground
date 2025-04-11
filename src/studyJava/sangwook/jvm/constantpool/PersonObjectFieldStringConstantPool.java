package studyJava.sangwook.jvm.constantpool;

public class PersonObjectFieldStringConstantPool {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();

        Person person3 = new Person("son");
        Person person4 = new Person("son");

        System.out.println(person1.getName()==person2.getName());
        System.out.println(person3.getName()==person4.getName());

    }
}
