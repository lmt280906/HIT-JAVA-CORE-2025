package Buoi3;

import java.util.Scanner;

public class Bai1 {
    public static final String SQUARE = "Square";
    public static final String TRIANGLE = "Triangle";
    public static final String CIRCLE = "Circle";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String type = nhapLoaiHinh(sc);

        double area = tinhDienTich(type, sc);

        if (area >= 0) {
            System.out.printf("Diện tích: %.2f\n", area);
        }
    }

    public static String nhapLoaiHinh(Scanner sc) {
        System.out.print("Nhập loại hình (Square, Triangle, Circle): ");
        return sc.nextLine();
    }

    public static double tinhDienTich(String type, Scanner sc) {
        switch (type) {
            case SQUARE:
                return tinhDienTichHinhVuong(sc);
            case TRIANGLE:
                return tinhDienTichTamGiac(sc);
            case CIRCLE:
                return tinhDienTichHinhTron(sc);
            default:
                System.out.println("Hình dạng không hợp lệ!");
                return -1;
        }
    }

    public static double tinhDienTichHinhVuong(Scanner sc) {
        System.out.print("Nhập cạnh hình vuông: ");
        double a = sc.nextDouble();
        return a * a;
    }

    public static double tinhDienTichTamGiac(Scanner sc) {
        System.out.print("Nhập chiều cao: ");
        double h = sc.nextDouble();
        System.out.print("Nhập đáy: ");
        double b = sc.nextDouble();
        return 0.5 * b * h;
    }

    public static double tinhDienTichHinhTron(Scanner sc) {
        System.out.print("Nhập bán kính: ");
        double r = sc.nextDouble();
        return Math.PI * r * r;
    }
}



