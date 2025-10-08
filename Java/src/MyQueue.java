public class MyQueue {
    private final int[] queue;
    private int front;
    private int rear;

    public MyQueue() {
        queue = new int[5];
        front = -1;
        rear = -1;
    }

    public MyQueue(int size) {
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    public void add(int num) {
        if(rear != queue.length -1)
            queue[++rear] = num;
        else
            System.out.println("Queue is Full!");
    }

    public int delete() {
        if(front != rear) {
            return queue[++front];
        } else {
            System.out.println("Queue is Empty!");
            return -1;
        }
    }
}
