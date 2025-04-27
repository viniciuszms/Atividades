import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            int numero = 0;

            while (true) {
                System.out.print("Digite um número inteiro positivo para calcular o fatorial: ");
                if (scanner.hasNextInt()) {
                    numero = scanner.nextInt();
                    if (numero > 0) {
                        break;
                    } else {
                        System.out.println("Por favor, insira um número maior que zero.");
                    }
                } else {
                    System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                    scanner.next();
                }
            }

            long fatorial = 1;
            System.out.print("O valor do fatorial é: ");
            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
                System.out.print(i);
                if (i < numero) {
                    System.out.print(" x ");
                }
            }
            System.out.println(" = " + fatorial);

            scanner.close();
        }
    }
}