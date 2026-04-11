package midpart2.collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeQueueMain {
    public static void main(String[] args) {
        // Queue의 기능만 사용하겠다 그러면
        // Queue<Integer>
        Deque<Integer> deque = new ArrayDeque<>();

        // 데이터 추가
        deque.offer(1);
        deque.offer(2);
        deque.offer(3);
        System.out.println(deque);

        System.out.println("deque.peek() = " + deque.peek());

        System.out.println("deque.poll() = " + deque.poll());
        System.out.println("deque.poll() = " + deque.poll());
        System.out.println("deque.poll() = " + deque.poll());
        System.out.println(deque);
    }
}
