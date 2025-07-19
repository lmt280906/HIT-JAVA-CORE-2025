package Buoi2;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println((a + b) + " " + (a - b) + " " + (a * b) + " " + ((double) a / b) + " " + (a % b));
        if (a == b) {
            System.out.println(a +" " +"bang"+ " " + b);
        }
    }
}
