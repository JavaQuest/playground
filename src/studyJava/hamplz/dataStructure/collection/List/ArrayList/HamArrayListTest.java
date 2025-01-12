package studyJava.hamplz.dataStructure.collection.List.ArrayList;

public class HamArrayListTest {
    public static void main(String[] args) {
        HamArrayList<String> list = new HamArrayList<>();

        // 1. 요소 추가
        list.add("Hello");
        list.add("World");
        list.add("Java");
        System.out.println("elements: " + toString(list));

        // 2. 특정 위치에 요소 추가
        list.add(1, "Hamplz");
        System.out.println("index 1: " + toString(list));

        // 3. 요소 조회
        System.out.println("index 2: " + list.get(2));

        // 4. 요소 교체
        list.set(2, "Programming");
        System.out.println("elements: " + toString(list));

        // 5. 요소 포함 여부 확인
        System.out.println("'Java' 포함 ? " + list.contains("Java"));
        System.out.println("'World' 포함 ? " + list.contains("World"));

        // 6. 요소 삭제
        list.remove("World");
        System.out.println("list : " + toString(list));
        list.remove(1);
        System.out.println("index 1: " + toString(list));

        // 7. 리스트 크기 확인
        System.out.println("size: " + list.size());

        // 8. 리스트가 비어있는지 확인
        System.out.println("empty : " + list.isEmpty());

        // 9. 리스트 초기화
        list.clear();
        System.out.println("list: " + toString(list));
        System.out.println("empty :" + list.isEmpty());
    }

    private static String toString(HamArrayList<?> list) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i < list.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
