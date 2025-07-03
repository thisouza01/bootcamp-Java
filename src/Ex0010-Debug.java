import java.util.Scanner;

public class OrderProcessor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double itemsValue = scanner.nextDouble();
        double shipping = scanner.nextDouble();
        boolean firstPurchase = scanner.nextBoolean();

        double discount = 0.0;

        if (firstPurchase) {
            discount = itemsValue * 0.05;
        }

        double discountedValue = itemsValue - discount;

        if (itemsValue >= 200.0) {
            shipping = 0;
        }

        double finalValue = discountedValue + shipping;

        System.out.printf("%.2f", finalValue);

        scanner.close();
    }
}
