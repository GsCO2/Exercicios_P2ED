package ex1_2;

public class ListaEncadeadaSimples {
	No inicio;
	
	public void adicionar(int valor) {
		No novo = new No(valor);
		if(inicio == null) {
			inicio = novo;
		} else {
			No aux = inicio;
			
			while(aux.proximo != null) {
				aux = aux.proximo;
			}
			aux.proximo = novo;
		}
	}
	
	public void remover(int valor) {
		if(inicio == null) {
			System.out.println("Lista vazia");
			return;
		}
		if(inicio.valor == valor) {
			inicio = inicio.proximo;
			return;
		}
		No aux = inicio;
		
		while(aux.proximo != null) {
			if(aux.proximo.valor == valor) {
				aux.proximo = aux.proximo.proximo;
				return;
			}
			aux = aux.proximo;
		}
		System.out.println("Elemento não encontrado");
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
	
	public void imprimir() {
		No aux = inicio;
		while(aux != null) {
			System.out.print(aux.valor + " ");
			aux = aux.proximo;
		}
	}
	
	public void inverter() {
		No anterior = null;
		No aux = inicio;
		No proximo = null;
			
		while(aux != null) {
			proximo = aux.proximo;
			aux.proximo = anterior;
			anterior = aux;
			aux = proximo;
		}
		
		inicio = anterior;
	}
}
