package sol;
public class DoublyLinkedList<T> implements IList<T>, IListWithNode<T> {
    private Node<T> head;
    private Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    @Override
    public boolean isEmpty() {
        if (this.head == null){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public T getFirst() {
        if(this.head == null){
            throw new RuntimeException("List is empty");
        }
        return (T) this.head.item;
    }

    @Override
    public T getLast() {
        if(this.tail == null){
            throw new RuntimeException("List is empty");
        }
        return (T) this.tail.item;
    }

    @Override
    public void addFirst(T item) {
        Node<T> n = new Node<T>(item);
        if (this.head == null) {
            this.head = n;
            this.tail = n;
        } else {
            n.next = this.head;
            this.head.prev = n;
            this.head = n;
        }
    }

    @Override
    public void addLast(T item) {
        Node<T> n = new Node<T>(item);
        if (this.head == null) {
            this.head = n;
            this.tail = n;
        } else {
            this.tail.next = n;
            n.prev = this.tail;
            this.tail = n;
        }
    }

    @Override
    public T get(int index) {
        if(this.head == null){
            throw new RuntimeException("List is empty");
        }
        Node current = this.head;
        for (int i = 0; i < index; i++) {
            if(current.next == null){
                throw new RuntimeException("Index out of bounds");
            }
            current = current.next;
        }
        return (T) current.item;
    }

    @Override
    public void reverse() {
        Node current = this.tail;
        this.tail = this.head;
        this.head = current;
        while(current != null){
            Node prev = current.prev;
            current.prev = current.next;
            current.next = prev;
            current = prev;
        }
    }

    @Override
    public boolean remove(T item) {
        Node current = this.head;
        while (current.item != item && current.next != null) {
            current = current.next;
        }
        if (current.item != item){
            return false;
        }
        if (current.next == null) {
            current.prev.next = null;
            this.tail = current.prev;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
        return true;
    }


    @Override
    public T removeFirst() {
        if(this.head == null){
            throw new RuntimeException("List is empty");
        }
        Node <T> temp = this.head;
        this.head = this.head.next;
        return (T) temp;
    }

    @Override
    public T removeLast() {
        if(this.tail == null){
            throw new RuntimeException("List is empty");
        }
        Node <T> temp = this.tail;
        this.tail = this.tail.prev;
        return (T) temp;
    }

    @Override
    public Node<T> getNode(T item) {
        Node current = this.head;
        while (current.item != item && current.next != null) {
            current = current.next;
        }
        if (current.item != item){
            throw new IllegalArgumentException("item not present");
        }
        return (Node<T>) current;
    }

    @Override
    public void removeNode(Node<T> node) {
        T item = node.item;
        Node current = this.head;
        while (current.item != item && current.next != null) {
            current = current.next;
        }
        if (current.item == item){
            if (current.next == null) {
                current.prev.next = null;
                this.tail = current.prev;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
        }
    }
}

