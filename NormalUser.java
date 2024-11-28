public class NormalUser extends User {
    public NormalUser(String name) {
        super(name);
    }

    public NormalUser(String name, String email, String phoneNumber) {
        super(name, email, phoneNumber);
    }

    public void menu() {
        System.out.println("---------------------------------------------------");
        System.out.println("1. View Books");
        System.out.println("2. Search");
        System.out.println("3. place Order");
        System.out.println("4. Borrow Book");
        System.out.println("5. Calculate Fine");
        System.out.println("6. Return Book");
        System.out.println("7. Exit");
        System.out.println("---------------------------------------------------");
    }
}