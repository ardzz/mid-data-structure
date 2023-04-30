package LinkedList;

import Items.AbstractItem;

public class Node {
    public AbstractItem item;
    public Node next;
    public Node prev;

    public Node(AbstractItem item) {
        this.item = item;
        this.next = null;
        this.prev = null;
    }

    public void setNext(Node node) {
        this.next = node;
    }

    public void setPrev(Node node) {
        this.prev = node;
    }
}
