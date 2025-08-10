package Buoi5.Baitapvenha.Bai2;

import java.util.Scanner;

public class PhongMay {
    private String maPhong;
    private String tenPhong;
    private double dienTich;
    private QuanLy x;
    private May[] y;
    private int n;

    public PhongMay() {
    }

    public PhongMay(double dienTich, String maPhong, int n, String tenPhong, QuanLy x, May[] y) {
        this.dienTich = dienTich;
        this.maPhong = maPhong;
        this.n = n;
        this.tenPhong = tenPhong;
        this.x = x;
        this.y = y;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public QuanLy getX() {
        return x;
    }

    public void setX(QuanLy x) {
        this.x = x;
    }

    public May[] getY() {
        return y;
    }

    public void setY(May[] y) {
        this.y = y;
    }
    public void Nhap(){
        Scanner sc= new Scanner(System.in);
        System.out.printf("Nhap ma phong : ");
        maPhong = sc.nextLine();
        System.out.printf("Nhap ten phong : ");
        tenPhong=sc.nextLine();
        sc.nextLine();
        System.out.printf("Nhap dien tich phong : ");
        dienTich=sc.nextInt();
        System.out.println("Nhap thong tin quan ly : ");
        x=new QuanLy();
        x.Nhap();
        System.out.printf("Nhap so luong may : ");
        n=sc.nextInt();
        y=new May[n];
        for(int i=0;i<n;i++){
            System.out.println("Nhap thong tin may thu "+(i+1)+" : ");
            y[i]=new May();
            y[i].Nhap();
        }
    }
        public void Xuat(){
            System.out.println("Ma phong la : "+maPhong);
            System.out.println("Ten phong la : "+ tenPhong);
            System.out.println("Dien tich phong la : "+dienTich);
            System.out.println("Thong tin quan ly nhu sau :");
            x.Xuat();
            System.out.println("Danh sach may nhu sau :");
            for(int i=0;i<n;i++){
                System.out.println("May thu "+(i+1)+" : ");
                y[i].Xuat();
            }
        }
    }

