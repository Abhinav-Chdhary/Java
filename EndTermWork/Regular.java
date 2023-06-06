package EndTermWork;

import java.util.Scanner;

public class Regular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a username: ");
        String username = scanner.nextLine();

        if (username.matches("[a-zA-Z0-9_]+")) {
            System.out.println("Valid username!");
        } else {
            System.out.println("Invalid username!");
        }

        System.out.println("Enter an email address: ");
        String email = scanner.nextLine();

        if (email.matches("[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+")) {
            System.out.println("Valid email address!");
        } else {
            System.out.println("Invalid email address!");
        }

        scanner.close();
    }
}

