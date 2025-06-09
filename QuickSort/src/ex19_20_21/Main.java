package ex19_20_21;
	/*
	 19. Implemente o algoritmo Quick Sort para ordenar um array de inteiros em 
	ordem crescente. 
	20. Modifique o algoritmo Quick Sort para ordenar um array de inteiros em ordem 
	decrescente. 
	21. Implemente uma versão do Quick Sort que utilize o elemento do meio como 
	pivô, em vez do último elemento. 
	 */
public class Main {
	
	public static void main(String[] args) {
		QuickSort qs = new QuickSort();
		QuickSortDecrescente qsd = new QuickSortDecrescente();
		QuickSortMid qsm = new QuickSortMid();
		int[] v = {5,7,1,2,4,6,3,0};
		
		// ex. 19
		qs.quickSort(v, 0, v.length-1);
		for(int aux : v) {
			System.out.print(aux + " ");
		}
		
		System.out.println();
		
		// ex. 20
		qsd.quickSortDecrescente(v, 0, v.length - 1);
		for(int aux : v) {
			System.out.print(aux + " ");
		}
		
		System.out.println();
		
		// ex. 21
		qsm.quickSortMid(v, 0, v.length - 1);
		for(int aux : v) {
			System.out.print(aux + " ");
		}
		
		System.out.println();
		
		
	}
}
