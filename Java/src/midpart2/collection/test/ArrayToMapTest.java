package midpart2.collection.test;

import java.util.HashMap;
import java.util.Map;

public class ArrayToMapTest {
    public static void main(String[] args) {
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"}, {"JPA", "30000"}};

        // 주어진 배열으로부터 Map 생성
        Map<String, Integer> map = new HashMap<>();

        for (String[] product: productArr ) {
            String key = product[0];
            int value = Integer.parseInt(product[1]);
            map.put(key, value);
        }

        for (String s : map.keySet()) {
            System.out.println("제품: " + s + ", 가격: " + map.get(s));
        }
    }
}
