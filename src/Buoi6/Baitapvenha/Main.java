package Buoi6.Baitapvenha;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        int choice;
        do {
            System.out.println("--------------------------------");
            System.out.println("MENU:");
            System.out.println("1.Nhập từ bàn phím để thêm sách vào thư viện (3-4 quyển)");
            System.out.println("2.Hiển thị danh sách sách (cho phép chọn hiển thị hoặc không hiển thị nhà xuất bản)");
            System.out.println("3.Tìm sách theo tác giả");
            System.out.println("4.Xóa sách theo mã sách và hiển thị kết quả");
            System.out.println("5.Thoát chương trình");
            System.out.printf("Lựa chọn của bạn là : ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.printf("Nhập số sách bạn muốn thêm vào : ");
                    int soSach = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < soSach; i++) {
                        System.out.println("Sach so " + (i + 1) + " : ");
                        System.out.printf("Title : ");
                        String title = sc.nextLine();
                        System.out.printf("Author : ");
                        String author = sc.nextLine();
                        System.out.printf("Price : ");
                        double price = sc.nextDouble();
                        sc.nextLine();
                        String hihi;
                        do {
                            System.out.println("Bạn có muốn thêm cả thông tin về nhà xuất bản không(Yes/No)");
                             hihi = sc.nextLine();
                            if (hihi.equalsIgnoreCase("Yes")) {
                                System.out.printf("Publisher name :");
                                String name = sc.nextLine();
                                System.out.printf("Addres : ");
                                String addres = sc.nextLine();
                                library.addBook(new Book(author, price, title, new Publisher(addres, name)));
                            } else if (hihi.equalsIgnoreCase("No")) {
                                library.addBook(new Book(author, price, title));
                            } else
                                System.out.println("Vui lòng nhập lại lựa chọn của bạn");
                        } while (!hihi.equalsIgnoreCase("Yes") && !hihi.equalsIgnoreCase("No"));

                    }
                    break;
                case 2:
                    System.out.println("Bạn muốn hiển thị nhà nhà xuất bản ?(true/false)");
                    boolean hienThi = sc.nextBoolean();
                    sc.nextLine();
                    library.displayAllBooks(hienThi);
                    break;
                case 3:
                    System.out.printf("Nhập tên tác giả của cuốn sách bạn muốn tìm : ");
                    String ten = sc.nextLine();
                    library.searchByAuthor(ten);
                    break;
                case 4:
                    System.out.printf("Nhập Id của cuốn sách bạn muốn xóa");
                    int id = sc.nextInt();
                    library.removeBookById(id);
                    break;
                case 5:
                    System.out.println("Đã thoát chương trình");
                    break;
                default:
                    System.out.println("Không có lựa chọn như bạn mong muốn");
                    break;
            }
        } while (choice != 5);
        sc.close();
    }
}
