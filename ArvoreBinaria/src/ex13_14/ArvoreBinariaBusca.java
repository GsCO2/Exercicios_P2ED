package ex13_14;

public class ArvoreBinariaBusca {
	private No raiz;
	
	public void inserir(int valor) {
		raiz = inserirNo(raiz, valor);
	}
	
	private No inserirNo(No no, int valor) {
		if(no == null) {
			return new No(valor);
		}
		
		if(valor < no.valor) {
			no.esquerda = inserirNo(no.esquerda, valor);
		} else {
			no.direita = inserirNo(no.direita, valor);
		}
		
		return no;
	}
	
	public boolean buscar(int valor) {
		return buscarNo(raiz, valor);
	}
	
	private boolean buscarNo(No atual, int valor) {
		if(atual == null) {
			return false;
		} 
		
		if(valor == atual.valor) {
			return true;
		} else if(valor < atual.valor) {
			return buscarNo(atual.esquerda, valor);
		} else {
			return buscarNo(atual.direita,valor);
		}
		
		
	}
	
	public void remover(int valor) {
		raiz = removerNo(raiz, valor);
	}
	
	private No removerNo(No atual, int valor) {
		if(atual == null) {
			return null;
		}
		
		if(valor < atual.valor) {
			atual.esquerda = removerNo(atual.esquerda, valor);
		} else if (valor > atual.valor) {
			atual.direita = removerNo(atual.direita, valor);
		} else { // encontrou o nó a ser removido
			
			if(atual.esquerda == null && atual.direita == null) { // Nó folha sem filhos
				return null;
			} else if(atual.esquerda == null) { // Nó com um filho
				return atual.direita;
			} else if(atual.direita == null) { // Nó com um filho
				return atual.esquerda;
			}
			
			// Nó com dois filhos 
			atual.valor = getMenor(atual.direita);
			atual.direita = removerNo(atual.direita, atual.valor);
		}
		
		return atual;
	}
	
	private int getMenor(No no) {
		int menor = no.valor;
		while(no.esquerda != null) {
			menor = no.esquerda.valor;
			no = no.esquerda;
		}
		
		return menor;
	}
	
	public void preOrdem() {
		preOrdemPrint(raiz);
		System.out.println();
	}
	
	private void preOrdemPrint(No no) {
		if(no != null) {
			System.out.print(no.valor + " ");
			preOrdemPrint(no.esquerda);
			preOrdemPrint(no.direita);
		}
	}
	
	public void emOrdem() {
		emOrdemPrint(raiz);
		System.out.println();
	}
	
	private void emOrdemPrint(No no) {
		if(no != null) {
			emOrdemPrint(no.esquerda);
			System.out.print(no.valor + " ");
			emOrdemPrint(no.direita);
		}
	}
	
	public void posOrdem() {
		posOrdemPrint(raiz);
		System.out.println();
	}
	
	private void posOrdemPrint(No no) {
		if(no != null) {
			posOrdemPrint(no.esquerda);
			posOrdemPrint(no.direita);
			System.out.print(no.valor + " ");
		}
	}
	
	public int altura() {
		return alturaArvore(raiz);
	}
	
	private int alturaArvore(No no) {
		if(no == null) {
			return -1; // árvore vazia
		}
		
		int alturaEsquerda = alturaArvore(no.esquerda);
		int alturaDireita = alturaArvore(no.direita);
		return Math.max(alturaEsquerda, alturaDireita) + 1;
	}
}
