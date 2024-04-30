public class Main {

    public static int buscaRecursiva(int[] A, int X, int index) {
        if (index >= A.length) {
            return -1;
        } else if (A[index] == X) {
            return index;
        } else {
            return buscaRecursiva(A, X, index + 1);
        }
    }


    public static void main(String[] args) {
        int[][] testeArrays = {
                {},
                {1, 2, 3, 4, 5, 6, 7, 8},
                {22, 44, 66, 88, 99, 11, 33},
                {7, 7, 7, 7, 7},
                {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 40}
        };
        int[] elementosBusca = {5, 10, 88, 7, 40};
        int[] resultadosEsperados = {-1, -1, 3, 0, 20};

        for (int i = 0; i < testeArrays.length; i++) {
            int resultado = buscaRecursiva(testeArrays[i], elementosBusca[i], 0);
            System.out.println("Teste " + (i + 1) + ": Esperado " + resultadosEsperados[i] +
                    ", Obtido " + resultado);
        }
    }
}