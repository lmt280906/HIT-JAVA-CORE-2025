package Buoi6.Baitaptrenlop.Bai2;

public class NhanVienPartTime extends NhanVien{
    private int soGioLam;
    private double luongTheoGio;

    public NhanVienPartTime(){
    }
    public NhanVienPartTime(double luongTheoGio, int soGioLam) {
        this.luongTheoGio = luongTheoGio;
        this.soGioLam = soGioLam;
    }

    public NhanVienPartTime(String email, String maNV, String soDienThoai, String ten, int tuoi, double luongTheoGio, int soGioLam) {
        super(email, maNV, soDienThoai, ten, tuoi);
        this.luongTheoGio = luongTheoGio;
        this.soGioLam = soGioLam;
    }

    public double getLuongTheoGio() {
        return luongTheoGio;
    }

    public void setLuongTheoGio(double luongTheoGio) {
        this.luongTheoGio = luongTheoGio;
    }

    public int getSoGioLam() {
        return soGioLam;
    }

    public void setSoGioLam(int soGioLam) {
        this.soGioLam = soGioLam;
    }
    @Override
    public double tinhLuong()  {
        return soGioLam * luongTheoGio;
    }

    @Override
    public String toString() {
        return super.toString()+"Loai : Part Time{" +
                "luongTheoGio=" + luongTheoGio +
                ", soGioLam=" + soGioLam +
                '}';
    }
}
