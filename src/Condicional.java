import java.util.Scanner;

public class Condicional {

    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("informe seu nome:");
        var name = scanner.next();
        System.out.println("informe sua idade:");
        var age = scanner.nextInt();
        System.out.println("É emancipado? (s/n):");
        var isEmancipated = scanner.next().equalsIgnoreCase("s");

        if ((age >= 18) || (age >= 16 && isEmancipated)){
            System.out.printf("%s, voce pode dirigir!\n", name);
        } else {
            System.out.printf("%s, voce nao pode dirigir!\n", name);
        }
        System.out.println("Fim da execução");
    }
}
