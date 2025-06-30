import java.util.Scanner;

public class Ex0007 {

    public static void main(String[] args){
        Scanner leDado = new Scanner(System.in);

        System.out.println("Digite sua idade");
        int age = leDado.nextInt();

        System.out.println("É autorizado a dirigir? (true/false)");

        boolean isAuthorized = leDado.nextBoolean();

        if(!isAuthorized) {
            System.out.println("Acesso negado");
        }

        if(isAuthorized && age < 18) {
            System.out.println("Idade insuficiente");
        }

        if(isAuthorized && age >= 18) {
            System.out.println("Acesso permitido");
        }

        leDado.close();
    }
}
