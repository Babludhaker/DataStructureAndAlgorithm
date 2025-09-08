public class Second_Largest_Element {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 7, 7, 8 };
        int largest = arr[0];
        int secondLargest = -1;

        for (int i = 1; i < arr.length; i++) {
            if (largest < arr[i]) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("Second Largest element in array " + secondLargest);
    }
}
