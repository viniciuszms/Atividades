import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int opção;

        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar");
            System.out.println("2. Remover");
            System.out.println("3. Sair");
            System.out.print("Digite o número da opção: ");

            opção = scanner.nextInt();

            switch (opção) {
                case 1:
                    System.out.println("Ação de adicionar executada.");
                    break;
                case 2:
                    System.out.println("Ação de remover executada.");
                    break;
                case 3:
                    System.out.println("Encerrado.");
                    break;
            }
        } while (opção != 3);

        scanner.close();

    }
}
