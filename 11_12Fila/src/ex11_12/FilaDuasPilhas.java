package ex11_12;

public class FilaDuasPilhas {
	private PilhaArray pilhaEntrada;
	private PilhaArray pilhaSaida;
	
	public FilaDuasPilhas(int comprimento) {
		this.pilhaEntrada = new PilhaArray(comprimento);
		this.pilhaSaida = new PilhaArray(comprimento);
	}
	
	public void enfileirar(int valor) {
		pilhaEntrada.push(valor);
	}
	
	public Integer desinfileirar() {
		if(isEmpty()) {
			System.out.println("Fila vazia");
			return null;
		}
		
		if(pilhaSaida.isEmpty()) {
			while(!pilhaEntrada.isEmpty()) {
				pilhaSaida.push(pilhaEntrada.pop());
			}
		}
		
		return pilhaSaida.pop();
	}
	
	public Integer primeiro() {
		if(isEmpty()) {
			System.out.println("Fila vazia");
			return null;
		}
		
		if(pilhaSaida.isEmpty()) {
			while(!pilhaEntrada.isEmpty()) {
				pilhaSaida.push(pilhaEntrada.pop());
			}
		}
		
		return pilhaSaida.peek();
	}
	
	public boolean isEmpty() {
		return pilhaEntrada.isEmpty() && pilhaSaida.isEmpty();
	}
	
	public int size() {
		return pilhaEntrada.size( ) + pilhaSaida.size();
	} 

}
