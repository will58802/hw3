package sol;

/**
 * An interface for a List that explicitly interacts with node.
 *
 * @param <T> - the type of items in the list
 */
public interface IListWithNode<T> {
    /**
     * Returns the node at the specified index.
     *
     * @param index - an item index
     *
     * @return the node at the specified index
     *
     */
    public Node<T> getNode(T item);

    /**
     * Removes a node from the list given a reference to the actual node object.
     *
     * @param node - the node to remove
     *
     */
    public void removeNode(Node<T> node);
}
