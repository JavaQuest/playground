package studyJava.sangwook.jvm.stack;

import studyJava.sangwook.jvm.Person;

import java.util.ArrayList;
import java.util.List;

public class StackMain {

    public static void main(String[] args) {
        int a = 10; // 원시 타입: 스택에 값이 저장됨
        Integer b = 10; // 참조 타입: 스택에 참조, 실제 값은 힙에

        modifyPrimitive(a);
        modifyReference(b);

        System.out.println("After modifyPrimitive, a = " + a); // 10 (원래 값 유지)
        System.out.println("After modifyReference, b = " + b); // 10 (불변 객체라 변경 안됨)

        //리스트
        List<String> list = new ArrayList<>();
        list.add("cbd");
        modifyList(list);
        System.out.println(list.size());

        //배열
        int[] arr = {1, 2, 3, 4, 5};
        modifyArray(arr);
        System.out.println(arr[0]);

        //커스텀 객체
        Person person = new Person("son");
        modifyPerson(person);
        System.out.println(person.getName());

        modifyPersonReference(person);
        System.out.println(person.getName());

    }

    public static void modifyPrimitive(int value) {
        value = 999;
        System.out.println("Inside modifyPrimitive, value = " + value);
    }

    public static void modifyReference(Integer obj) {
        obj = 999;
        System.out.println("Inside modifyReference, obj = " + obj);
    }

    public static void modifyList(List<String> list) {
        list.add("abc");
    }

    public static void modifyArray(int[] arr) {
        arr[0] = 222;
    }

    public static void modifyPerson(Person person) {
        person.setName("ooo");
    }

    public static void modifyPersonReference(Person person) {
        Person newPerson = new Person("ddd");
        person = newPerson;
    }

}
