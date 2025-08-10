package Buoi5.Baitapvenha.Bai1;

import java.util.Scanner;

public class School {
    private String tenTruong;
    private String ngayVaoTruong;

    public School() {
    }

    public School(String ngayVaoTruong, String tenTruong) {
        this.ngayVaoTruong = ngayVaoTruong;
        this.tenTruong = tenTruong;
    }

    public String getTenTruong() {
        return tenTruong;
    }

    public void setTenTruong(String tenTruong) {
        this.tenTruong = tenTruong;
    }

    public String getNgayVaoTruong() {
        return ngayVaoTruong;
    }

    public void setNgayVaoTruong(String ngayVaoTruong) {
        this.ngayVaoTruong = ngayVaoTruong;
    }
    public void nhap(){
        Scanner sc=new Scanner (System.in);
        System.out.printf("Nhap ten truong :");
        tenTruong=sc.nextLine();
        System.out.printf("Nhap ngay vao truong :");
        ngayVaoTruong=sc.nextLine();
    }
    public void xuat(){
        System.out.println("Ten truong la : "+ tenTruong);
        System.out.println("Ngay vao truong la : "+ ngayVaoTruong);
    }
}
