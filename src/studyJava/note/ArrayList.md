# ArrayList

## 요소 가져오기
1. 원하는 인덱스의 요소를 가져오기 - O(1)
- 인덱스로 배열의 위치를 지정해서 가져오므로 O(1)이다

## 요소 추가
1. 배열의 마지막에 추가하는 경우 - O(1)
- 지정된 사이즈를 사용해서 배열의 마지막 부분에 데이터를 추가하므로 O(1)의 복잡도이다

2. 지정된 인덱스에 추가하는 경우 - O(N)
- 요소를 추가할 인덱스의 공간을 확보해야 하므로 인덱스가 마지막일 경우 O(1), 인덱스가 첫번째일 경우 최대 O(N)의 복잡도이다

## 요소 제거
1. 첫번째로 찾아진 원하는 요소를 제거하는 경우 - O(N)
- 원하는 요소를 찾는데 O(N), 찾은 요소를 제거하고 남은 요소들을 앞당기는데 O(N)이다

2. 지정된 인덱스의 요소를 제거하는 경우 - O(N)
- 지정된 인덱스의 요소를 바로 찾음 O(1), 찾은 요소를 제거하고 남은 요소를 앞당김 O(N). index가 맨 뒤라면 O(1)이 될 수 있다


# 언제 사용할까요
- 리스트의 요소들에 대한 탐색이 많은 경우
- 요소의 추가가 리스트의 끝에서 이루어질 때
- 데이터의 크기가 자주 변경되지 않는 경우

# 언제 사용하지 않는게 좋을까요
- 들어있는 요소의 변경이 잦을때 (삭제, 삽입 등)
- 리스트의 크기가 자주 커질 경우 -> 새로운 배열을 생성하고 복사하는 작업이 발생
- 데이터의 순서가 자주 변경되는 경우
- `boolean remove(Object o)`과 같은 키 기반의 조회가 필요한 경우