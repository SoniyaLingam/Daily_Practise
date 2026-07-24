class DLL_reverse{

    Node head;
    Node tail;

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    public void insertAtLast(int value) {

        Node node = new Node(value);

        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.prev = tail;
        tail = node;
    }
    
    public void display() {

        Node temp = tail;

        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.prev;
        }

        System.out.println("start");
    }

    public static void main(String[] args) {

        DLL_reverse list = new DLL_reverse();

        list.insertAtLast(5);
        list.insertAtLast(10);
        list.insertAtLast(15);
        list.insertAtLast(25);
        list.insertAtLast(65);
        list.insertAtLast(75);
        

        list.display();
    }
}