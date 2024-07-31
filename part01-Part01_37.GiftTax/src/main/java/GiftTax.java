
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int price = Integer.valueOf(scan.nextLine());

        double tax;

        if (price >= 5000 && price <= 25000) {
            tax = 100 + (price - 5000) * 0.08;
            System.out.println("Tax: " + tax);
        } else if (price > 25000 && price <= 55000) {
            tax = 1700 + (price - 25000) * 0.10;
            System.out.println("Tax: " + tax);
        } else if (price > 55000 && price <= 200000) {
            tax = 4700 + (price - 55000) * 0.12;
            System.out.println("Tax: " + tax);
        } else if (price > 200000 && price <= 1000000) {
            tax = 22100 + (price - 200000) * 0.15;
            System.out.println("Tax: " + tax);
        } else if (price > 1000000) {
            tax = 142100 + (price - 1000000) * 0.17;
            System.out.println("Tax: " + tax);
        } else {
            System.out.println("No tax!");

        }
    }
}
