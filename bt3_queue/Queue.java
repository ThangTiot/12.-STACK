package bt3_queue;

public class Queue {
    private Node front;
    private Node rear;


    public Queue() {
    }
    public void enQueue(int value) {
        Node temp = new Node();
        temp.data = value;
        if (front == null) {
            front = temp;
        } else {
            rear.link = temp;
        }
        rear = temp;
        rear.link = front;
    }
    public void deQueue() {
        Node temp = front;
        front = temp.link;
        rear.link = front;
    }
    public void display() {
        Node temp = front;
        while (temp.link != front) {
            System.out.print(temp.data + ", ");
            temp = temp.link;
        }
        System.out.println(temp.data);
    }
}
