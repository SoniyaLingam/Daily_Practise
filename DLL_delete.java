class DLL_delete{

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
    public void deletehead(){
        if(head==null){
            return;
        }
        head=head.next;
        head.prev=null;
    }
    public void deletelast(){
        if(head==null){
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        tail=temp.prev;
        tail.next=null;
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

        DLL_delete list = new DLL_delete();

        list.insertAtLast(5);
        list.insertAtLast(10);
        list.insertAtLast(15);
        list.insertAtLast(25);
        list.insertAtLast(65);
        list.insertAtLast(75);
        list.deletelast();
        list.deletehead();

        list.display();
    }
}