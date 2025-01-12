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
|        | **값 리턴**  |   **예외**   | 
|:------:|:---------:|:----------:|
| **추가** | `offer()` |  `add()`   |
| **삭제** | `poll()`  | `remove()` |
| **검사** | `peek()`  |  `get()`   |


`First`가 붙은 메서드는 큐의 앞 (헤드, `head`)에 대한 작업을 수행하고,
`Last`가 붙은 메서드는 큐의 뒤 (꼬리, `tail`)에 대한 작업을 수행한다.

1. 값 리턴 (Return Values)
- offerFirst(), offerLast(): 큐의 앞이나 뒤에 요소를 추가하고 true를 리턴한다.  
- pollFirst(), pollLast(): 큐의 앞이나 뒤에서 요소를 제거하고 해당 요소를 리턴합니다. 큐가 비어있으면 null을 반환한다.  
- peekFirst(), peekLast(): 큐의 앞이나 뒤에 있는 요소를 확인하고, 큐가 비어있으면 null을 반환한다.  
  
2. 예외 (Exceptions)  
- addFirst(), addLast(): 큐의 앞이나 뒤에 요소를 추가하는데, 큐에 공간이 부족할 경우 예외를 던진다. (제한된 용량의 큐)  
- removeFirst(), removeLast(): 큐에서 앞이나 뒤의 요소를 제거하려고 시도하는데 큐가 비어있으면 NoSuchElementException 예외를 발생시킨다.   
- getFirst(), getLast(): 큐에서 앞이나 뒤의 요소를 조회하려고 시도하는데 큐가 비어있으면 NoSuchElementException 예외를 발생시킨다.   