package ex5_6;
	/*
	5. Implemente uma classe ListaEncadeadaCircular com os métodos básicos:
	adicionar, remover, buscar e imprimir.
	6. Implemente um método rotacionar(int k) para a classe ListaEncadeadaCircular
	que rotacione a lista k posições.
	 */
public class Main {
	
	public static void main(String[] args) {
		ListaEncadeadaCircular lec = new ListaEncadeadaCircular();
		lec.adicionar(0);
		lec.adicionar(1);
		lec.adicionar(2);
		lec.imprimir();
		System.out.println(lec.buscar(2));
		lec.remover(2);
		lec.imprimir();
		lec.adicionar(2);
		lec.adicionar(3);
		lec.imprimir();
		lec.rotacionar(2);
		lec.imprimir();
	}
}
