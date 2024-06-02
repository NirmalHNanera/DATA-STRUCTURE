import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    private Node head;

    CircularLinkedList() {
        this.head = null;
    }

    void insertFront(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = newNode; // Point to itself in a circular list
            head = newNode;
        } else {
            newNode.next = head;
            Node last = getLastNode();
            last.next = newNode;
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
        Node prev = null;
        Node current = head;
        int count = 1;
        do {
            prev = current;
            current = current.next;
            count++;
        } while (current != head && count < position);
        if (current == head) {
            System.out.println("Invalid position. Node not found at position " + position);
            return;
        }
        prev.next = current.next;
        System.out.println("Node with data " + current.data + " deleted from position " + position);
    }

    void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        System.out.print("Circular Linked List: ");
        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }

    private Node getLastNode() {
        Node current = head;
        while (current.next != head) {
            current = current.next;
        }
        return current;
    }

    private void deleteFront() {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }
        if (head.next == head) {
            System.out.println("Node with data " + head.data + " deleted from the front.");
            head = null;
            return;
        }
        Node last = getLastNode();
        last.next = head.next;
        System.out.println("Node with data " + head.data + " deleted from the front.");
        head = head.next;
    }
}

public class CircularLinkedListImplementation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CircularLinkedList list = new CircularLinkedList();

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
                    System.out.println("This operation is not implemented yet.");
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
