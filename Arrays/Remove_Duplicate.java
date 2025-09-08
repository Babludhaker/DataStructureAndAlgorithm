import java.util.HashSet;

public class Remove_Duplicate {
    public static void main(String[] args) {
        int arr[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i])) {
                set.add(arr[i]);
            }
        }

        int idx = 0;

        for (Integer s : set) {
            arr[idx] = s;
            idx++;
        }

        System.out.println(idx);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
