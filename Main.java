import java.util.Scanner;

public class Main {
    static Scanner s;

    public static void main(String[] args) {
        System.out.println("Welcome to Library Management System!\n");
        s = new Scanner(System.in);
        int n;
        do {
            System.out.println("\n1. Login\n2. New User");
            System.out.println("Choose The Above option : ");
            n = s.nextInt();

            switch (n) {
                case 1:
                    login();
                    break;
                case 2:
                    newUser();
                    break;
            }

        } while (n != 0);
    }

    public static void login() {
        System.out.print("Enter the Phone number : ");
        String phoneNumber = s.next();
        System.out.print("Enter the Email : ");
        String email = s.next();
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

        if (n2 == 1) {
            System.out.println("You have chosen Admin.");
        } else {
            System.out.println("You have chosen Normal User.");
        }
    }
}
