
package pa3;

/**
 * A queue of nodes.
 */
public class Queue {

    /** 
     * Constructs an empty queue.
     */
    public Queue() {

        
    }

    /**
     * Adds a node to the queue.
     * @param node
     */
    public void enqueue(Node node) {

        
    }

    /**
     * Removes and returns the node at the front of the queue.
     * @return the node at the front of the queue.
     */
    public Node dequeue() {

        
    }

    /**
     * Returns true if the queue is empty.
     * @return true if the queue is empty.
     */
    public boolean isEmpty() {
        
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
