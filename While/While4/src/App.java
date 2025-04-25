public class App {
    public static void main(String[] args) throws Exception {
        int n = 10;
        int count = 0;
        int a = 0;
        int b = 1;

        System.out.println("Sequência de Fibonacci:");

        while (count < n) {
            System.out.println(a);
            int next = a + b;
            a = b;
            b = next;
            count++;

        }
    }
}
