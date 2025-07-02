import java.util.Scanner;

public class Controle {
    private static Scanner scanner = new Scanner(System.in);

    public static String leString(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }

    public static int leInteiro(String mensagem) {
        System.out.print(mensagem);
        return Integer.parseInt(scanner.nextLine());
    }
}
