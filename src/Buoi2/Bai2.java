package Buoi2;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine();
        int tuoi = sc.nextInt();
        sc.nextLine();
        String lop = sc.nextLine();
        double dtb = sc.nextDouble();
        System.out.println("Tên:" + " " + ten + " - Tuổi: " + " " + tuoi + "- Lớp:" + " " + lop + " - GPA: " + " " + dtb);

    }
}
