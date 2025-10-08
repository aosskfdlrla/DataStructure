public class MyStack {
    private int[] stack;
    private int top;

    public MyStack() {
        stack = new int[5];
        top = -1;
    }

    public MyStack(int size) {
        stack = new int[size];
        top = -1;
    }

    public void push(int num) {
        if(top != stack.length - 1){
            stack[++top] = num;
        } else {
            System.out.println("Stack is Full!");
        }
    }

    public int pop() {
        int result = 0;
        if(top != -1) {
            result = stack[top];
            stack[top--] = -1;
            return result;
        } else {
            System.out.println("Stack is Empty!");
            return -1;
        }
    }

    public int size() {
        if(top == -1)
            return 0;
        else
            return top + 1;
    }
}
