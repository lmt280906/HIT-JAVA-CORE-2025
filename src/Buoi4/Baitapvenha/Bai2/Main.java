package Buoi4.Baitapvenha.Bai2;

import Buoi4.Baitapvenha.Bai1.Student;
import Buoi4.Baitapvenha.Bai2.Add;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] ds = new Student[5];
        for (int i = 0; i < ds.length; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
            ds[i] = new Student();
            ds[i].nhap();
        }
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s%n",
                "Tên", "Tuổi", "Địa chỉ", "TX1", "TX2", "KTHP", "GPA", "Tiết nghỉ");

        for (Student hihi : ds) {
            hihi.xuat();
        }
    }
}
