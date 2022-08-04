package sortingtechnices;

public class QuickSort {
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < arr.length; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;

    }

    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pidx = partition(arr, low, high);
            quickSort(arr, pidx + 1, high);
            quickSort(arr, low, pidx - 1);
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 5, 8, 9, 6, 3, 1, 4, 7};
        int n = arr.length;
        quickSort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
