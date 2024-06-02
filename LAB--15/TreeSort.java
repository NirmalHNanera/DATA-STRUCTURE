import java.util.*;

class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinarySearchTree {
    TreeNode root;

    BinarySearchTree() {
        root = null;
    }

    void insert(int data) {
        root = insertRec(root, data);
    }

    TreeNode insertRec(TreeNode root, int data) {
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    void inOrderTraversal(TreeNode root, List<Integer> list) {
        if (root != null) {
            inOrderTraversal(root.left, list);
            list.add(root.data);
            inOrderTraversal(root.right, list);
        }
    }
}

public class TreeSort {
    public static void treeSort(int[] arr) {
        BinarySearchTree bst = new BinarySearchTree();
        for (int num : arr) {
            bst.insert(num);
        }
        List<Integer> sortedList = new ArrayList<>();
        bst.inOrderTraversal(bst.root, sortedList);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sortedList.get(i);
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

        treeSort(arr);

        System.out.println("Sorted array (using Tree Sort):");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}
