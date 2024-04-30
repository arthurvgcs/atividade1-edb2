public class Main {

    public static int buscaBinaria(int[] A, int X) {
        int esquerda = 0;
        int direita = A.length - 1;

        while (esquerda <= direita) {
            int meio = esquerda + (direita - esquerda) / 2;
            if (A[meio] == X) {
                return meio;
            }
            if (A[meio] < X) {
                esquerda = meio + 1;
            }
            else {
                direita = meio - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[][] testeArrays = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {10, 20, 30, 40, 50},
                {15},
                {100, 200, 300, 400, 500},
                {3, 8, 11, 14, 18, 22, 27, 33, 39, 45, 52}
        };
        int[] elementosBusca = {6, 35, 15, 200, 52};
        int[] resultadosEsperados = {5, -1, 0, 1, 10};

        for (int i = 0; i < testeArrays.length; i++) {
            int resultado = buscaBinaria(testeArrays[i], elementosBusca[i]);
            System.out.println("Teste " + (i + 1) + ": Esperado " + resultadosEsperados[i]
                    + ", Obtido " + resultado);
        }
    }
}