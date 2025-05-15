package org.lopes;

public class Encadeada {
    int data;
    Encadeada next;
    Encadeada prev;
    Encadeada head;
    Encadeada tail;

    public Encadeada(int data, Encadeada next, Encadeada prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public void LinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Correct insertAtHead (actually inserts at head)
    public void insertAtHead(int data) {
        Encadeada newNode = null;
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertAtTail(int data) {
        Encadeada newNode = null;
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void orderNode() {
        if (head == null || head.next == null) {
            return; // Already sorted (0 or 1 node)
        }

        boolean swapped;
        do {
            swapped = false;
            Encadeada current = head;
            Encadeada prev = null;

            while (current.next != null) {
                if (current.data > current.next.data) {
                    Encadeada nextNode = current.next;
                    current.next = nextNode.next;
                    nextNode.next = current;

                    if (prev == null) {
                        head = nextNode;
                    } else {
                        prev.next = nextNode;
                    }

                    prev = nextNode;
                    swapped = true;
                } else {
                    prev = current;
                    current = current.next;
                }
            }
            // Update tail after each pass
            tail = current;
            } while (swapped);
    }
}



