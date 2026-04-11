package midpart2.collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

// Stack은 java 1.0에서 만들어진 자료구조라 사용하진 않음.
// Deque로 스택처럼 사용해야 함.
public class DequeStackMain {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        // 데이터 추가
        deque.push(1);
        deque.push(2);
        deque.push(3);
        System.out.println(deque);

        // 다음 꺼낼 데이터 확인 (꺼내지 않고 단순 조회만)
        System.out.println("deque.peek() = " + deque.peek());

        // 데이터 꺼내기
        System.out.println("deque.pop() = " + deque.pop());
        System.out.println("deque.pop() = " + deque.pop());
        System.out.println("deque.pop() = " + deque.pop());
        System.out.println(deque);
    }
}
