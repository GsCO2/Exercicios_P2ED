package ex13_14;
	/* 13. Implemente uma classe ArvoreBinariaBusca com os métodos: inserir, buscar, 
	remover e os percursos preOrdem, emOrdem e posOrdem. 
	14. Implemente um método altura() para a classe ArvoreBinariaBusca que retorne a 
	altura da árvore.  
	 */
public class Main {

	public static void main(String[] args) {
		ArvoreBinariaBusca abb = new ArvoreBinariaBusca();
		
		abb.inserir(80);
		abb.inserir(90);
		abb.inserir(70);
		abb.inserir(87);
		abb.inserir(60);
		abb.inserir(76);
		abb.inserir(100);
		System.out.println(abb.buscar(40));
		System.out.println(abb.buscar(60));
		abb.emOrdem();
		abb.remover(60);
		abb.emOrdem();
		abb.inserir(50);
		abb.emOrdem();
		abb.preOrdem();
		abb.posOrdem();
		System.out.println(abb.altura());
	}

}
