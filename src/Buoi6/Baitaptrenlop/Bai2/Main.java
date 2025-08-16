package Buoi6.Baitaptrenlop.Bai2;

public class Main {
    public static void main(String[] args) {
        QuanLyNhanVien quanLyNhanVien = new QuanLyNhanVien();
        quanLyNhanVien.themNhanVien(new NhanVienFullTime("hihi@gmail.com","12345","0235325124","Van Duc",23,20000.0,5000.0));
        quanLyNhanVien.themNhanVien(new NhanVienFullTime("haha@gmail.com","56789","0346343933","Duy Bac",25,20000.0,4500.0));
        quanLyNhanVien.themNhanVien(new NhanVienPartTime("hehe@gmail.com","335577","024628686","Duc Nam",25,20000.0,45));
        quanLyNhanVien.themNhanVien(new NhanVienPartTime("jqk@gmail.com","224466","024635235","Duc Tay",19,20000.0,50));

        quanLyNhanVien.hienThiTatCa();
        System.out.println("Tong luong la :"+quanLyNhanVien.tinhTongLuong());

    }
}
