import java.time.Year;
import java.util.Scanner;

public class Ex0001 {

    public static void main(String[] args){
        var scanner = new Scanner(System.in);

        var yearAtual = Year.now().getValue();

        System.out.println("Qual seu nome?");
        var name = scanner.next();
        System.out.println("Em que ano nasceu?");
        var yearBday = scanner.nextInt();

        var age = yearAtual - yearBday;
        System.out.printf("Olá %s, você tem %s anos", name, age);
    }
}
