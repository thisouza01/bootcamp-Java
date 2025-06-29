import java.util.Scanner;

public class Ex0006 {
    //informa um numero inicial
    //entra em um loop para receber outros numeros, so para quando um numero digitado, dividido pelo primeiro informado
    // tiver resto diferente de 0.
    // numeros menores que o primeiro numero digitado devem ser ignorados
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Digite um numero");
        int number1 = scanner.nextInt();
        int number2 = 0;
        int resultDiv= 0;
        do {
            System.out.println("Digite outro numero");

            if (number2 < number1) {
                number2 = scanner.nextInt();
            } else {
                resultDiv = number2 % number1;
                number2 = 0;
            }
        } while (resultDiv == 0);
    }
}
