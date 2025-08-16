package Buoi6.Baitaptrenlop.Bai2;

public class NhanVien {
   private String maNV;
   private String ten;
   private int tuoi;
   private String email;
   private String soDienThoai;

    public NhanVien() {
    }

    public NhanVien(String email, String maNV, String soDienThoai, String ten, int tuoi) {
        this.email = email;
        this.maNV = maNV;
        this.soDienThoai = soDienThoai;
        this.ten = ten;
        this.tuoi = tuoi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    public double tinhLuong(){
        return 0;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "email='" + email + '\'' +
                ", maNV='" + maNV + '\'' +
                ", ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", soDienThoai='" + soDienThoai + '\'' +
                '}';
    }
}
