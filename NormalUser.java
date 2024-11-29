import java.util.Scanner;

public class NormalUser extends User {
    public NormalUser(String name) {
        super(name);
        this.operation = new IOOperation[] {
                new ViewBooks(),
                new Search(),
                new PlaceOrder(),
                new BorrowBook(),
                new CalculateFine(),
                new ReturnBook(),
                new Exit()
        };
    }

    public NormalUser(String name, String email, String phoneNumber) {
        super(name, email, phoneNumber);
        this.operation = new IOOperation[] {
                new ViewBooks(),
                new Search(),
                new BorrowBook(),
                new CalculateFine(),
                new ReturnBook(),
                new Exit()
        };
    }

    public void menu(Database database, User user) {
        System.out.println("---------------------------------------------------");
        System.out.println("1. View Books");
        System.out.println("2. Search");
        System.out.println("3. place Order");
        System.out.println("4. Borrow Book");
        System.out.println("5. Calculate Fine");
        System.out.println("6. Return Book");
        System.out.println("7. Exit");
        System.out.println("---------------------------------------------------");

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        this.operation[n - 1].oper(database, user);
        s.close();
    }
}
