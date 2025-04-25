import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int número;
        int Soma = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Próximo número: ");
            número = scanner.nextInt();

            if (número < 0) {
                break;
            }

            Soma = Soma + número;
        }
        System.out.println("O total acumulado é: " + Soma);
        scanner.close();

    }
}
