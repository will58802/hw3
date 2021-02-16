package sol;
/**
 * An interface for a very basic List.
 *
 * @param <T> - the type of items in the list
 *
 *            You will modify the declaration later so that it extends
 *            Iterable<T>
 *
 */
public interface IList<T> {

  /**
   * Returns whether the list is empty.
   *
   * @return true if the list is empty, false otherwise
   */
  public boolean isEmpty();

  /**
   * Returns the first item in the list.
   *
   * @return the first item in the list
   */
  public T getFirst();

  /**
   * Returns the last item in the list.
   *
   * @return the last item in the list
   */
  public T getLast();

  /**
   * Adds an item to the start of the list.
   *
   * @param item - the item to be added
   */
  public void addFirst(T item);

  /**
   * Adds an item to the end of the list.
   *
   * @param item - the item to be added
   */
  public void addLast(T item);

  //////////////////////////////////////////////////////////////////////////////
  // ADD MORE METHODS HERE!!!
  //////////////////////////////////////////////////////////////////////////////
  public T get(int index);
  public void reverse();
  public T removeFirst();
  public T removeLast();
  public boolean remove(T item);
}
