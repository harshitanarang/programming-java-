public class merge_sort{

        public static void main(String[] args) {
            int[] array = {12, 11, 13, 5, 6, 7};
            
            System.out.println("Original array:");
            printArray(array);
    
            mergeSort(array, 0, array.length - 1);
    
            System.out.println("\nSorted array:");
            printArray(array);
        }
    
        // Merge Sort function
        public static void mergeSort(int[] array, int left, int right) {
            if (left < right) {
                // Find the middle point
                int mid = left + (right - left) / 2;
    
                // Recursively sort the first and second halves
                mergeSort(array, left, mid);
                mergeSort(array, mid + 1, right);
    
                // Merge the sorted halves
                merge(array, left, mid, right);
            }
        }
    
        // Merge function
        public static void merge(int[] array, int left, int mid, int right) {
            // Sizes of the two subarrays to be merged
            int size1 = mid - left + 1;
            int size2 = right - mid;
    
            // Create temporary arrays
            int[] leftArray = new int[size1];
            int[] rightArray = new int[size2];
    
            // Copy data to temporary arrays
            for (int i = 0; i < size1; ++i)
                leftArray[i] = array[left + i];
            for (int j = 0; j < size2; ++j)
                rightArray[j] = array[mid + 1 + j];
    
            // Merge the temporary arrays
    
            // Initial indices of the two subarrays
            int i = 0, j = 0;
    
            // Initial index of the merged subarray
            int k = left;
            while (i < size1 && j < size2) {
                if (leftArray[i] <= rightArray[j]) {
                    array[k] = leftArray[i];
                    i++;
                } else {
                    array[k] = rightArray[j];
                    j++;
                }
                k++;
            }
    
            // Copy remaining elements of leftArray[], if any
            while (i < size1) {
                array[k] = leftArray[i];
                i++;
                k++;
            }
    
            // Copy remaining elements of rightArray[], if any
            while (j < size2) {
                array[k] = rightArray[j];
                j++;
                k++;
            }
        }
    
        // Utility function to print an array
        public static void printArray(int[] array) {
            for (int value : array) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
    
