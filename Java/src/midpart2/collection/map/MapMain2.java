package midpart2.collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain2 {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        studentMap.put("StudentA", 90);
        System.out.println(studentMap);

        // 같은 키로 저장하면 기존의 값을 교체한다.
        studentMap.put("StudentA", 80);
        System.out.println(studentMap);

        boolean studentA = studentMap.containsKey("StudentA");
        System.out.println("containsKey = " + studentA);

        // 특정 학생의 값 삭제
        studentMap.remove("StudentA");
        System.out.println(studentMap);

    }
}
