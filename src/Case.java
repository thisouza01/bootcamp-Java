import java.util.Scanner;

public class Case {

    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("infome um numero de 1 a 7");
        var option = scanner.nextInt();
/*
        switch (option){
            case 1:
                System.out.println("Segunda");
                break;
            case 2:
                System.out.println("Terça");
                break;
            case 3:
                System.out.println("Quarta");
                break;
            case 4:
                System.out.println("Quinta");
                break;
            case 5:
                System.out.println("Sexta");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Opção invalida!");
        }
*/
        switch (option){
            case 1 -> System.out.println("Segunda");
            case 2 -> System.out.println("Terça");
            case 3 -> System.out.println("Quarta");
            case 4 -> System.out.println("Quinta");
            case 5 -> System.out.println("Sexta");
            case 6 -> System.out.println("Sabado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Opção inválida!");
        }
    }
}
