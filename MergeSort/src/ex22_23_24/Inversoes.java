package ex22_23_24;

public class Inversoes {
    
    public int contaInversoes(int[] v, int ini, int fim) {
        return mergeSort(v, ini, fim);
    }
    
    public int mergeSort(int[] v, int ini, int fim) {
        int contadorInversoes = 0;
        if (ini < fim) {
            int mid = (ini + fim) / 2;
            contadorInversoes += mergeSort(v, ini, mid);
            contadorInversoes += mergeSort(v, mid + 1, fim);
            contadorInversoes += intercala(v, ini, fim, mid);
        }
        return contadorInversoes;
    }
    
    private int intercala(int[] v, int ini, int fim, int mid) {
        int i = ini;
        int j = mid + 1;
        int k = 0;
        int[] aux = new int[v.length];
        int contadorInversoes = 0;

        while (i <= mid && j <= fim) {
            if (v[i] <= v[j]) {
                aux[k++] = v[i++];
            } else {
                aux[k++] = v[j++];
                contadorInversoes += (mid - i + 1);
            }
        }

        while (i <= mid) {
            aux[k++] = v[i++];
        }

        while (j <= fim) {
            aux[k++] = v[j++];
        }

        i = ini; k = 0;
        
        while(i <= fim) {
        	v[i++] = aux[k++];
        }

        return contadorInversoes;
    }
}

