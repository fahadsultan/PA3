
package pa3;

/**
 * A queue of nodes.
 */
public class Queue {

    private Node[] queue;
    private int front;
    private int rear;
    private int size;

    /** 
     * Constructs an empty queue.
     */
    public Queue() {
        queue = new Node[10];
        front = 0;
        rear = 0;
        size = 0;
    }

    /**
     * Adds a node to the queue.
     * @param node
     */
    public void enqueue(Node node) {
        if (size == queue.length) {
            Node[] newQueue = new Node[queue.length * 2];
            for (int i = 0; i < size; i++) {
                newQueue[i] = queue[(front + i) % queue.length];
            }
            queue = newQueue;
            front = 0;
            rear = size;
        }
        queue[rear] = node;
        rear = (rear + 1) % queue.length;
        size++;
    }

    /**
     * Removes and returns the node at the front of the queue.
     * @return the node at the front of the queue.
     */
    public Node dequeue() {
        if (isEmpty()) {
            return null;
        }
        Node node = queue[front];
        front = (front + 1) % queue.length;
        size--;
        return node;
    }

    /**
     * Returns true if the queue is empty.
     * @return true if the queue is empty.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        Node node1 = new Node(4);
        Node node2 = new Node(4);
        queue.enqueue(node1);
        queue.enqueue(node2);
        System.out.println(queue.dequeue().value); // Should print 4
    }
    
}
