import java.util.Scanner;

public class Aritimeticos {

    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro numero:");
        var value1 = scanner.nextInt();
        System.out.println("Informe o segundo numero:");
        var value2 = scanner.nextInt();
        System.out.printf("%s / %s = %s\n", value1, value2, value1 % value2);
    }

    public static void multiply(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro numero:");
        var value1 = scanner.nextInt();
        System.out.println("Informe o segundo numero:");
        var value2 = scanner.nextInt();
        System.out.printf("%s * %s = %s\n", value1, value2, value1 * value2);
    }

    public static void division(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro numero:");
        var value1 = scanner.nextFloat();
        System.out.println("Informe o segundo numero:");
        var value2 = scanner.nextFloat();
        System.out.printf("%s / %s = %s\n", value1, value2, value1 / value2);
    }

    public static void subtract(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro numero:");
        var value1 = scanner.nextInt();
        System.out.println("Informe o segundo numero:");
        var value2 = scanner.nextInt();
        System.out.printf("%s - %s = %s\n", value1, value2, value1 - value2);
    }

    public static void sum(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro numero:");
        var value1 = scanner.nextInt();
        System.out.println("Informe o segundo numero:");
        var value2 = scanner.nextInt();
        System.out.printf("%s + %s = %s\n", value1, value2, value1 + value2);
    }
}
