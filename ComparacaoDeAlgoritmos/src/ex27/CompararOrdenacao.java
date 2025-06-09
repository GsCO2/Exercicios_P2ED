package ex27;

import java.util.Random;

public class CompararOrdenacao {
	QuickSort qs = new QuickSort();
	MergeSort ms = new MergeSort();
	BubbleSort bs = new BubbleSort();
	
	public int[] gerarOrdenado(int tamanho) {
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = i;
        }
        return vetor;
    }

    public int[] gerarInversamenteOrdenado(int tamanho) {
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = tamanho - i;
        }
        return vetor;
    }

    public int[] gerarAleatorio(int tamanho) {
        int[] vetor = new int[tamanho];
        Random random = new Random();
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = random.nextInt(tamanho * 10);
        }
        return vetor;
    }
    
    public void compararAlgoritmo(int[] v, String tipoVetor) {
    	System.out.println("\nTipo de vetor: " + tipoVetor);
    	
        int[] vQuick = v.clone();
        long inicioQuick = System.nanoTime();
        qs.quickSort(vQuick, 0, vQuick.length - 1);
        long fimQuick = System.nanoTime();
        System.out.println("Quick Sort -> " + (fimQuick - inicioQuick) / 1_000_000.0 + " ms");

        int[] vMerge = v.clone();
        long inicioMerge = System.nanoTime();
        ms.mergeSort(vMerge, 0, vMerge.length - 1);
        long fimMerge = System.nanoTime();
        System.out.println("Merge Sort -> " + (fimMerge - inicioMerge) / 1_000_000.0 + " ms");

        int[] vBubble = v.clone();
        long inicioBubble = System.nanoTime();
        bs.bubbleSort(vBubble);
        long fimBubble = System.nanoTime();
        System.out.println("Bubble Sort -> " + (fimBubble - inicioBubble) / 1_000_000.0 + " ms");
        
        System.out.println();
    }
}

