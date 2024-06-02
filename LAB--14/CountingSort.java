import java.util.*;

public class CountingSort {
    public static void countingSort(int[] arr) {
        int n = arr.length;
        if (n <= 0) return;

        int maxVal = Arrays.stream(arr).max().getAsInt();
        int minVal = Arrays.stream(arr).min().getAsInt();
        int range = maxVal - minVal + 1;

        int[] count = new int[range];
        int[] output = new int[n];

        for (int num : arr) {
            count[num - minVal]++;
        }

        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i] - minVal] - 1] = arr[i];
            count[arr[i] - minVal]--;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        countingSort(arr);

        System.out.println("Sorted array (using Counting Sort):");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}
