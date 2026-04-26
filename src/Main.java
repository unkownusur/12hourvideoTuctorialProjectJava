import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Email to username and domain

        String email;
        String domain;
        String username;


        System.out.println("This is a program where when it gets an email it gives you a username and domain");

        System.out.println();

        System.out.print("What is your email?: ");
        email = scanner.nextLine();

        if (email.contains("@")) {
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);

            System.out.printf("username is: %s! domain is: %s", username, domain);

            scanner.close();
        } else {
            System.out.println("YOU NEED A VALID EMAIL!!!!!");
        }
    }
}