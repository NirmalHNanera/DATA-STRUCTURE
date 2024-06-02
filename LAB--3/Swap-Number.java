import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Before swap: a = " + a + ", b = " + b);
        swap(a, b);
    }

    public static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
        System.out.println("After swap: a = " + x + ", b = " + y);
    }
}
