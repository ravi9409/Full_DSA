package Stack.Implementation;

public class StackUsingLinkedList {

    Node head;

    boolean isEmpty() {
        return head == null;
    }

    public void push(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }else{
            int temp=head.data;
            head=head.next;
            return temp;
        }
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }else{
            return head.data;
        }
    }

    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

}
