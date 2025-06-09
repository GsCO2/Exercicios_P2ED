package ex7_8;

public class ListaDuplamenteEncadeadaCircular {
	No cabeca = null;
	
	public void adicionar(int valor) {
		No novo = new No(valor);
		if(cabeca == null) {
			cabeca = novo;
			cabeca.proximo = novo;
			cabeca.anterior = novo;
		} else {
			No aux = cabeca.anterior;
			aux.proximo = novo;
			novo.proximo = cabeca;
			novo.anterior = aux;
			cabeca.anterior = novo;
		}
	}
	
	public void remover(int valor) {
		if(cabeca == null) {
			return;
		}
		No aux = cabeca;
		
		do {
			if(aux.valor == valor) {
				if(aux.proximo == aux) {
					cabeca = null;
				} else {
					aux.anterior.proximo = aux.proximo;
					aux.proximo.anterior = aux.anterior;
					if(aux == cabeca) {
						cabeca = aux.proximo;
					}
				}
				return;
			}
			aux = aux.proximo;
		}while(aux != cabeca);
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
	
	public void imprimirHorario() {
		if(cabeca == null) {
			return;
		}
		No aux = cabeca;
		do {
			System.out.print(aux.valor + " ");
			aux = aux.proximo;
		}while(aux != cabeca);
		System.out.println();
	}
	
	public void imprimirAntiHorario() {
		if(cabeca == null) {
			return;
		}
		No aux = cabeca.anterior;
		do {
			System.out.print(aux.valor + " ");
			aux = aux.anterior;
		} while(aux != cabeca.anterior);
		System.out.println();
	}
	
	public void trocarPrimeiroPorUltimo() {
		if(cabeca == null || cabeca.proximo == cabeca) {
			return;
		}
		int aux = cabeca.valor;
	    cabeca.valor = cabeca.anterior.valor;
	    cabeca.anterior.valor = aux;
	}
}
