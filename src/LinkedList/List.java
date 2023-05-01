package LinkedList;

import Helper.PromptHandler;
import Items.AbstractItem;
import org.jetbrains.annotations.NotNull;

public class List {
    public Node head;
    public Node tail;
    public int size;
    public List() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public AbstractItem newItem(@NotNull AbstractItem item) {
        PromptHandler prompt = item.PromptInput();
        item.setAttributeValue(prompt.getAttributeValue());
        return item;
    }

    public void addLast(String[] attribute, @NotNull AbstractItem item) {
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

    public void addAtIndexByPrompt(AbstractItem item, int index) {
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

    public void deleteByIndex(int index) {
        Node current = head;
        int i = 1;
        while (i < index) {
            current = current.next;
            i++;
        }
        if (current.next == null) {
            if (current.prev == null) {
                head = null;
                tail = null;
            } else {
                current.prev.next = null;
                tail = current.prev;
            }
        } else if (current.prev == null) {
            current.next.prev = null;
            head = current.next;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
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

    public void deleteFirst() {
        head = head.next;
        head.prev = null;
        size--;
    }

    public void deleteLast() {
        tail = tail.prev;
        tail.next = null;
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

    public AbstractItem searchByString(String search) {
        Node current = head;
        while (current != null) {
            for (int i = 0; i < current.item.getAttributeValue().length; i++) {
                String current_data = current.item.getAttributeValue()[i];
                if (current_data.equalsIgnoreCase(search)) {
                    return current.item;
                }
            }
            current = current.next;
        }
        return null;
    }

    public void printFromItem(@NotNull AbstractItem item) {
        for (int i = 0; i < item.getAttributeKey().length; i++) {
            System.out.println(item.getAttributeKey()[i] + ": " + item.getAttributeValue()[i]);
        }
    }

    public String[] getByIndex(int index) {
        Node current = head;
        int i = 1;
        while (i < index) {
            current = current.next;
            i++;
        }
        return current.item.getAttributeValue();
    }

    public int getTotalPrice() {
        Node current = head;
        int totalPrice = 0;
        while (current != null) {
            totalPrice += Integer.parseInt(current.item.getAttributeValue()[2]);
            current = current.next;
        }
        return totalPrice;
    }

    public int getSize() {
        return size;
    }
}
