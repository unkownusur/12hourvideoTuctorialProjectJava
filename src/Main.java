import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double cost;
        int amount;
        double years;
        double finalCost;

        System.out.print("what is the cost of the membership per year?: ");
        cost = scanner.nextDouble();

        System.out.print("How many memberships do you want?: ");
        amount = scanner.nextInt();

        System.out.print("how many years do you want the membership for?: ");
        years = scanner.nextDouble();

        finalCost = cost * years * amount;

        System.out.printf("The cost will be $%.2f", finalCost);

        scanner.close();
    }
}