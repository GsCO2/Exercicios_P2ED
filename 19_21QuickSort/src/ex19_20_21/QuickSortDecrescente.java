package ex19_20_21;

public class QuickSortDecrescente {
	
	public int[] quickSortDecrescente(int[] v, int ini, int fim) {
		if(ini < fim) {
			int part = particao(v, ini, fim);
			quickSortDecrescente(v, ini, part - 1);
			quickSortDecrescente(v, part + 1, fim);
		}
		return v;
	}
	
	private int particao(int[] v, int ini, int fim) {
		int i = ini;
		int j = fim - 1;
		int pivo = v[fim];
		
		while(i <= j) {
			while(i <= j && v[i] > pivo) {
				i++;
			}
			
			while(i <= j && v[j] <= pivo) {
				j--;
			}
			
			if(i < j) {
				swap(v, i, j);
			}
		}
		
		swap(v, i, fim);
		
		return i;
	}
	
	private void swap(int v[], int i, int j) {
		int aux = v[i];
		v[i] = v[j];
		v[j] = aux;
	}
}

