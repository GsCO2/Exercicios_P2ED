package ex25_26;

public class BubbleSort {
	
	public void bubbleSort(int[] v) {
		for(int i = 0; i < v.length - 1; i++) {
			for(int j = 0; j < v.length - 1 - i; j++) {
				if(v[j + 1] < v[j]) {
					int aux = v[j];
					v[j] = v[j + 1];
					v[j + 1] = aux;
				}
			}
		}
	}
	
	public void bubbleSortOtimizado(int[]v) {
		boolean trocou;
		for(int i = 0; i < v.length - 1; i++) {
			trocou = false;
			for(int j = 0; j < v.length - 1 - i; j++) {
				if(v[j + 1] < v[j]) {
					int aux = v[j];
					v[j] = v[j + 1];
					v[j + 1] = aux;
					trocou = true;
				}
			}
			if(!trocou) {
				break;
			}
		}
	}
}
