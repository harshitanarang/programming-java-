public class inversion_Count {

    public static void main(String[] args) {
        int[] array = {8, 4, 2, 1};
        int inversionCount = countInversions(array);

        System.out.println("Inversion Count: " + inversionCount);
    }

    public static int countInversions(int[] array) {
        // Create a copy of the array to avoid modifying the original
        int[] tempArray = array.clone();
        return mergeSortAndCount(array, tempArray, 0, array.length - 1);
    }

    private static int mergeSortAndCount(int[] array, int[] tempArray, int left, int right) {
        int inversionCount = 0;

        if (left < right) {
            int mid = left + (right - left) / 2;

            // Recursively count inversions in the left and right halves
            inversionCount += mergeSortAndCount(array, tempArray, left, mid);
            inversionCount += mergeSortAndCount(array, tempArray, mid + 1, right);

            // Merge the two halves and count inversions
            inversionCount += mergeAndCount(array, tempArray, left, mid, right);
        }

        return inversionCount;
    }

    private static int mergeAndCount(int[] array, int[] tempArray, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int k = left;
        int inversionCount = 0;

        while (i <= mid && j <= right) {
            if (tempArray[i] <= tempArray[j]) {
                array[k++] = tempArray[i++];
            } else {
                // Inversion found
                array[k++] = tempArray[j++];
                inversionCount += (mid - i + 1);
            }
        }

        // Copy the remaining elements from the left and right halves
        while (i <= mid) {
            array[k++] = tempArray[i++];
        }

        while (j <= right) {
            array[k++] = tempArray[j++];
        }

        return inversionCount;
    }
}
