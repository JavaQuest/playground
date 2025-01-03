# 1. Queue (interface)

## 특징
Queue는 후입선출이었던 Stack과 달리 선입선출의 특징을 지닌다

tail에 요소를 추가하는 add()와 offer() 메서드를 제외하고는 **모두 head를 위한 메서드만** 지원한다   
Queue에는 비슷해보이는 메서드들이 보이는데 add와 offer, remove와 poll, element와 peek이다  

|     |    예외     |  값 리턴   |
|:---:|:---------:|:-------:|
| 추가  |   add()   | offer() |
| 삭제  | remove()  | poll()  |
| 검사  | element() | peek()  |

add와 offer을 예시로 들면 Queue가 가득차서 add()를 할 수 없을때는 예외를 터트리고, offer()을 할 수 없을 때는 false를 반환한다  
나머지도 다 이와 같은 방식으로 관리된다

# 2. Deque (interface)

