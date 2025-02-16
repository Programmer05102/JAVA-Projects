public class MergeSort {
    
    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // Base case: the array is already sorted
        }
        
        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];
        
        // Dividing the array into two halves
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < arr.length; i++) {
            right[i - mid] = arr[i];
        }
        
        mergeSort(left); // Sorting the left half
        mergeSort(right); // Sorting the right half
        
        merge(arr, left, right); // Merging the sorted halves
    }
    
    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0; // Index for the left array
        int j = 0; // Index for the right array
        int k = 0; // Index for the merged array
        
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        
        // Copy the remaining elements of the left array, if any
        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }
        
        // Copy the remaining elements of the right array, if any
        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 1, 9, 3};
        mergeSort(arr);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
