package Stack;

public class MainClass {
    public static void main(String[] args) {

        StackUsingLinkedList stackUsingLinkedList = new StackUsingLinkedList();
        stackUsingLinkedList.push(10);
        stackUsingLinkedList.push(20);
        stackUsingLinkedList.push(30);
        stackUsingLinkedList.push(40);
        while (!stackUsingLinkedList.isEmpty()) {
            System.out.println(stackUsingLinkedList.pop());
        }

    }
}
