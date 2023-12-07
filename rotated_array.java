public class rotated_array {
        public static int minsearch(int arr[]) {
            int start = 0;
            int end = arr.length - 1;
            while (start < end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] > arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid;
                }
            }
            return start;
        }
    
        public static int search(int arr[], int start, int end, int target) {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target == arr[mid]) {
                    return mid;
                } else if (target >= arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            return -1; // Element not found
        }
    
        public static int search(int arr[], int target) {
            int pivot = minsearch(arr);
            if (target >= arr[pivot] && target <= arr[arr.length - 1]) {
                return search(arr, pivot, arr.length - 1, target);
            } else {
                return search(arr, 0, pivot - 1, target);
            }
        }
    
        public static void main(String[] args) {
            int arr[] = {4, 5, 6, 7, 1, 2, 3};
            int target = 3;
            int result = search(arr, target);
            System.out.println("Element found at index: " + result);
        }
    }

