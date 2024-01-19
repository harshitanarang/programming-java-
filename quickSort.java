public class quickSort {

    public static void main(String[] args) {
        int[] array = {12, 4, 5, 6, 7, 3, 1, 15};
        
        System.out.println("Original array:");
        printArray(array);

        quickSort(array, 0, array.length - 1);

        System.out.println("\nSorted array:");
        printArray(array);
    }

    // Quick Sort function
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Partition the array and get the index of the pivot element
            int pivotIndex = partition(array, low, high);

            // Recursively sort the two halves
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    // Partition function
    public static int partition(int[] array, int low, int high) {
        // Choose the rightmost element as the pivot
        int pivot = array[high];
        
        // Index of the smaller element
        int i = low - 1;

        // Traverse the array and rearrange elements such that
        // elements smaller than the pivot are on the left
        // and elements greater than the pivot are on the right
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }

        // Swap the pivot element with the element at index (i+1)
        swap(array, i + 1, high);

        // Return the index of the pivot element
        return i + 1;
    }

    // Utility function to swap two elements in an array
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // Utility function to print an array
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
