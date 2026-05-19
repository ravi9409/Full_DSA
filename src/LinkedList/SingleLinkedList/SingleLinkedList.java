package LinkedList.SingleLinkedList;

public class SingleLinkedList {
    public static void main(String[] args) {
        Node<Integer> head = new Node<Integer>(1);
        Node<Integer> n1 = new Node<Integer>(2);
        Node<Integer> n2 = new Node<Integer>(3);
        Node<Integer> n3 = new Node<Integer>(4);
        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        printLinkedList(head);
        Node<Integer> newHead=deleteFromLinkedList(2,head);
        //Node<Integer> newHead=insertInLinkedList(1,4,head);
        System.out.println();
        printLinkedList(newHead);
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
        temp.next=newEle;
        return head;
    }

    public static Node deleteFromLinkedList(int pos, Node<Integer> head) {
        Node<Integer> temp=head;
        for (int i=0;i<pos-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }

}

class Node<E> {
    E val;
    Node next;

    public Node(E val) {
        this.val = val;
        this.next = null;
    }
}