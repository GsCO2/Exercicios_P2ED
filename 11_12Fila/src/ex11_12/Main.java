package ex11_12;
	/*
	11. Implemente uma classe FilaArray que utilize um array circular para armazenar
	os elementos e contenha os métodos: enfileirar, desenfileirar, primeiro, isEmpty
	e size.
	12. Implemente uma classe FilaDuasPilhas que simule uma fila usando duas pilhas.
	*/
public class Main {
	
	public static void main(String[] args) {
		// ex. 11
		
		FilaArray fila = new FilaArray(5);
		System.out.println(fila.isEmpty());
		System.out.println("tamanho da fila -> " + fila.size());
		System.out.println(fila.primeiro());
		fila.enfileirar(56);
		System.out.println("tamanho da fila -> " + fila.size());
		System.out.println("saindo da fila -> " + fila.desinfileirar());
		System.out.println("tamanho da fila -> " +fila.size());
		fila.enfileirar(59);
		fila.enfileirar(37);
		fila.enfileirar(12);
		fila.enfileirar(30);
		fila.enfileirar(9);
		System.out.println("tamanho da fila -> " + fila.size());
		System.out.println("primeiro da fila -> " + fila.primeiro());
		fila.enfileirar(10);
		System.out.println("saindo da fila -> " + fila.desinfileirar());
		System.out.println("tamanho da fila -> " + fila.size());
		System.out.println("primeiro da fila -> " +fila.primeiro());
		
		// ex. 12
		
		System.out.println();
		FilaDuasPilhas simulacao = new FilaDuasPilhas(5);
		System.out.println("tamanho da fila -> " + simulacao.size());
		simulacao.enfileirar(12);
		simulacao.enfileirar(13);
		simulacao.enfileirar(1);
		System.out.println("saindo da fila -> " + simulacao.desinfileirar());
		System.out.println("primeiro da fila -> " + simulacao.primeiro());
	}

}
