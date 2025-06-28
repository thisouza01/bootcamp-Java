import java.util.Scanner;

public class While {

    public static void main(String[] args){
        var name = "";
        var scanner = new Scanner(System.in);
        do {
            System.out.println("Informe um nome:");
            name = scanner.next();
            System.out.println(name);

        } while (!name.equalsIgnoreCase("exit"));
    }

}
