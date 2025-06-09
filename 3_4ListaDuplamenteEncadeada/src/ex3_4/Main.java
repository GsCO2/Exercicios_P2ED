package ex3_4;
	/*
	7. Implemente uma classe ListaDuplamenteEncadeadaCircular com os métodos
	básicos: adicionar, remover, buscar, imprimirHorario e imprimirAntiHorario.
	8. Implemente um método trocarPrimeiroPorUltimo() para a classe
	ListaDuplamenteEncadeadaCircular.
	 */
public class Main {

	public static void main(String args[]) {
		
		ListaDuplamenteEncadeada lde = new ListaDuplamenteEncadeada();
		lde.adicionar(1);
		lde.adicionar(2);
		lde.adicionar(4);
		lde.imprimirFrente();
		lde.remover(4);
		lde.imprimirTras();
		System.out.println(lde.buscar(2));
		lde.adicionarNaPosicao(3, 2);
		lde.imprimirFrente();
	}
}
