import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int SenhaCorreta = 1234;
        int SenhaUsuário;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Digite a senha:");
            SenhaUsuário = scanner.nextInt();

            if (SenhaUsuário == SenhaCorreta) {
                System.out.println("Acesso concedido");
                break;

            } else {
                System.out.println("Senha incorreta, tente novamente");
            }

        }
        scanner.close();
    }
}
