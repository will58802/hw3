package sol;

/**
 * A class that implements doubly linked list nodes.
 */
public class Node<S> {
    S item;
    public Node<S> next;
    public Node<S> prev;

    /**
     * A constructor for Node.
     *
     * @param item - the item stored at this node
     */
    public Node(S item) {
        this.item = item;
        this.next = null;
        this.prev = null;
    }
}

