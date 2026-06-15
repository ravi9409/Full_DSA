package Stack.Implementation;

import java.util.ArrayDeque;

public class MainClass {
    public static void main(String[] args) {

        /*StackUsingLinkedList stackUsingLinkedList = new StackUsingLinkedList();
        stackUsingLinkedList.push(10);
        stackUsingLinkedList.push(20);
        stackUsingLinkedList.push(30);
        stackUsingLinkedList.push(40);
        while (!stackUsingLinkedList.isEmpty()) {
            System.out.println(stackUsingLinkedList.pop());
        }*/

        ArrayDeque<Integer> arrayDeque=new ArrayDeque<>();
        arrayDeque.push(10);
        arrayDeque.push(20);
        arrayDeque.push(30);
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.peek());
        arrayDeque.pop();
        System.out.println(arrayDeque.peek());

    }
}
