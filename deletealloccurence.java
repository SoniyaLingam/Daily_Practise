class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
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

    // Delete all occurrences of x
    void deleteAllOccur(int x) {

        Node temp = head;

        while (temp != null) {

            Node nextNode = temp.next;

            if (temp.data == x) {

                // If deleting head
                if (temp == head) {
                    head = head.next;

                    if (head != null)
                        head.prev = null;
                }

                // If deleting tail
                else if (temp == tail) {
                    tail = tail.prev;

                    if (tail != null)
                        tail.next = null;
                }

                // Deleting middle node
                else {

                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
            }

            temp = nextNode;
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

public class deletealloccurence{

    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        list.insertAtLast(1);
        list.insertAtLast(2);
        list.insertAtLast(3);
        list.insertAtLast(1);
        list.insertAtLast(4);

        System.out.println("Original List:");
        list.display();

        list.deleteAllOccur(1);

        System.out.println("After Deleting 1:");
        list.display();
    }
}