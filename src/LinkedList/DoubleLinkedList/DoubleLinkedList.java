package LinkedList.DoubleLinkedList;

public class DoubleLinkedList {
    public static void main(String[] args) {
        Node<Integer> head = new Node<Integer>(1);
        Node<Integer> n1 = new Node<Integer>(2);
        Node<Integer> n2 = new Node<Integer>(3);
        Node<Integer> n3 = new Node<Integer>(4);
        head.next = n1;
        n1.previous=head;
        n1.next = n2;
        n2.previous=n1;
        n2.next = n3;
        n3.previous=n2;
        printLinkedList(head);
        //LinkedList.SingleLinkedList.Node<Integer> newHead=deleteFromLinkedList(2,head);
        //Node<Integer> newHead=insertInLinkedList(1,4,head);
        System.out.println();
        //printLinkedList(newHead);
    }

    public static void printLinkedList(Node<Integer> head) {
        Node<Integer> temp=head;
        while (temp!=null){
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }
    }

    public static Node insertInLinkedList(int pos, int data, Node<Integer> head) {
        Node<Integer> temp=head;
        Node<Integer> newEle=new Node<Integer>(data);
        for (int i=0;i<pos-1;i++){
            temp=temp.next;
        }
        newEle.next=temp.next;
        temp.next.previous=newEle;
        temp.next=newEle;
        newEle.previous=temp;
        return head;
    }

}

class Node<E> {
    E val;
    Node next;
    Node previous;

    public Node(E val) {
        this.val = val;
        this.next = null;
        this.previous = null;
    }
}