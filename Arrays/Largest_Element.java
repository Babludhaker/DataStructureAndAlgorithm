public class Largest_Element {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 7, 7, 8 };
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        System.out.println("Largest element in array " + largest);
    }
}
