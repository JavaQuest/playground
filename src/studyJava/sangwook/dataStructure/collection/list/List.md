# List (interface)

## 리스트를 만드는 방식
1. 생성자로 직접 리스트 객체 인스턴스화
2. Arrays.asList()
3. List.of()

리스트의 요소를 집어넣는 동시에 인스턴스화하기 위해 2, 3번의 방식을 사용한다

## Arrays.asList()와 List.of()의 비교
|                 | 불변인가? | null을 넣을 수 있는가? |
|:---------------:|:-----:|:---------------:|
| Arrays.asList() |   △   |        O        |
|    List.of()    |   O   |        X        |

방식 1번의 직접 리스트 객체 인스턴스화 하는 것과의 가장 큰 차이점은 **불변**인지의 여부이다  

Arrays.asList()의 불변이 세모인 이유는 특정 인덱스의 값을 변경하는 set(index, E);의 메서드를 허용하기 때문이다. 그 외에도 replaceAll, sort 등 제공한다  
하지만 List.of()는 인스턴스화 할 때 집어넣어진 요소를 절대적으로 지키기 위해 값을 변경할 수 있는 메서드를 모두 막아놓았다  
값을 변경하려고 시도하면 UnsupportedOperationException이 발생한다

또한 Arrays.asList()와 달리 List.of()는 null을 허용하지 않는다 -> 값을 넣을 때 null 체크를 진행  








