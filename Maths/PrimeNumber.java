package Maths;

import java.util.*;

public class PrimeNumber {

    public static void sieveOfPrimeNumber(int n) {
        ArrayList<Boolean> ans = new ArrayList<>(Collections.nCopies(n, true));
        int count = 0;
        int num[] = new int[n];
        int k = 0;

        for (int i = 2; i < n; i++) {
            if (ans.get(i)) {
                count++;
                num[k++] = i;

                for (int j = i * 2; j < n; j += i) {
                    ans.set(j, false);
                }
            }
        }

        for (int j : num) {
            if (j == 0) {
                break;
            }
            System.out.print(j + " ");
        }
        System.out.println("total Count prime Number :" + count);
    }

    public static void main(String[] args) {
        sieveOfPrimeNumber(50);
    }
}
