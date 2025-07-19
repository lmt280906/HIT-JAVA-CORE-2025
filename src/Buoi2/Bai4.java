package Buoi2;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("a[" + i + "]=");
            a[i] = sc.nextInt();
        }
        System.out.printf("Mang vua nhap la :");
        for (int i = 0; i < n; i++) {
            System.out.printf(a[i] + " ");
        }
        int tong = 0;
        for (int i = 0; i < n; i++) {
            tong += a[i];
        }
        System.out.println("\n Tong cac phan tu trong mang :" + tong);
        int max = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("GTLN la :" + max);
    }
}
