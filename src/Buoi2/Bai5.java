package Buoi2;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bang cua chuong 5 :");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 nhan " + i + " " + "bang " + (5 * i));

        }
        int tong1 = 0;
        for (int i = 2; i <= 100; i += 2) {
            tong1 += i;
        }
        System.out.println("Tong(for) :" + tong1);
        int tong2 = 0;
        int i = 2;
        while (i <= 100) {
            tong2 += i;
            i += 2;
        }
        System.out.println("Tong(while) :" + tong2);


    }
}
