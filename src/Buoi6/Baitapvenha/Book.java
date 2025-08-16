package Buoi6.Baitapvenha;

public class Book {
    private static int cout = 1;
    private int bookId;
    private String title;
    private String author;
    private double price;
    private Publisher publisher;

    public Book(String author, double price, String title) {
        this(author, price, title, new Publisher("Unknown", "Unknown"));
    }

    public Book(String author, double price, String title, Publisher publisher) {
        this.bookId = cout++;
        this.author = author;
        this.price = price;
        this.title = title;
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void displayInfo() {
        System.out.println("BookId: " + bookId + "," + "Title: " + title + "," + "Author: " + author + "," + "Price: " + price);
    }

    public void displayInfo(boolean showPublisher) {
        displayInfo();
        if (showPublisher)
            System.out.println("Publisher: " + publisher.toString());
        else
            System.out.println("Publisher: Unknow ");
    }


}
