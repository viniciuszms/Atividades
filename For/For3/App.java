import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];
        int soma = 0;

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            soma += array[i];
        }

        System.out.println("A soma de todos os elementos do vetor é: " + soma);

        scanner.close();
    }
}
