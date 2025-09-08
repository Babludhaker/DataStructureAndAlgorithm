public class Rotate_Array {

    public static void onePlace(int arr[]) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
    }

    public static void dPlace(int arr[], int d) {
        int n = arr.length;
        int temp[] = new int[d];

        // place d element
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        // Shifting element
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }
        // put element last for temp to arr
        for (int i = 0; i < temp.length; i++) {
            arr[n - d + i] = temp[i];
        }
    }

    public static void reverse(int arr[], int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void rotateArrayByRight(int nums[], int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n - k - 1);
        reverse(nums, n - k, n - 1);
        reverse(nums, 0, n - 1);
    }

    public static void rotateArrayByLeft(int nums[], int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
        reverse(nums, 0, n - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        // onePlace(arr);
        // dPlace(arr, 3);

        // optimal Approach
        // rotateArrayByRight(arr, 3);
        rotateArrayByLeft(arr, 3);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
