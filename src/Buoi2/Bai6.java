package Buoi2;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.printf("Nhap so luong sinh vien cua lop : ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("Sinh vien thu "+i +": ");
            System.out.printf("Ten: ");
            sc.nextLine();
            String ten=sc.nextLine();
            System.out.printf("Tuoi:");
            int tuoi=sc.nextInt();
            System.out.printf("GPA : ");
            double gpa=sc.nextDouble();
        }
        System.out.println("Danh sach sinh vien cua lop la : ");

    }
}
