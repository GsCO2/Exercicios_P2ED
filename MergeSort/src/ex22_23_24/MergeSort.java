package ex22_23_24;

public class MergeSort {
	public void mergeSort(int[] v, int ini, int fim){
		int mid;
		if(ini < fim){
			mid = (ini + fim) / 2;
			mergeSort(v, ini, mid);
			mergeSort(v, mid+1, fim);
			intercala(v,ini,fim,mid);
		}
	}
	
	public void intercala(int[] v, int ini, int fim, int mid){
		int i = ini;
		int j = mid + 1;
		int k = 0;
		int[] aux = new int[v.length];
		
		while(i <= mid && j <= fim){
			if(v[i] <= v[j]){
				aux[k++] = v[i++];
			} else {
				aux[k++] = v[j++];
			}
		}
		
		while(i <= mid){
			aux[k++] = v[i++];
		}
		
		while(j <= fim){
			aux[k++] = v[j++];
		}
		
		i = ini; k = 0;
		while(i <= fim){
			v[i++] = aux[k++];
		}
	}
}
