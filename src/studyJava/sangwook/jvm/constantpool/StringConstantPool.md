# String Constant Pool

String Constant Pool은 JVM의 힙 영역 내부의 별도 공간에 존재한다.

1. 직접 생성한 문자열  
직접 생성한 문자열(ex) String a = "A";) -> JVM Heap 영역 내부의 String Constant Pool에 저장됨  
String Constant Pool에 저장된 한개의 문자열을 str1과 str2이 동시에 참조하므로, 참조 비교(==비교)에서 true가 나온다.  

2. new 키워드로 생성한 문자열  
new 키워드를 사용하여 생성한 String -> 별도의 Heap에 저장됨  
str3과 str4의 ==비교 실패.

3. String의 intern() 메서드  
String Constant Pool에 해당 String을 저장, 이미 값이 있는경우 해당 String 반환  
하지만 사용하지 않는 것이 좋아보임
String Constant Pool에 있는 String의 대상은 GC 대상이 되기 힘들다. -> 메모리의 누수 문제 유발 가능  

그렇다고 동적으로 생성된 (ORM, MyBatis 등을 통하여 생성된) String들이 String Constant Pool에 저장되지는 않는다

