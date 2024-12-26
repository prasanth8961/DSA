import java.io.*;
import java.util.*;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LinkedList {
    private Node head;

    public LinkedList() {
        head = null;
    }

    public void add(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public Node getHead() {
        return head;
    }

    public int get(int index) {
        int idx = 0;
        if (index < 0 || head == null) {
            return -1;
        }
        if (index == 0) {
            return head.val;
        }
        Node currentNode = head;
        while (idx < index && currentNode.next != null) {
            idx++;
            currentNode = currentNode.next;
        }
        if (idx != index) return -1;
        return currentNode.val;
    }

    public void addAtHead(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }
        Node tempNode = head;
        while (tempNode.next != null) {
            tempNode = tempNode.next;
        }
        tempNode.next = newNode;
    }

    public void addAtIndex(int index, int val) {
        Node newNode = new Node(val);
        if (index < 0) {
            return;
        }
        if (head == null && index != 0) {
            return;
        }
        if (index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        int idx = 0;
        Node prevNode = head;
        while (idx < index - 1 && prevNode.next != null) {
            idx++;
            prevNode = prevNode.next;
        }
        if (prevNode.next == null) {
            prevNode.next = newNode;
            return;
        }
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || head == null) {
            return;
        }
        if (index == 0) {
            head = head.next;
            return;
        }
        int idx = 0;
        Node prevNode = head;
        while (idx < index - 1 && prevNode.next != null) {
            idx++;
            prevNode = prevNode.next;
        }
        if (prevNode.next == null) {
            return;
        }
        prevNode.next = prevNode.next.next;
    }

    public Node reverse(Node head) {
        if (head == null || head.next == null) return head;

        Node prevNode = reverse(head.next);

        head.next.next = head;
        head.next = null;
        return prevNode;
    }

    public void printList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.val + " ");
            currentNode = currentNode.next;
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(10);
        linkedList.add(21);
        linkedList.add(14);
        linkedList.add(43);
        linkedList.add(28);
        linkedList.add(18);
        
        System.out.println("Original LinkedList:");
        linkedList.printList();
        
        System.out.println("\nReversed LinkedList:");
        linkedList.head = linkedList.reverse(linkedList.getHead()); 
        linkedList.printList();
    }
}
