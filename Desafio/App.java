import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        // Loop principal que permite múltiplas iterações
        while (continuar) {
            System.out.println("=== Calculadora de Rendimento de Investimentos ===");

            // Solicitar valor do investimento inicial
            System.out.print("Digite o valor do investimento inicial (P): ");
            double P = scanner.nextDouble();

            // Solicitar taxa de juros anual
            System.out.print("Digite a taxa de juros anual (r) em decimal (exemplo: 0.05 para 5%): ");
            double r = scanner.nextDouble();

            // Solicitar período de investimento em anos
            System.out.print("Digite o período de investimento em anos (t): ");
            int t = scanner.nextInt();

            // Solicitar tipo de capitalização
            System.out.print("Deseja capitalização simples ou composta? (Digite 'simples' ou 'composta'): ");
            String tipoCapitalizacao = scanner.next().toLowerCase();

            double montante;

            // Verificar o tipo de capitalização e calcular o montante
            if (tipoCapitalizacao.equals("simples")) {
                montante = calcularCapitalizacaoSimples(P, r, t);
            } else if (tipoCapitalizacao.equals("composta")) {
                montante = calcularCapitalizacaoComposta(P, r, t);
            } else {
                System.out.println("Opção inválida. Por favor, escolha 'simples' ou 'composta'.");
                continue; // Pula para a próxima iteração
            }

            // Exibir o resultado de forma organizada
            System.out.printf("O montante ao final de %d anos é: R$ %.2f%n", t, montante);

            // Perguntar se deseja realizar um novo cálculo
            System.out.print("Deseja realizar um novo cálculo? (s/n): ");
            String resposta = scanner.next().toLowerCase();

            if (!resposta.equals("s")) {
                continuar = false; // Encerra o loop se a resposta não for 's'
                System.out.println("Encerrando a calculadora. Até logo!");
            }
        }

        scanner.close();
    }

    /**
     * Calcula o montante usando capitalização simples.
     * Fórmula: M = P * (1 + r * t)
     */
    public static double calcularCapitalizacaoSimples(double P, double r, int t) {
        return P * (1 + r * t);
    }

    /**
     * Calcula o montante usando capitalização composta.
     * Fórmula: M = P * (1 + r)^t
     */
    public static double calcularCapitalizacaoComposta(double P, double r, int t) {
        return P * Math.pow(1 + r, t);
    }
}