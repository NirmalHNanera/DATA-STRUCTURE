import java.util.Scanner;

class SimpleQueue {
    private int front, rear, size;
    private int[] queue;

    public SimpleQueue(int size) {
        this.size = size;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    public void insert(int item) {
        if (rear == size - 1) {
            System.out.println("Queue is full");
        } else {
            if (front == -1) front = 0;
            queue[++rear] = item;
            System.out.println("Inserted " + item);
        }
    }

    public void delete() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Deleted " + queue[front++]);
            if (front > rear) {
                front = rear = -1;
            }
        }
    }

    public void display() {
        if (front == -1) {
            System.out.println("Queue is empty");
        } else {
            System.out.print("Queue elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }
}

public class SimpleQueueOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the queue: ");
        int size = sc.nextInt();
        SimpleQueue queue = new SimpleQueue(size);
        sc.close();
        int choice;
        do {
            System.out.println("\nQueue Operations:");
            System.out.println("1. INSERT");
            System.out.println("2. DELETE");
            System.out.println("3. DISPLAY");
            System.out.println("4. EXIT");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    int value = sc.nextInt();
                    queue.insert(value);
                    break;
                case 2:
                    queue.delete();
                    break;
                case 3:
                    queue.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);
    }
}
