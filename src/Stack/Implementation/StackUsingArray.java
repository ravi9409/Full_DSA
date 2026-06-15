package Stack.Implementation;

class MyStack {
    private Integer myarray[];
    private int capacity;
    private int top;

    public MyStack(int capacity) {
        this.capacity = capacity;
        myarray = new Integer[capacity];
        top = -1;
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int value) {
        if (top == capacity - 1)
            throw new StackFullException("Stack is full");
        top++;
        myarray[top] = value;
    }

    @Override
    public String toString() {
        String str = "[";
        if (top != -1) {
            for (Integer x : myarray)
                if (x != null)
                    str = str + x + ",";  // if stack is not empty
        }
        str = str + "]";
        return str;
    }

    public Integer pop() {
        if (top == -1)
            throw new StackFullException("Stack is empty");
        int element = myarray[top];
        myarray[top] = null;
        top--;
        return element;
    }

    public Integer peek() {
        int element = myarray[top];
        return element;
    }
}


public class StackUsingArray {

    public static void main(String[] args) {
        MyStack stack = new MyStack(5);
        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
        stack.pop();
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());

    }
}
