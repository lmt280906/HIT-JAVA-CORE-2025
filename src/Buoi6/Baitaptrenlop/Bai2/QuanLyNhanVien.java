package Buoi6.Baitaptrenlop.Bai2;

import java.util.ArrayList;

public class QuanLyNhanVien {
    private ArrayList<NhanVien> danhSachSinhVien;

    public QuanLyNhanVien() {
        danhSachSinhVien =new ArrayList<>();
    }

    public QuanLyNhanVien(ArrayList<NhanVien> danhSachSinhVien) {
        this.danhSachSinhVien = danhSachSinhVien;
    }

    public ArrayList<NhanVien> getDanhSachSinhVien() {
        return danhSachSinhVien;
    }

    public void setDanhSachSinhVien(ArrayList<NhanVien> danhSachSinhVien) {
        this.danhSachSinhVien = danhSachSinhVien;
    }
    public void themNhanVien(NhanVien nv){
        this.danhSachSinhVien.add(nv);
        System.out.println("Them thanh cong");
    }
    public void hienThiTatCa(){
        System.out.println("Danh sach sinh vien :");
        for(NhanVien a : danhSachSinhVien){
            System.out.println(a.toString());
        }
    }
    public double tinhTongLuong(){
        double tong=0;
        for(NhanVien a: danhSachSinhVien){
            tong+= a.tinhLuong();
        }
        return tong;
    }

}
