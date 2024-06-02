import java.util.Scanner;

public class CircularQueue {
    private int maxSize;
    private int front;
    private int rear;
    private int[] queueArray;

    public CircularQueue(int size) {
        maxSize = size + 1; // One extra space to differentiate between full and empty queue
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
    }

    public void insert(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot insert " + value);
        } else {
            rear = (rear + 1) % maxSize;
            queueArray[rear] = value;
            System.out.println(value + " inserted into the queue");
        }
    }

    public void delete() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot delete.");
        } else {
            int deletedValue = queueArray[front];
            System.out.println(deletedValue + " deleted from the queue");
            front = (front + 1) % maxSize;
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.print("Queue (front to rear): ");
            int i = front;
            do {
                System.out.print(queueArray[i] + " ");
                i = (i + 1) % maxSize;
            } while (i != (rear + 1) % maxSize);
            System.out.println();
        }
    }

    private boolean isEmpty() {
        return (rear + 1) % maxSize == front;
    }

    private boolean isFull() {
        return (rear + 2) % maxSize == front;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the circular queue: ");
        int size = scanner.nextInt();

        CircularQueue queue = new CircularQueue(size);

        while (true) {
            System.out.println("\nChoose operation:");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    int insertValue = scanner.nextInt();
                    queue.insert(insertValue);
                    break;
                case 2:
                    queue.delete();
                    break;
                case 3:
                    queue.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
