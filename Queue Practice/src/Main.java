class Node {
    Node next;
    int data;
    Node (int data) {
        this.data = data;
    }
}

class Queue {
    Node front, rear;

    public void enqueue(int data) {
        Node nn = new Node(data);
        if (front == null) {
            front = rear = nn;
        }
        rear.next = nn;
        rear = nn;
    }

    public int dequeue() {
        int value  = front.data;
        front = front.next;
        return value;
    }
}

public class Main {

    public static void main(String[] args) {
        Queue q = new Queue();
        Queue q2 = new Queue();

        int [] arr = {5, 7, 12, 4, 0, 4, 6};
        for (int i = 0; i < arr.length; i++) {
            q.enqueue(arr[i]);
            q2.enqueue(arr[i]);
            while (q.rear != null) {
                q.dequeue();
                q2.dequeue();
            }
        }
        System.out.println(q.front.data);
    }
}
