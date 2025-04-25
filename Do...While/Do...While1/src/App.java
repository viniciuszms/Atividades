import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int número;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Digite um número entre 1 e 100: ");
            número = scanner.nextInt();
        } while (número < 1 || número > 100);

        System.out.println("Você inseriu um número válido: " + número);
        scanner.close();
    }
}