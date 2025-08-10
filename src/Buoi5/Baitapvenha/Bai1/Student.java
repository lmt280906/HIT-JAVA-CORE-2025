package Buoi5.Baitapvenha.Bai1;

import java.util.Scanner;

public class Student {
    private String tenSv;
    private String lop;
    private double diemSo;
    private Faculty y;

    public Student() {
    }

    public Student(double diemSo, String lop, String tenSv, Faculty y) {
        this.diemSo = diemSo;
        this.lop = lop;
        this.tenSv = tenSv;
        this.y = y;
    }

    public double getDiemSo() {
        return diemSo;
    }

    public void setDiemSo(double diemSo) {
        this.diemSo = diemSo;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getTenSv() {
        return tenSv;
    }

    public void setTenSv(String tenSv) {
        this.tenSv = tenSv;
    }

    public Faculty getY() {
        return y;
    }

    public void setY(Faculty y) {
        this.y = y;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap ten sinh vien : " );
        tenSv=sc.nextLine();
        System.out.printf("Nhap ten lop : ");
        lop=sc.nextLine();

        System.out.printf("Nhap diem : ");
        diemSo=sc.nextDouble();
        y=new Faculty();
        System.out.println("Nhap du lieu cua khoa : ");
        y.nhap();
    }
    public void xuat(){
        System.out.println("Ten sinh vien la :"+ tenSv);
        System.out.println("Ten lop la : "+ lop);
        System.out.println("Diem so la : "+ diemSo);
        y.xuat();
    }
}
