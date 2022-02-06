package exchapter06;

import java.util.Scanner;

public class MergeSort {
    static int[] buff;

    static void mergeSort(int[] a, int left, int right) {
        if (left < right) {
            int i;
            int center = (left + right) / 2;
            int p = 0;
            int j = 0;
            int k = left;

            mergeSort(a, left, center);
            mergeSort(a, center + 1, right);

            for (i = left; i <= center; i++) {
                buff[p++] = a[i];
            }

            while (i <= right && j < p) {
                a[k++] = (buff[j] <= a[i]) ? buff[j++] : a[i++];
            }
            while (j < p) {
                a[k++] = buff[j++];
            }
        }
    }

    static void kergeSort(int[] a, int n) {
        buff = new int[n];
        mergeSort(a, 0, n - 1);
        buff = null;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("병렬 정렬");
        System.out.println("요소수");
        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.println(i);
            x[i] = stdIn.nextInt();
        }
        kergeSort(x, nx);

        System.out.println("오름차순으로 정렬");
        for (int i = 0; i < nx; i++) {
            System.out.println(i + x[i]);
        }
    }
}
