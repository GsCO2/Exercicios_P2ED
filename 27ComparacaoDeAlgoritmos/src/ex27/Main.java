package ex27;

import java.util.Arrays;
	/*
	27. Implemente uma classe ComparadorOrdenacao que compare o desempenho 
	dos algoritmos Quick Sort, Merge Sort e Bubble Sort para arrays de diferentes 
	tamanhos e características (ordenados, inversamente ordenados, aleatórios).
	*/

public class Main {
	
	public static void main(String[] args) {
        int[] tamanhos = {10, 100, 1000, 10000, 100000};
        
        CompararOrdenacao comparador = new CompararOrdenacao();
        // obs: tive que usar o QuickSort com pivô no meio, já que no final sempre dava stackOverflow
        for (int tam : tamanhos) {
            System.out.println("Tamanho do vetor -> " + tam);

            int[] ordenado = comparador.gerarOrdenado(tam);
            comparador.compararAlgoritmo(Arrays.copyOf(ordenado, ordenado.length), "Ordenado");

            int[] inverso = comparador.gerarInversamenteOrdenado(tam);
            comparador.compararAlgoritmo(Arrays.copyOf(inverso, inverso.length), "Inversamente Ordenado");

            int[] aleatorio = comparador.gerarAleatorio(tam);
            comparador.compararAlgoritmo(Arrays.copyOf(aleatorio, aleatorio.length), "Aleatório");
        }
    }
}

