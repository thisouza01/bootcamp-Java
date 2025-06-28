import java.util.Scanner;

public class Ex0005 {
    // entre com um numero e um segundo numero maior - programa informa quais sao os impares e pares entre os dois numeros
    // mostra numeros infomados e em ordem decrescente os numeros que foram gerados
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        var number2 = 0;

        System.out.println("Digite o primeiro número:");
        int number1 = scanner.nextInt();

        do {
            System.out.println("Digite o segundo número:");
            number2 = scanner.nextInt();
        } while (number2 < number1);

        for (var i = number2; i > number1 - 1; i--){
            System.out.println((i % 2 == 0) ? "Par: " + i : "Impar: " + i);;
        }
    }
}
