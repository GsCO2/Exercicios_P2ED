package ex15_16;

public class FilaArray {
	private Integer[] valores;
	private int fim;
	private int inicio;
	private int tam;
	private int comprimento;
	public FilaArray(int comprimento) {
		this.comprimento = comprimento;
		this.valores = new Integer[comprimento];
		this.fim = -1;
		this.inicio = 0;
		this.tam = 0;
	}
	
	public void enfileirar(int valor) {
		if(tam == valores.length) {
			System.out.println("Fila cheia");
			return;
		}
		fim = (fim + 1) % comprimento;
		valores[fim] = valor;
		tam++;
		
	}
	
	public Integer desinfileirar() {
		if(isEmpty()) {
			System.out.println("Fila vazia");
			return null;
		}
		
		int aux = valores[inicio];
		inicio = (inicio + 1) % comprimento;
		tam--;
		return aux;
		
	}
	
	public Integer primeiro() {
		if(isEmpty()) {
			System.out.println("Fila vazia");
			return null;
		}
		
		return valores[inicio];
	}
	
	public boolean isEmpty() {
		return tam == 0;
	}
	
	public int size() {
		return tam;
	}
}
