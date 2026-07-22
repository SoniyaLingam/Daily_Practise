
class LLstriverinsertlast {

    Node head;
    Node tail;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public void insertLast(int value) {

        Node node = new Node(value);

        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = node;
        tail = node;
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

        LLstriverinsertlast list = new LLstriverinsertlast();

        list.insertLast(5);
        list.insertLast(10);
        list.insertLast(15);

        list.display();
    }
}