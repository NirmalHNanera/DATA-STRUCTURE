import java.util.Scanner;

class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    private Node head;
    private Node tail;

    DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    void insertFront(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        System.out.println("Node with data " + data + " inserted at the front.");
    }

    void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }
        if (position == 1) {
            deleteFront();
            return;
        }
        Node current = head;
        int count = 1;
        while (current != null && count < position) {
            current = current.next;
            count++;
        }
        if (current == null) {
            System.out.println("Invalid position. Node not found at position " + position);
            return;
        }
        if (current == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            current.prev.next = current.next;
            if (current.next != null) {
                current.next.prev = current.prev;
            }
        }
        System.out.println("Node with data " + current.data + " deleted from position " + position);
    }

    void insertEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        System.out.println("Node with data " + data + " inserted at the end.");
    }

    void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        System.out.print("Doubly Linked List: ");
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    private void deleteFront() {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        System.out.println("Node deleted from the front.");
    }
}

public class DoublyLinkedListImplementation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoublyLinkedList list = new DoublyLinkedList();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert at the front");
            System.out.println("2. Delete node from specified position");
            System.out.println("3. Insert at the end");
            System.out.println("4. Display all nodes");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert at the front: ");
                    int data = scanner.nextInt();
                    list.insertFront(data);
                    break;
                case 2:
                    System.out.print("Enter position to delete: ");
                    int position = scanner.nextInt();
                    list.deleteAtPosition(position);
                    break;
                case 3:
                    System.out.print("Enter data to insert at the end: ");
                    int dataEnd = scanner.nextInt();
                    list.insertEnd(dataEnd);
                    break;
                case 4:
                    list.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
