package ex27;

public class QuickSort {
	
	public int[] quickSort(int[] v, int ini, int fim) {
		if(ini < fim) {
			int part = particao(v, ini, fim);
			quickSort(v, ini, part - 1);
			quickSort(v, part, fim);
		}
		return v;
	}
	
	private int particao(int[] v, int ini, int fim) {
		int i = ini;
		int j = fim;
		int pivo = v[(ini+fim) / 2];
		
		while(i <= j) {
			while(i <= j && v[i] < pivo) {
				i++;
			}
			
			while(i <= j && v[j] > pivo) {
				j--;
			}
			
			if(i <= j) {
				swap(v, i, j);
				i++;
				j--;
			}
		}
		
		return i;
	}
	
	private void swap(int v[], int i, int j) {
		int aux = v[i];
		v[i] = v[j];
		v[j] = aux;
	}
}

