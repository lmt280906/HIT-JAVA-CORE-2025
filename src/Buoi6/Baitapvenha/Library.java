package Buoi6.Baitapvenha;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> danhSach = new ArrayList<>();

    public Library() {
    }

    public Library(ArrayList<Book> danhSach) {
        this.danhSach = danhSach;
    }

    public ArrayList<Book> getDanhSach() {
        return danhSach;
    }

    public void setDanhSach(ArrayList<Book> danhSach) {
        this.danhSach = danhSach;
    }

    public void addBook(Book book) {
        danhSach.add(book);
    }

    public void displayAllBooks(boolean showPublisher) {
        for (Book a : danhSach) {
            a.displayInfo(showPublisher);
        }
    }

    public void searchByAuthor(String author) {
        boolean tim = false;
        for (Book a : danhSach) {
            if (a.getAuthor().toLowerCase().contains(author.toLowerCase())) {
                a.displayInfo();
                tim = true;
            }
        }
        if (!tim) {
            System.out.println("Không tìm thấy tác giả này");
        }
    }

    public void removeBookById(int bookId) {
        boolean xoa=false;
        for (int i = 0; i < danhSach.size(); i++) {
            if (danhSach.get(i).getBookId() == bookId) {
                danhSach.remove(i);
                System.out.println("Đã xóa thành công cuốn sách có mã  " + bookId);
                xoa=true;
            }
            if(!xoa) {
                System.out.println("Không tìm thấy cuốn sách có mã  " + bookId);
            }
        }
    }
}
