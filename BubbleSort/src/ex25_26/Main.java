package ex25_26;
	/*
	25. Implemente o algoritmo Bubble Sort para ordenar um array de inteiros em 
	ordem crescente. 
	26. Otimize o algoritmo Bubble Sort para parar a execução quando o array já estiver 
	ordenado. 
	 */
public class Main {

	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();
		int[] v = {51, 76, 41, 13, 11, 9, 55};
		int[] v2 = {51, 76, 41, 13, 11, 9, 55};
		
		// ex. 25
		bs.bubbleSort(v);
		for(int aux : v) {
			System.out.print(aux + " ");
		}
		
		System.out.println();
		
		// ex. 26
		bs.bubbleSortOtimizado(v2);
		for(int aux : v) {
			System.out.print(aux + " ");
		}
	}

}
