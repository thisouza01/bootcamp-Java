import java.util.Scanner;

public class Ex0004 {

    public static void main(String[] args){
        double imc = 0.00;
        double weigth = 0.00;
        double heigth = 0.00;

        var scanner = new Scanner(System.in);

        System.out.println("Digite seu peso");
        weigth = scanner.nextDouble();
        System.out.println("Digite sua altura");
        heigth = scanner.nextDouble();

        // calc IMC
        imc = weigth / (heigth * heigth);


        if (imc <= 18.5){
            System.out.println("Abaixo do peso");
        } else if (imc > 18.5 && imc < 20){
            System.out.println("Peso ideal");
        } else System.out.println("Acima do peso");

        //informa um numero inicial
        //entra em um loop para receber outros numeros, so para quando um numero digitado, dividido pelo primeiro informado tiver resto diferente de 0.
        // numeros menores que o primeiro numero digitado devem ser ignorados
    }
}
