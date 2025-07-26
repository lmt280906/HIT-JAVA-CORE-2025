package Buoi3;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        String chuoi = nhap();
        ketQua(chuoi);
    }

    public static String nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        return sc.nextLine();
    }

    public static boolean doiXung(String s) {
        int trai = 0, phai = s.length() - 1;
        while (trai < phai) {
            if (s.charAt(trai) != s.charAt(phai)) return false;
            trai++;
            phai--;
        }
        return true;
    }

    public static void ketQua(String s) {
        if (doiXung(s)) {
            System.out.println(s.toUpperCase() + " là chuỗi đối xứng.");
        } else {
            System.out.println(s.toLowerCase() + " không phải là chuỗi đối xứng.");
        }
    }
}

