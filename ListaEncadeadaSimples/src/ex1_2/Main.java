package ex1_2;
	/*
	1. Implemente uma classe ListaEncadeadaSimples que contenha os métodos
	básicos: adicionar, remover, buscar e imprimir.
	2. Implemente um método inverter() para a classe ListaEncadeadaSimples que
	inverta a ordem dos elementos na lista.
	 */
public class Main {
	public static void main(String[] args) {
		ListaEncadeadaSimples lista = new ListaEncadeadaSimples();
		
		lista.adicionar(1);
		lista.adicionar(2);
		lista.adicionar(3);
		lista.imprimir();
		lista.remover(3);
		System.out.println();
		lista.imprimir();
		lista.adicionar(3);
		lista.inverter();
		System.out.println();
		lista.imprimir();
		System.out.println();
		System.out.println(lista.buscar(2));
		System.out.println(lista.buscar(7));
	}

}
