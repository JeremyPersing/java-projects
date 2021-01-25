class Node {
    Node next;
    int data;

    Node(int data) {
        this.data = data;
    }

    int getData() {
        return data;
    }

    Node getNext() {
        return next;
    }

    void setNext(Node n) {
        next = n;
    }
}

class LinkedList {
    Node head;

    public void add(int value) {
        Node newNode = new Node(value);
        head.setNext(newNode);
        head = newNode;
    }

    /*public void traverse() {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }*/
}

public class Main {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(1);
        ll.add(2);
//        ll.traverse();
    }
}
