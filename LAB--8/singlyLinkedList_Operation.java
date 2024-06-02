import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    private Node head;

    SinglyLinkedList() {
        this.head = null;
    }

    void insertFront(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        System.out.println("Node with data " + data + " inserted at the front.");
    }

    void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node current = head;
        System.out.print("List: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    void deleteFront() {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }
        System.out.println("Node with data " + head.data + " deleted from the front.");
        head = head.next;
    }

    void insertEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            System.out.println("Node with data " + data + " inserted at the end.");
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        System.out.println("Node with data " + data + " inserted at the end.");
    }

    void deleteEnd() {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }
        if (head.next == null) {
            System.out.println("Node with data " + head.data + " deleted from the end.");
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        System.out.println("Node with data " + current.next.data + " deleted from the end.");
        current.next = null;
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
        while (current != null && count < position) {
            prev = current;
            current = current.next;
            count++;
        }
        if (current == null) {
            System.out.println("Invalid position. Node not found at position " + position);
            return;
        }
        prev.next = current.next;
        System.out.println("Node with data " + current.data + " deleted from position " + position);
    }
}

public class singlyLinkedList_Operation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SinglyLinkedList list = new SinglyLinkedList();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert at the front");
            System.out.println("2. Display all nodes");
            System.out.println("3. Delete first node");
            System.out.println("4. Insert at the end");
            System.out.println("5. Delete last node");
            System.out.println("6. Delete node at specified position");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert at the front: ");
                    int data = scanner.nextInt();
                    list.insertFront(data);
                    break;
                case 2:
                    list.display();
                    break;
                case 3:
                    list.deleteFront();
                    break;
                case 4:
                    System.out.print("Enter data to insert at the end: ");
                    int dataEnd = scanner.nextInt();
                    list.insertEnd(dataEnd);
                    break;
                case 5:
                    list.deleteEnd();
                    break;
                case 6:
                    System.out.print("Enter position to delete: ");
                    int position = scanner.nextInt();
                    list.deleteAtPosition(position);
                    break;
                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
