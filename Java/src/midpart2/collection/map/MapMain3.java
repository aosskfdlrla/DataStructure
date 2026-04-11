package midpart2.collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain3 {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        studentMap.put("StudentA", 50);
        System.out.println(studentMap);

        // 학생이 없는 경우에만 추가 1
        if(!studentMap.containsKey("StudentA")){
            studentMap.put("studentA", 100);
        }

        // 학생이 없는 경우에만 추가 2 - if 문보다 더 편하게 할 수 있는 방법: putIfAbsent
        studentMap.putIfAbsent("StudentA", 100);
        studentMap.putIfAbsent("StudentB", 100);
        System.out.println(studentMap);
    }
}
