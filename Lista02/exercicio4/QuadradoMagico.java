public class QuadradoMagico {

    public static boolean ehQuadradoMagico(int[][] matriz) {
        int n = matriz.length;

        // 1. Verifica se a matriz é quadrada
        for (int i = 0; i < n; i++) {
            if (matriz[i].length != n) {
                return false;
            }
        }

        // 2. Verifica se existem elementos repetidos
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    for (int l = 0; l < n; l++) {
                        if (i != k || j != l) {
                            if (matriz[i][j] == matriz[k][l]) {
                                return false;
                            }
                        }
                    }
                }
            }
        }

        // 3. Calcula a soma da primeira linha como referência
        int somaReferencia = 0;
        for (int j = 0; j < n; j++) {
            somaReferencia = somaReferencia + matriz[0][j];
        }

        // 4. Verifica a soma de cada linha
        for (int i = 0; i < n; i++) {
            int somaLinha = 0;
            for (int j = 0; j < n; j++) {
                somaLinha = somaLinha + matriz[i][j];
            }
            if (somaLinha != somaReferencia) {
                return false;
            }
        }

        // 5. Verifica a soma de cada coluna
        for (int j = 0; j < n; j++) {
            int somaColuna = 0;
            for (int i = 0; i < n; i++) {
                somaColuna = somaColuna + matriz[i][j];
            }
            if (somaColuna != somaReferencia) {
                return false;
            }
        }

        // 6. Verifica a soma da diagonal principal
        int somaDiagonalPrincipal = 0;
        for (int i = 0; i < n; i++) {
            somaDiagonalPrincipal = somaDiagonalPrincipal + matriz[i][i];
        }
        if (somaDiagonalPrincipal != somaReferencia) {
            return false;
        }

        // 7. Verifica a soma da diagonal secundária
        int somaDiagonalSecundaria = 0;
        for (int i = 0; i < n; i++) {
            somaDiagonalSecundaria = somaDiagonalSecundaria + matriz[i][n - 1 - i];
        }
        if (somaDiagonalSecundaria != somaReferencia) {
            return false;
        }

        return true;
    }
}
