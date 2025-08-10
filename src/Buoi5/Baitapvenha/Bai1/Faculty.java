package Buoi5.Baitapvenha.Bai1;

import java.util.Scanner;

public class Faculty {
    private String tenKhoa;
    private String ngayVaoKhoa;
    private School x;

    public Faculty() {
    }

    public Faculty(String ngayVaoKhoa, School x, String tenKhoa) {
        this.ngayVaoKhoa = ngayVaoKhoa;
        this.x = x;
        this.tenKhoa = tenKhoa;
    }

    public String getNgayVaoKhoa() {
        return ngayVaoKhoa;
    }

    public void setNgayVaoKhoa(String ngayVaoKhoa) {
        this.ngayVaoKhoa = ngayVaoKhoa;
    }

    public String getTenKhoa() {
        return tenKhoa;
    }

    public void setTenKhoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
    }

    public School getX() {
        return x;
    }

    public void setX(School x) {
        this.x = x;
    }
    public void nhap(){
        Scanner sc= new Scanner(System.in);
        System.out.printf("Nhap ten khoa : ");
        tenKhoa=sc.nextLine();
        System.out.printf("Nhap ngay vao khoa :");
        ngayVaoKhoa=sc.nextLine();
        System.out.println("Nhap du lieu cua truong : ");
        x =new School();
        x.nhap();
    }
    public void xuat(){
        System.out.println("Ten khoa la : "+ tenKhoa );
        System.out.println("Ngay vao khoa la : " + ngayVaoKhoa );
        x.xuat();
    }
}
