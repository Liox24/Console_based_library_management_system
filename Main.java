import java.util.Scanner;

public class Main {
    static Scanner s;

    static Database database;

    public static void main(String[] args) {

        database = new Database();
        System.out.println("Welcome to Library Management System!\n");
        s = new Scanner(System.in);
        int n;
        do {
            System.out.println("---------------------------------------------------");
            System.out.println("\n0. Exit\n1. Login\n2. New User");
            System.out.print("Choose The Above option : ");
            n = s.nextInt();
            System.out.println("\n---------------------------------------------------");

            switch (n) {
                case 1:
                    login();
                    break;
                case 2:
                    newUser();
                    break;
                default:
                    System.out.println("Bye...");
            }

        } while (n != 0);
    }

    public static void login() {
        System.out.println("------------- Login -------------------------------");
        System.out.print("Enter the Phone number : ");
        String phoneNumber = s.next();
        System.out.print("Enter the Email : ");
        String email = s.next();
        int n = database.login(phoneNumber, email);
        if (n != -1) {
            User user = database.getUser(n);
            user.menu();
        } else {
            System.out.println("User does not exist...!");
        }
        System.out.println("---------------------------------------------------");
    }

    public static void newUser() {
        s.nextLine(); // Consume the leftover newline character
        System.out.print("Enter Name : ");
        String name = s.nextLine();
        System.out.print("Enter the Phone number : ");
        String phoneNumber = s.next();
        System.out.print("Enter the Email : ");
        String email = s.next();
        System.out.println("1. Admin\n2. Normal User");
        int n2 = s.nextInt();

        User user;
        if (n2 == 1) {
            user = new Admin(name, email, phoneNumber);
        } else {
            user = new NormalUser(name, email, phoneNumber);
        }
        database.AddUser(user);
    }
}
