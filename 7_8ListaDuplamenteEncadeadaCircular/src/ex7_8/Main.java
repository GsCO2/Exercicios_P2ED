package ex7_8;
	/*
	 7. Implemente uma classe ListaDuplamenteEncadeadaCircular com os métodos
	básicos: adicionar, remover, buscar, imprimirHorario e imprimirAntiHorario.
	8. Implemente um método trocarPrimeiroPorUltimo() para a classe
	ListaDuplamenteEncadeadaCircular.
	 */
public class Main {

	public static void main(String[] args) {
		ListaDuplamenteEncadeadaCircular ldec = new ListaDuplamenteEncadeadaCircular();
		ldec.adicionar(0);
		ldec.adicionar(1);
		ldec.adicionar(2);
		ldec.adicionar(3);
		System.out.println(ldec.buscar(2));
		System.out.println(ldec.buscar(22));
		ldec.imprimirHorario();
		ldec.remover(3);
		ldec.imprimirAntiHorario();
		ldec.adicionar(3);
		ldec.trocarPrimeiroPorUltimo();
		ldec.imprimirHorario();
		
	}

}
