package ex9_10;

public class PilhaArrayChar {
	private char [] valores;
	private int topo;
	
	public PilhaArrayChar(int capacidade) {
		this.valores = new char [capacidade];
		this.topo = -1;
	}
	
	public void push(char valor) {
		if(topo + 1 == valores.length) {
			System.out.println("Pilha cheia");
			return;
		}
		valores[++topo] = valor;
	}
	
	public char pop() {
		if(isEmpty()) {
			throw new IllegalStateException("Pilha vazia");
		}
		return valores[topo--];
		
	}
	
	public char peek() {
		if(isEmpty()) {
			throw new IllegalStateException("Pilha vazia");	
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