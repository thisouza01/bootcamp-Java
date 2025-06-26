import java.util.Scanner;

public class Ex0002 {

    public static void main(String[] args){
        // 1 - recebo o tamanho do lado de um quadradro, calcule e exiba
        // recebe nome e idade de duas pessoas imprime a diferença das idades

        var scanner = new Scanner(System.in);

        System.out.println("Qual o tamanho do lado do quadrado?");
        var sideSquare = scanner.nextFloat();

        var area = sideSquare * sideSquare;

        System.out.printf("A area do quadrado é de %s metros quadrado", area);
    }
}
