package p1;

public class MyStack {

    private int maxSize;
    private int stackTop;
    private int[] list;

    public MyStack() {
        maxSize = 100;
        stackTop = 0;
        list = new int[maxSize];
    }

    public MyStack(int size) {
        if (size <= 0) {
            size = 100;
        }
        maxSize = size;
        stackTop = 0;
        list = new int[size];
    }

    public void intialize() {
        stackTop = 0;
        // if we are working with objects we must create a loop and change each element to null ( from 0 until stackTop)
    }

    public boolean isEmpty() {
        return stackTop == 0;
    }

    public boolean isFull() {
        return stackTop == maxSize;
    }

    public void push(int v) {
        if (isFull()) {
            System.out.println("The stack is full");
        } else {
            list[stackTop] = v;
            stackTop++;
        }
    }

    public int top() {

        if (isEmpty()) {
            return -1;
        }
        return list[stackTop - 1];
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("The stack have no elements");
            return -1;
        } else {
            int temp = list[stackTop - 1];
            stackTop--;
            return temp;
            // will be deleted in the logical stack but in the implementation it will still the same
        }
    }

    public void copy(MyStack s) {
        s.stackTop = stackTop;
        for (int i = 0; i < s.stackTop; i++) {
            s.list[i] = list[i];
        }
    }

}
