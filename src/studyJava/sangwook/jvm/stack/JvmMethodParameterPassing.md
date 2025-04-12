# JVM의 Stack 영역에서 파라미터 패싱 방법

## 1. Primitive Type (call by value)  
원시타입은 **값의 복사**가 이루어진다
```java
int a = 10;
modifyPrimitive(a);
System.out.println("After modifyPrimitive, a = " + a); // 10 (원래 값 유지)

public static void modifyPrimitive(int value) {
    value = 999;
}
```

### 실행 방식
modifyPrimitive() 메서드를 호출하면서 스택프레임 생성 ->   
a값을 인자로 전달 ->  
a라는 값이 복사되어 value로 전달 ->  
value의 값을 999로 변경 ->  
메서드 수행 종료 ->  
return이 없는 void 메서드이므로 스택프레임 제거될 때 value는 소멸 ->  
a는 기존의 값인 10을 그대로 유지

## 2. 배열, 리스트, 커스텀 객체
배열, 리스트, 커스텀 객체는 주소를 복사하여 전달한다
```java
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


public static void modifyList(List<String> list) {
    list.add("abc");
}

public static void modifyArray(int[] arr) {
    arr[0] = 222;
}

public static void modifyPerson(Person person) {
    person.setName("ooo");
}

실행 결과
2 
222
ooo
```

### 실행 방식 (list)
List<String> list = new ArrayList<>(); list.add("cbd"); 선언하여 heap에 실제 데이터가 저장되고 주소값을 들고 있다 ->  
modifyList() 메서드를 호출하면서 스택프레임 생성 ->  
list를 인자로 전달 ->  
list의 참조값(주소)가 복사되어 파라미터에 전달 ->  
list.add("abc")로 해당 주소의 리스트에 값 추가 요청 ->  
실제 list에 "abc"라는 값 추가됨 ->  
메서드 종료되어 스택 프레임 제거


## 3. Wrapper Class 
Wrapper 클래스는 불변이다  
2번과 마찬가지로 주소의 복사가 이루어지지만 따로 분류한 이유는 불변이라는 특징때문이다  
불변이라는게 제일 중요...!!

```java
Integer b = 10;
modifyReference(b);
System.out.println("After modifyReference, b = " + b);

public static void modifyReference(Integer obj) {
    obj = 999;
    System.out.println("Inside modifyReference, obj = " + obj);
}
```

### 실행 방식
Integer b = 10; 선언 (원시타입이 아니므로 heap에 실제 데이터가 저장되고 주소값을 들고 있음) ->  
modifyReference() 메서드를 호출하면서 스택프레임 생성 ->  
b값을 인자로 전달 ->  
b의 참조값(주소)가 복사되어 obj로 전달 (즉, obj와 b는 같은 주소를 바라보고 있다) ->  
obj의 값을 999로 변경 ->  
Integer은 불변인 Wrapper Class이므로 10이 999로 변경되는게 아니라 999 값이 Heap에 새로 생성된 후 해당 주소를 참조함 (즉, b와 obj는 다른 주소를 바라보게 됨) ->  
b는 기존 값인 10을 그대로 유지  




