package Buoi5.Baitapvenha.Bai2;

import java.util.Scanner;

public class QuanLy {
    private String MaQL;
    private String HoTen;

    public QuanLy() {
    }

    public QuanLy(String hoTen, String maQL) {
        this.HoTen = hoTen;
        this.MaQL = maQL;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        this.HoTen = hoTen;
    }

    public String getMaQL() {
        return MaQL;
    }

    public void setMaQL(String maQL) {
        this.MaQL = maQL;
    }
    public void Nhap(){
        Scanner sc= new Scanner(System.in);
        System.out.printf("Nhap ma quan ly : ");
        MaQL=sc.nextLine();
        System.out.printf("Nhap ho ten : ");
        HoTen=sc.nextLine();
    }
    public void Xuat(){
        System.out.println("Ma quan ly la : "+MaQL);
        System.out.println("Ho ten la : "+HoTen);
    }
}
