class LL_strivercount{
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
        int c=0;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            c++;
            temp = temp.next;
        }
        System.out.println("END");
        System.out.print(c);
    }

    public static void main(String[] args) {
        LL_strivercount list = new LL_strivercount();

        list.insertAtfirst(5);
        list.insertAtfirst(10);
        list.insertAtfirst(15);
       

        list.display();
    }
}