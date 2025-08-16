package Buoi6.Baitaptrenlop.Bai1;

public class SinhVien {
    private String maSV;
    private String hoTen;
    private double diemTB;
    private LopHoc lop;

    public SinhVien(double diemTB, String hoTen, LopHoc lop, String maSV) {
        this.diemTB = diemTB;
        this.hoTen = hoTen;
        this.lop = lop;
        this.maSV = maSV;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public LopHoc getLop() {
        return lop;
    }

    public void setLop(LopHoc lop) {
        this.lop = lop;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }
    public void inThongTin(){
        System.out.println("Ma sinh vien la : "+ getMaSV());
        System.out.println("Ho ten sinh vien la : "+ getHoTen());
        System.out.println("Diem trung binh la : "+getDiemTB());
        lop.inThongTin();
        System.out.println("------------------------");
    }
    public void setDiemTB(int diem){
        this.diemTB=diemTB;
    }

}
