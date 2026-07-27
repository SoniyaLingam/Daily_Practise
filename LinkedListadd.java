class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedListadd{

    Node head;
    Node tail;

    // Insert at end
    void insertAtLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // Display list
    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data);

            if (temp.next != null)
                System.out.print(" -> ");

            temp = temp.next;
        }

        System.out.println();
    }

    // Your approach
    Node addOne(Node head) {

        long number = 0;

        Node temp = head;

        // Step 1: Convert linked list into number
        while (temp != null) {

            number = number * 10 + temp.data;

            temp = temp.next;
        }

        // Step 2: Add one
        number++;

        // Step 3: Special case
        if (number == 0)
            return new Node(0);

        // Step 4: Create new linked list
        LinkedList ans = new LinkedList();

        String s = String.valueOf(number);

        for (int i = 0; i < s.length(); i++) {

            ans.insertAtLast(s.charAt(i) - '0');

        }

        return ans.head;
    }

    public static void main(String[] args) {

        LinkedListadd list = new LinkedListadd();

        list.insertAtLast(9);
        list.insertAtLast(9);
        list.insertAtLast(9);

        System.out.print("Original : ");
        list.display();

        Node result = list.addOne(list.head);

        System.out.print("Answer   : ");

        Node temp = result;

        while (temp != null) {
            System.out.print(temp.data);

            if (temp.next != null)
                System.out.print(" -> ");

            temp = temp.next;
        }
    }
}