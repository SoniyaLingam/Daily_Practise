class LL_search{
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
    public boolean search(int value){
        if(head==null){
            return false;
        }
        Node temp=head;
        while(temp!=null){
            if(value==temp.value){
                return true;
            }
            temp=temp.next;
        }
        return false;
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
        LL_search list = new LL_search();

        list.insertAtfirst(5);
        list.insertAtfirst(10);
        list.insertAtfirst(15);
        boolean d=list.search(15);
        boolean s=list.search(21);
       System.out.print(d);
       System.out.print(s);

        list.display();
    }
}