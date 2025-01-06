# Stack

Stack의 가장 큰 특징은 Vector를 상속받는다는 것이다  
Vector를 주로 사용하지 않는다고 했으니 물론 Stack도 사용하지 않는다  
Vector의 메서드를 그대로 사용하는 것들이 많기 때문에 Stack도 synchronized가 붙어있고 거의 모든 메서드가 동시성 문제를 해결하려고 하는 것처럼 보인다

# Stack은 디자인이 잘못되었다 + 동시성 문제

Vector를 상속받게 되면서 synchronized가 붙어있는 메서드를 사용한다  
그래서 그 단점을 그대로 물려받는다  
코드를 보면 Stack의 peek() 메서드에는 synchronized 키워드가 붙어있다  
peek() 메서드에서는 Vector에 구현되어 있는 elementAt()을 호출하는데 이곳에도 키워드가 붙어있어 불필요하게 2중으로 동기화를 처리하고 있다  
심지어 pop()에는 3중으로 동기화 처리를 하는 것을 알 수 있다 

### 중복 동기화
중복 동기화에 대해 GPT에 물어봤더니 중복 동시성 처리를 하였을 때 재진입 카운터라는 것이 존재해 성능상에는 사실 생각보다 큰 부하는 없다고한다  
이는 synchronized로 모니터 락을 획득한 후 같은 인스턴스의 다른 synchronized로 재접근 시 락을 가져오는 행위 없이 카운터를 증가시키는 것으로 처리하는 것이다  
락을 반복적으로 획득하지않고, 경쟁조건이 없다보니 큰 부하는 없다는 것이다   

또 다른 문제로 스택은 기본 생성자만 지원하여 초기 크기를 지정할 수 없다는 점도 있다

# 대신 ArrayDeque를 사용하자

Stack 클래스에 적힌 문구이다  
`A more complete and consistent set of LIFO stack operations is provided by the Deque interface and its implementations, which should be used in preference to this class.`  
`Deque<Integer> stack = new ArrayDeque<Integer>();`

해석해보면 후입선출의 스택 기능을 Deque에서 더 잘 구현해놨다는 소리이다  
Deque에서 제공하는 스택 기능은 나중에 Deque쪽 공부할 때 다시 알아보도록 하겠다



Stack은 알고리즘 문제를 사용할 때 자주 사용하던 클래스였는데 공부하게 되면서 사용하지 말아야겠다고 느꼈다(사실 알고리즘 문제 풀때는 상관없긴 하지만..)  
