
import java.util.Arrays;

public class QuickSortExample {

    public static void quickSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return; // Base case: the array is already sorted or empty
        }

        int low = 0;
        int high = arr.length - 1;
        quickSortRecursive(arr, low, high);
    }

    private static void quickSortRecursive(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high); // Partition the array and get the pivot index
            quickSortRecursive(arr, low, pivotIndex - 1); // Sort the left subarray
            quickSortRecursive(arr, pivotIndex + 1, high); // Sort the right subarray
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choose the pivot as the last element
        int i = low - 1; // Index of smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j); // Swap elements arr[i] and arr[j]
            }
        }

        swap(arr, i + 1, high); // Swap the pivot element with the element at index i + 1
        return i + 1; // Return the pivot index
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {9, 5, 1, 8, 3, 7, 4, 6, 2};
        System.out.println("Original array: " + Arrays.toString(arr));

        quickSort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
