package ex22_23_24;

public class MergeSortIterativo {
	public void mergeSortIterativo(int[] array) {
       
		int n = array.length;
        for (int tamanho = 1; tamanho < n; tamanho *= 2) {
            for (int inicioEsquerdo = 0; inicioEsquerdo < n - 1; inicioEsquerdo += 2 * tamanho) {
                int meio = Math.min(inicioEsquerdo + tamanho - 1, n - 1);
                int fimDireito = Math.min(inicioEsquerdo + 2 * tamanho - 1, n - 1);

                merge(array, inicioEsquerdo, meio, fimDireito);
            }
        }
    }

    private void merge(int[] array, int inicio, int meio, int fim) {
        int tamanhoEsquerdo = meio - inicio + 1;
        int tamanhoDireito = fim - meio;

        int[] esquerdo = new int[tamanhoEsquerdo];
        int[] direito = new int[tamanhoDireito];

        for (int i = 0; i < tamanhoEsquerdo; i++) {
            esquerdo[i] = array[inicio + i];
        }
        for (int j = 0; j < tamanhoDireito; j++) {
            direito[j] = array[meio + 1 + j];
        }

        int i = 0, j = 0, k = inicio;
        while (i < tamanhoEsquerdo && j < tamanhoDireito) {
            if (esquerdo[i] <= direito[j]) {
                array[k++] = esquerdo[i++];
            } else {
                array[k++] = direito[j++];
            }
        }
        
        while (i < tamanhoEsquerdo) {
            array[k++] = esquerdo[i++];
            
        }

        while (j < tamanhoDireito) {
            array[k++] = direito[j++];
        }
    }
}
