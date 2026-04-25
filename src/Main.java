import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String item;
        double price;
        double amount;
        char currencey;
        double total;
        double pay = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();

        System.out.print("What is the price for each?: ");
        price = scanner.nextDouble();

        System.out.print("How many would you like?: ");
        amount = scanner.nextDouble();

        System.out.print("What is your currencey?: ");
        currencey = scanner.next().charAt(0);

        total = Math.ceil((price * amount)*100);
        total /= 100;

        System.out.println("You have bought " + amount + " " + item + "/s");
        System.out.println("Your total is " + currencey + total);
        
        purchase(total, pay);

        scanner.close();

    }

    static void purchase(double total, double pay) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("How much money do you want to pay?: ");
        pay = scanner.nextDouble();

        if (pay > total) {
            System.out.println("here is your change: " + (pay - total));
            System.out.println("thank you for shopping!");
        } else if (pay == total) {
            System.out.println("thank you for shopping!");
        } else {
            System.out.println("you need to pay more! here is how much more you need: " + (total - pay));
            total -= pay;
            purchase(total, pay);
        }
    }
}