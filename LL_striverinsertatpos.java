class LL_striverinsertatpos{
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
    public void insertAtPosition(int value, int index) {

    if (index == 0) {
        insertAtfirst(value);
        return;
    }

    Node node = new Node(value);
    Node temp = head;

    for (int i = 0; i < index - 1; i++) {
        temp = temp.next;
    }

    node.next = temp.next;
    temp.next = node;
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
        LL_striverinsertatpos list = new LL_striverinsertatpos();

        list.insertAtfirst(5);
        list.insertAtfirst(10);
        list.insertAtfirst(15);
        list.insertAtPosition(12, 2); // Insert 12 at index 1

        list.display();
    }
}