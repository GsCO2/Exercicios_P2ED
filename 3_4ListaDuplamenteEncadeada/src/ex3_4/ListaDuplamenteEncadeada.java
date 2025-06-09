package ex3_4;

public class ListaDuplamenteEncadeada {
	No inicio;
	No fim;
	
	public void adicionar(int valor) {
		No novo = new No(valor);
		if(inicio == null) {
			inicio = fim = novo;
		} else {
			fim.proximo = novo;
			novo.anterior = fim;
			fim = novo;
		}
	}
	
	public void remover(int valor) {
		if (inicio == null) {
	        return; 
	    }
		No aux = inicio;
	    while (aux != null && aux.valor != valor) {
	        aux = aux.proximo;
	    }
	    if (aux == null) {
	        return; // 
	    }
	    if (aux == inicio) {
	        inicio = aux.proximo;
	        if (inicio != null) {
	            inicio.anterior = null;
	        } else {
	            fim = null; 
	        }
	    }
	    else if (aux == fim) {
	        fim = aux.anterior;
	        fim.proximo = null;
	    } else {
	        aux.anterior.proximo = aux.proximo;
	        aux.proximo.anterior = aux.anterior;
	    }
	}
	
	public boolean buscar(int valor) {
		if(inicio == null) {
			return false;
		}
		No aux = inicio;
		while(aux != null) {
			if(aux.valor == valor) {
				return true;
			} 
			aux = aux.proximo;
		}
		return false;
	}
	
	public void imprimirFrente() {
		No aux = inicio;
		while(aux != null) {
			System.out.print(aux.valor + " ");
			aux = aux.proximo;
		}
		System.out.println("");
	}
	
	public void imprimirTras() {
		No aux = fim;
		while(aux != null) {
			System.out.print(aux.valor + " ");
			aux = aux.anterior;
		}
		System.out.println("");
	}
	
	public void adicionarNaPosicao(int valor, int posicao) {
		if(posicao == 0) {
			No novo = new No(valor);
			if(inicio == null) {
				inicio = fim = novo;
			} else {
				novo.proximo = inicio;
				inicio.anterior = novo;
				inicio = novo;
			}
			return;
		}
		
		No aux = inicio;
		int i = 0;
		
		while(aux != null && i < posicao) {
			i++;
			aux = aux.proximo;
		}
		
		if(aux == null) {
			adicionar(valor);
			return;
		}
		
		No novo = new No(valor);
		novo.anterior = aux.anterior;
		if(aux.anterior != null) {
			aux.anterior.proximo = novo;
		}
		novo.proximo = aux;
		aux.anterior = novo;
		
		if(novo.anterior == null) {
			inicio = novo;
		}
	}
}
