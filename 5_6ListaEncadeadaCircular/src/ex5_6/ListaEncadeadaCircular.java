package ex5_6;

public class ListaEncadeadaCircular {
	No cabeca = null;
	No cauda = null;
	public void adicionar(int valor) {
		No novo = new No(valor);
		if(cabeca == null) {
			cabeca = novo;
			cauda = novo;
			novo.proximo = cabeca;
		} else {
			cauda.proximo = novo;
			cauda = novo;
			cauda.proximo = cabeca;
		}
	}
	
	public void remover(int valor) {
		if(cabeca == null) {
			return;
		}
		No atual = cabeca;
		No anterior = cauda;
		do {
			if(atual.valor == valor) {
				if(atual == cabeca) {
					if(cabeca == cauda) {
						cabeca = null;
						cauda = null;
					} else {
						cabeca = cabeca.proximo;
						cauda.proximo = cabeca;
					}
				} else if(atual == cauda) {
					cauda = anterior;
					cauda.proximo = cabeca;
				} else {
					anterior.proximo = atual.proximo;
				}
				return;
			}
			anterior = atual;
			atual = atual.proximo;
		} while(atual != cabeca);
	}
	
	public boolean buscar(int valor) {
		if(cabeca == null) {
			return false;
		}
		No aux = cabeca;
		do {
			if(aux.valor == valor) {
				return true;
			}
			aux = aux.proximo;
		} while(aux != cabeca);
		
		return false;
	}
	
	public void imprimir() {
		if(cabeca == null) {
			return;
		}
		No aux = cabeca;
		do {
			System.out.print(aux.valor + " ");
			aux = aux.proximo;
		} while(aux != cabeca);
		System.out.println();
	}
	
	public void rotacionar(int k) {
		if(cabeca == null || k == 0) {
			return;
		}
		
		int tam = 1;
		No aux = cabeca;
		
		while(aux.proximo != cabeca) {
			tam++;
			aux = aux.proximo;
		}
		k = k % tam; // isso faz com que a lista não precise dar rotações desnecessárias, por ex: se a lista
		// tem tamanho = 4, no máx vai dar 4 rotações, mesmo se k = 100
		if(k == 0) {
			return;
		}
		aux = cabeca;
		for(int i = 0; i < k - 1; i++) {
			aux = aux.proximo;
		}
		
		cabeca = aux.proximo;
		cauda = aux;
	}
}
