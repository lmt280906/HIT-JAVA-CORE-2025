package Buoi5.Baitaptrenlop;

public class Pet {
    private String ten;
    private double canNang;
    private String loai;

    public Pet(String ten , double canNang , String loai){
        this.ten=ten;
        this.canNang=canNang;
        this.loai=loai;
    }
    public void printInfo(){
        System.out.println("Ten loai : " + ten + " , " + "Loai:" + loai +" , " + "Can nang :" + canNang);
    }
    public boolean isOverweight(){
        if(canNang>10) return true;
        return false;
    }
    public String getBasicInfo(){
        return ten+" "+loai;
    }

}
