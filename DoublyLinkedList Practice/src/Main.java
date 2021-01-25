class Node {
    int data;
    Node next, prev;
    Node (int data) {
        this.data = data;
    }
}

class DoublyLinkedList {
    Node head, tail;

    public void addFirst(int data) {
        Node nn = new Node(data);
        if (head == null) {
            head = tail = nn;
        }
        else {
            nn.next = head;
            head.prev = nn;
            head = nn;
        }
    }

    public void insertAfter(int tempHead, int data) {
        Node curr = head;
        while (curr.data != tempHead) {
            curr = curr.next;
        }
        Node nn = new Node(data);
        nn.next = curr.next;
        nn.prev = curr;
        nn.next.prev = nn;
        curr.next = nn;
    }

    public void traverseForward() {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public void traverseBackward() {
        while (tail!= null) {
            System.out.println(tail.data);
            tail = tail.prev;
        }
    }
}

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);
        dll.addFirst(4);
        dll.insertAfter(2, 1);
        dll.traverseForward();
    }
}
