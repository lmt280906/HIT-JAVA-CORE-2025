package Buoi2;

import java.util.Scanner;

public class Bai1GG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap ban kinh r : ");
        float bk = sc.nextFloat();
        System.out.println("Chu vi la : " + " " + (2 * 3.14 * bk));
        System.out.printf("Dien tich la : " + " " + (3.14 * bk * bk));
    }
}
