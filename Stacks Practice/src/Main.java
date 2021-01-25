class Node {
    int data;
    Node next;
    Node (int data) {
        this.data = data;
    }
}


class Stack {
    Node top;

    public void push(int data) {
        Node nn = new Node(data);
        if (top == null) {
            top = nn;
        }
        nn.next = top;
        top = nn;
    }

    public int pop() {
        int value = top.data;
        top = top.next;
        return  value;
    }
}
public class Main {

    public static void main(String[] args) {
        Stack stk = new Stack();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
    }
}
