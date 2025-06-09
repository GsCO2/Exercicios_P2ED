package ex22_23_24;
	/*
	22. Implemente o algoritmo Merge Sort para ordenar um array de inteiros em 
	ordem crescente. 
	23. Modifique o algoritmo Merge Sort para contar o número de inversões em um 
	array (uma inversão ocorre quando um elemento maior precede um elemento 
	menor). 
	24. Implemente uma versão iterativa (não recursiva) do algoritmo Merge Sort. 
	*/
public class Main {

	public static void main(String[] args) {
		MergeSort ms = new MergeSort();
		Inversoes inversoes = new Inversoes();
		MergeSortIterativo msi = new MergeSortIterativo();
		int[] v = {23, 49, 33, 76, 90, 13, 1, 14};
		int[] v1 = {23, 49, 33, 76, 90, 13, 1, 14};
		int[] v2 = {23, 49, 33, 76, 90, 13, 1, 14};
		
		// ex. 22
		ms.mergeSort(v, 0, v.length - 1);
		for(int aux : v) {
			System.out.print(aux + " ");
		}
		
		System.out.println();
		
		// ex. 23
		System.out.println(inversoes.contaInversoes(v1, 0, v.length - 1));
		
		// ex. 24
		msi.mergeSortIterativo(v2);
		for(int aux : v2) {
			System.out.print(aux + " ");
		}
	}

}
