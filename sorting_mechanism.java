import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {

    Node head;

    // Insert at last
    public void insertAtLast(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Print list
    public void printList() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data);

            if (temp.next != null)
                System.out.print(" -> ");

            temp = temp.next;
        }

        System.out.println();
    }

    // Sort List
    public void sortList() {

        List<Integer> list = new ArrayList<>();

        Node temp = head;

        while (temp != null) {
            list.add(temp.data);
            temp = temp.next;
        }

        Collections.sort(list);

        temp = head;
        int i = 0;

        while (temp != null) {
            temp.data = list.get(i++);
            temp = temp.next;
        }
    }
}

public class sorting_mechanism{

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insertAtLast(4);
        list.insertAtLast(2);
        list.insertAtLast(1);
        list.insertAtLast(3);

        System.out.println("Original List:");
        list.printList();

        list.sortList();

        System.out.println("Sorted List:");
        list.printList();
    }
}