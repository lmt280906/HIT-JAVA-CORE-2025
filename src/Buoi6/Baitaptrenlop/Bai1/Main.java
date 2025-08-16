package Buoi6.Baitaptrenlop.Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<SinhVien> ds= new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        LopHoc class1=new LopHoc("CR7","KTPM01");
        LopHoc class2=new LopHoc("GOAT","KTPM04");

        ds.add(new SinhVien(8.5,"Trinh Tran Phuong Tuan",class1,"1997123456" ));
        ds.add(new SinhVien(8,"Phuong Huu Duong",class1,"1995654321"));
        ds.add(new SinhVien(9,"Le The Anh",class2,"2024224466"));
        ds.add(new SinhVien(9,"Nguyen Van Son",class2,"2024113355"));
        ds.add(new SinhVien(10,"Le Minh Tuyen",class2,"2024609044"));

        System.out.println("Danh sach sinh vien :");
        int x=1;
        for(SinhVien a : ds){
            System.out.println("Thong tin ve sinh vien thu "+x+" : ");
            a.inThongTin();
            x++;
        }
        SinhVien maxTB = ds.get(0);
        for(SinhVien b:ds ){
            if(b.getDiemTB()>maxTB.getDiemTB()){
                maxTB=b;
            }
        }
        System.out.println("Sinh vien co diem trung binh cao nhat la :");
        maxTB.inThongTin();
    }
}
