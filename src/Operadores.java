import java.util.Scanner;

public class Operadores {

    public static void main(String[] args){
        // scanner utilizado para receber valor
        var scanner = new Scanner(System.in);

        System.out.println("Quanto anos você tem?");
        var age = scanner.nextInt();
        System.out.println("Você é emancipado?");
        var isEmancipated = scanner.nextBoolean();
        var canDrive = age > 17 || (isEmancipated && age >= 16);
        System.out.printf("Você pode dirigir? (%s)", canDrive);
    }

    public static void step2(String[] args){
        // scanner utilizado para receber valor
        var scanner = new Scanner(System.in);

        System.out.println("Quanto anos você tem?");
        var age = scanner.nextInt();
        var canDrive = age > 17;
        System.out.printf("Você pode dirigir? \n (%s)", canDrive);
    }

    public static void step1(String[] args){
        // scanner utilizado para receber valor
        var scanner = new Scanner(System.in);

        System.out.println("Quanto é dois + dois?");
        var result = scanner.nextInt();
        var isRight = result == 4;
        System.out.printf("O resultado é: 4, você errou? (%s)", !isRight);
    }


}
