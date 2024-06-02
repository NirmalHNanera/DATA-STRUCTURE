import java.util.*;

public class BucketSort {
    public static void bucketSort(int[] arr) {
        int n = arr.length;
        if (n <= 0) return;

        int maxVal = Arrays.stream(arr).max().getAsInt();
        int minVal = Arrays.stream(arr).min().getAsInt();
        int bucketSize = maxVal - minVal + 1;

        List<Integer>[] buckets = new List[bucketSize];
        for (int i = 0; i < bucketSize; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (int num : arr) {
            buckets[num - minVal].add(num);
        }

        int index = 0;
        for (List<Integer> bucket : buckets) {
            Collections.sort(bucket);
            for (int num : bucket) {
                arr[index++] = num;
            }
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

        bucketSort(arr);

        System.out.println("Sorted array (using Bucket Sort):");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}
