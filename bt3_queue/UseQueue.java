package bt3_queue;

public class UseQueue {
    public static void main(String[] args) {
        Queue que = new Queue();
        que.enQueue(2);
        que.enQueue(3);
        que.enQueue(4);
        que.enQueue(6);
        que.display();
        que.deQueue();
        que.deQueue();
        que.display();
    }
}
