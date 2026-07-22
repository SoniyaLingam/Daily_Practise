import java.util.*;
class LL_striver{
    Node head;
    Node tail;
    class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
        }
    
    }
    public void insertAtfirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public static void main(String[] args) {
        LL_striver list = new LL_striver();

        list.insertAtfirst(5);
        list.insertAtfirst(10);
        list.insertAtfirst(15);

        list.display();
    }
}