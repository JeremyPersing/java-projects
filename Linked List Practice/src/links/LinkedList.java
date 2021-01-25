package links;
class Node {
    Node next;
    int data;

    Node (int data) {this.data = data;}
}

public class LinkedList {
    Node head;
    int size;

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(-1);
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addLast(0);
        ll.deleteFirst();
        ll.deleteLast();
        ll.traverse();
    }

    public void addFirst(int value) {
        Node nn = new Node(value);
        if (head == null) {
            head = nn;
        }
        else {
            nn.next = head;
            head = nn;
        }
        size++;
    }

    public void addLast(int data) {
        Node nn = new Node(data);
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = nn;
        size++;
    }

    public void deleteLast() {
        Node curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;
        size--;
    }

    public void deleteFirst() {
        Node prev = head;
        head = head.next;
        prev = null;
    }

    public void traverse() {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }
}


