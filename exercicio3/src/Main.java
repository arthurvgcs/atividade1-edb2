public class Main {

    public static boolean isOrdenado(int[] A) {
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] > A[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] testeArrays = {
                {1, 2, 3, 4, 5},
                {5, 4, 3, 2, 1},
                {1, 2, 3, 2, 1},
                {10, 20, 30},
                {}
        };

        boolean[] resultadosEsperados = {true, false, false, true, true};

        for (int i = 0; i < testeArrays.length; i++) {
            boolean resultado = isOrdenado(testeArrays[i]);
            System.out.println("Teste " + (i + 1) + ": Esperado "
                    + resultadosEsperados[i] + ", Obtido " + resultado);
        }
    }
}