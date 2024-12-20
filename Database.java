import java.io.File;
import java.util.ArrayList;

public class Database {

    private ArrayList<User> users = new ArrayList<User>();
    private ArrayList<String> usernames = new ArrayList<String>();
    private ArrayList<Book> books = new ArrayList<Book>();
    private ArrayList<String> bookname = new ArrayList<String>();

    private File userFile = new File(Main.class.getClassLoader().getResource("Users").getFile());
    private File bookFile = new File(Main.class.getClassLoader().getResource("Books").getFile());

    public void AddUser(User s) {
        users.add(s);
        usernames.add(s.getName());
    }

    public int login(String phoneNumber, String email) {
        int n = -1;
        for (User s : users) {
            if ((s.getPhoneNumber().matches(phoneNumber)) && s.getEmail().matches(email)) {
                n = users.indexOf(s);
                break;
            }
        }
        return n;
    }

    public User getUser(int n) {
        return users.get(n);
    }

    public void AddBook(Book book) {
        books.add(book);
        bookname.add(book.getName());
    }

}
