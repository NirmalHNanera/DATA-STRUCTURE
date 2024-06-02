import java.util.Scanner;

public class ReplaceNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number to be replaced: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the new number: ");
        int num2 = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (arr[i] == num1) {
                arr[i] = num2;
                System.out.println("Replaced number at index: " + i);
            }
        }

        System.out.println("Final array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
