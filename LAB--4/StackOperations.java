import java.util.Scanner;

class Stack {
    private int maxSize;
    private int top;
    private int[] stackArray;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full!");
        } else {
            stackArray[++top] = value;
            System.out.println("Pushed " + value);
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack is empty!");
        } else {
            System.out.println("Popped " + stackArray[top--]);
        }
    }

    public void peep() {
        if (top == -1) {
            System.out.println("Stack is empty!");
        } else {
            System.out.println("Top element is " + stackArray[top]);
        }
    }

    public void change(int index, int value) {
        if (index > top || index < 0) {
            System.out.println("Invalid index!");
        } else {
            stackArray[index] = value;
            System.out.println("Changed index " + index + " to " + value);
        }
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty!");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }
}

public class StackOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the stack: ");
        int size = sc.nextInt();
        Stack stack = new Stack(size);

        int choice;
        do {
            System.out.println("\nStack Operations:");
            System.out.println("1. PUSH");
            System.out.println("2. POP");
            System.out.println("3. PEEP");
            System.out.println("4. CHANGE");
            System.out.println("5. DISPLAY");
            System.out.println("6. EXIT");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int value = sc.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peep();
                    break;
                case 4:
                    System.out.print("Enter index to change: ");
                    int index = sc.nextInt();
                    System.out.print("Enter new value: ");
                    value = sc.nextInt();
                    stack.change(index, value);
                    break;
                case 5:
                    stack.display();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 6);
    }
}
