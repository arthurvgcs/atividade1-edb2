public class Main {

    public static int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        int fibMenosDois = 0;
        int fibMenosUm = 1;
        int fibN = 0;

        for (int i = 2; i <= n; i++) {
            fibN = fibMenosUm + fibMenosDois;
            fibMenosDois = fibMenosUm;
            fibMenosUm = fibN;
        }

        return fibN;
    }

    public static void main(String[] args) {
        int[] testes = {0, 5, 10, 20, 30};
        int[] resultadosEsperados = {0, 5, 55, 6765, 832040};

        // Execute each test case
        for (int i = 0; i < testes.length; i++) {
            int resultado = fibonacci(testes[i]);
            System.out.println("Teste " + (i + 1) + ": Fibonacci de " + testes[i] +
                    " -> Resultado Obtido: " + resultado +
                    ", Resultado Esperado: " + resultadosEsperados[i] );
        }
    }
}