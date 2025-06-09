package ex11_12;

public class PilhaArray {
	private Integer [] valores;
	private int topo;
	
	public PilhaArray(int comprimento) {
		this.valores = new Integer[comprimento];
		this.topo = -1;
	}
	
	public void push(int valor) {
		if(topo + 1 == valores.length) {
			System.out.println("Pilha cheia");
			return;
		}
		valores[++topo] = valor;
	}
	
	public Integer pop() {
		if(isEmpty()) {
			System.out.println("Pilha vazia");
			return null;
		}
		int aux = valores[topo];
		valores[topo--] = null;
		return aux;
		
	}
	
	public Integer peek() {
		if(isEmpty()) {
			System.out.println("Pilha vazia");
			return null;	
		}
		return valores[topo];
	}
	
	public boolean isEmpty() {
		return topo == -1;
	}
	
	public int size() {
		return topo + 1;
	}
}
