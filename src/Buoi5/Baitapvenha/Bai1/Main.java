package Buoi5.Baitapvenha.Bai1;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> ds = new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.printf("Nhap so luong sinh vien : ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Nhap thong tin sinh vien thu"+" "+(i+1)+" : ");
            Student sv=new Student();
            sv.nhap();
            ds.add(sv);
        }
        System.out.println("Danh sach sinh vien nhu sau : ");
        for(Student a : ds){
            a.xuat();
        }
    }

}
