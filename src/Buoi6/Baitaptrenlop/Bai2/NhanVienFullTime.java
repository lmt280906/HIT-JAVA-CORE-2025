package Buoi6.Baitaptrenlop.Bai2;

public class NhanVienFullTime extends NhanVien{
    private double luongCoBan;
    private double tienThuong;

    public NhanVienFullTime(double luongCoBan, double tienThuong) {
        this.luongCoBan = luongCoBan;
        this.tienThuong = tienThuong;
    }

    public NhanVienFullTime(String email, String maNV, String soDienThoai, String ten, int tuoi, double luongCoBan, double tienThuong) {
        super(email, maNV, soDienThoai, ten, tuoi);
        this.luongCoBan = luongCoBan;
        this.tienThuong = tienThuong;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getTienThuong() {
        return tienThuong;
    }

    public void setTienThuong(double tienThuong) {
        this.tienThuong = tienThuong;
    }
    @Override
    public double tinhLuong(){
        return luongCoBan + tienThuong;
    }

    @Override
    public String toString() {
        return super.toString()+"Loai :  Full Time{" +
                "luongCoBan=" + luongCoBan +
                ", tienThuong=" + tienThuong +
                '}';
    }
}
