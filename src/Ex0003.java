import java.util.Scanner;

public class Ex0003 {
    // recebe nome e idade de duas pessoas imprime a diferença das idades
    public static void main(String[] args){
        var scanner = new Scanner(System.in);

        System.out.println("Digite seu nome");
        var name1 = scanner.next();
        System.out.println("Digite sua idade");
        var age1 = scanner.nextInt();
        System.out.println("Digite seu nome");
        var name2 = scanner.next();
        System.out.println("Digite sua idade");
        var age2 = scanner.nextInt();

        var difAges = Math.abs(age1 - age2);

        System.out.printf("A diferença da idade de %s e %s é %s", name1, name2, difAges);

    }
}