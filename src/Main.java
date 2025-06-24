import java.util.Scanner;

public class Main {

    private final static String WELCOME_MESSAGE = "Olá, informe o seu nome";

    public static void main(String[] args) {
        // importando o metodo Scanner para teste
        Scanner scanner = new Scanner(System.in);

        System.out.println(WELCOME_MESSAGE);
        String nome = scanner.next();

        System.out.println("Olá, informe sua idade");
        int idade = scanner.nextInt();

        System.out.println("Olá " + nome + " sua idade é " + idade);
    }
}