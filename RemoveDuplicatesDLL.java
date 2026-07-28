class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
    }
}

class DoublyLinkedList {

    Node head;
    Node tail;

    // Insert at the end
    void insertAtLast(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Remove duplicates from sorted DLL
    void removeDuplicates() {

        Node temp = head;

        while (temp != null && temp.next != null) {

            if (temp.data == temp.next.data) {

                Node duplicate = temp.next;

                temp.next = duplicate.next;

                if (duplicate.next != null) {
                    duplicate.next.prev = temp;
                } else {
                    tail = temp;
                }

            } else {
                temp = temp.next;
            }
        }
    }

    // Display
    void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data);

            if (temp.next != null)
                System.out.print(" <-> ");

            temp = temp.next;
        }

        System.out.println();
    }
}

public class RemoveDuplicatesDLL {

    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        list.insertAtLast(1);
        list.insertAtLast(1);
        list.insertAtLast(3);
        list.insertAtLast(3);
        list.insertAtLast(4);
        list.insertAtLast(5);

        System.out.println("Original List:");
        list.display();

        list.removeDuplicates();

        System.out.println("After Removing Duplicates:");
        list.display();
    }
}