package LinkedList.SingleLinkedList;

public class MiddleInALinkedList {
    public static void main(String[] args) {
        Node head=new Node(1);
        Node n2=new Node(2);
        Node n3=new Node(3);
        Node n4=new Node(4);
        Node n5=new Node(5);
        head.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        Node middle=findMiddle(head);
        System.out.println(middle.val);
    }

    static Node findMiddle(Node head){
        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}