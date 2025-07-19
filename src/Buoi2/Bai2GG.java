package Buoi2;

import java.util.Scanner;

public class Bai2GG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        for (int i = 0; i < n; i++) {
            System.out.printf("a[" + i + "]=");
            a[i] = sc.nextInt();
        }
        for (int i = 0; (i + 1) <= n; i++) {
            if (i % 2 != 0) {
                a[i] += Math.abs(a[i + 1] - a[i - 1]);
            }
        }

        System.out.printf("Mang moi la :");
        for (int i = 0; i < n; i++) {
            System.out.printf(a[i] + " ");
        }
    }
}
