package LinkedList;

import Helper.PromptHandler;
import Items.AbstractItem;

public class List {
    public Node head;
    public Node tail;
    public int size;

    protected AbstractItem item;
    public List() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public AbstractItem newItem(AbstractItem item) {
        PromptHandler prompt = item.PromptInput();
        item.setAttributeValue(prompt.getAttributeValue());
        return item;
    }

    public void addFirstPrompt(AbstractItem item) {
        Node node = new Node(newItem(item));
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.setNext(head);
            head.prev = node;
            head = node;
        }
        size++;
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.println(current.item.getAttributeValue()[0]);
            current = current.next;
        }
    }
}
