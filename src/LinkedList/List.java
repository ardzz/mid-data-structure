package LinkedList;

import Helper.PromptHandler;
import Items.AbstractItem;

public class List {
    public Node head;
    public Node tail;
    public int size;
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

    public void addLast(String[] attribute, AbstractItem item) {
        item.setAttributeValue(attribute);
        Node node = new Node(item);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.setPrev(tail);
            tail.setNext(node);
            tail = node;
        }
        size++;
    }

    public void addFirstByPrompt(AbstractItem item) {
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

    public void addLastByPrompt(AbstractItem item) {
        Node node = new Node(newItem(item));
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.setPrev(tail);
            tail.setNext(node);
            tail = node;
        }
        size++;
    }

    public void addAfterByPrompt(AbstractItem item, int index) {
        Node node = new Node(newItem(item));
        Node current = head;
        int i = 1;
        while (i < index) {
            current = current.next;
            i++;
        }
        node.setNext(current.next);
        node.setPrev(current);
        current.next.prev = node;
        current.next = node;
        size++;
    }

    public void addBeforeByPrompt(AbstractItem item, int index) {
        Node node = new Node(newItem(item));
        Node current = head;
        int i = 1;
        while (i < index) {
            current = current.next;
            i++;
        }
        node.setNext(current);
        node.setPrev(current.prev);
        current.prev.next = node;
        current.prev = node;
        size++;
    }

    public void deleteByIndex(int index) {
        Node current = head;
        int i = 1;
        while (i < index) {
            current = current.next;
            i++;
        }
        current.prev.next = current.next;
        current.next.prev = current.prev;
        size--;
    }

    public void deleteAfterByIndex(int index) {
        Node current = head;
        int i = 1;
        while (i < index) {
            current = current.next;
            i++;
        }
        current.next.next.prev = current;
        current.next = current.next.next;
        size--;
    }

    public void deleteBeforeByIndex(int index) {
        Node current = head;
        int i = 1;
        while (i < index) {
            current = current.next;
            i++;
        }
        current.prev.prev.next = current;
        current.prev = current.prev.prev;
        size--;
    }

    public void print() {
        Node current = head;
        int index = 1;
        while (current != null) {
            for (int i = 0; i < current.item.getAttributeKey().length; i++) {
                System.out.println("[" + index + "] " + current.item.getAttributeKey()[i] + ": " + current.item.getAttributeValue()[i]);
            }
            index++;
            current = current.next;
            System.out.println();
        }
    }
}
