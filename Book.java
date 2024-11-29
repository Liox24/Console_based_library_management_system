import java.util.ArrayList;

public class Book {

    private String name;
    private String author;
    private String publisher;
    private String address;
    private String status;
    private int qty;
    private double price;
    private int brwcopies;

    public Book() {
    };

    public Book(String name, String author, String publiser, String address, int qty, double price, int brwcopies) {
        this.name = name;
        this.author = author;
        this.publisher = publiser;
        this.address = address;
        this.qty = qty;
        this.price = price;
        this.brwcopies = brwcopies;
    }

    public String toString() {
        String text = "Book Name : " + name + "Book author: " + author + "Book publisher : " + publisher
                + "Book Collection Address : " + address + "Qty :" + String.valueOf(qty) + "Price: "
                + String.valueOf(price) +
                "Borrowing Copies: " + String.valueOf(brwcopies);

        return text;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthorname(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getBrwcopies() {
        return brwcopies;
    }

    public void setBrwcopies(int brwcopies) {
        this.brwcopies = brwcopies;
    }

    public double getPrice(double price) {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getQty() {
        return qty;
    }

}
