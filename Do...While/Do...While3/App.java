import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSorteado = random.nextInt(20) + 1; // Número entre 1 e 20
        int tentativas = 0;
        int palpite;

        System.out.println("Tente adivinhar o número entre 1 e 20.");

        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite > numeroSorteado) {
                System.out.println("O número é menor que " + palpite + ". Tente novamente!");
            } else if (palpite < numeroSorteado) {
                System.out.println("O número é maior que " + palpite + ". Tente novamente!");
            } else {
                System.out.println(
                        "Parabéns! Você acertou o número " + numeroSorteado + " em " + tentativas + " tentativas.");
            }
        } while (palpite != numeroSorteado);

        scanner.close();
    }
}
