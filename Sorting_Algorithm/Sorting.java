import java.util.*;

public class Sorting {

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void bubbleSort(int arr[]) {
        // Max Element push at the end

        for (int i = 0; i < arr.length; i++) {
            boolean isSwap = false;

            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    isSwap = true;
                }

            }

            if (!isSwap) {
                break;
            }
        }
    }

    // find mini element and correct place to insert
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int mini = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }
            }

            swap(arr, i, mini);
        }
    }

    // take element and place it correct place

    public static void insertionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int j = i;

            while (j > 0 && arr[j - 1] > arr[j]) {
                swap(arr, j, j - 1);
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 14, 9, 15, 12, 6, 8, 13 };
        int arr1[] = { 1, 2, 3, 4, 5 };
        bubbleSort(arr1);

        // selectionSort(arr);
        // insertionSort(arr);

        for (int i : arr1) {
            System.out.print(i + " ");
        }
    }
}