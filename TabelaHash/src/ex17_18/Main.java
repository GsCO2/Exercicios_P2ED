package ex17_18;
	/*17. Implemente uma classe TabelaHashEncadeamento que utilize o método de 
	encadeamento para tratar colisões. 
	18. Implemente uma classe TabelaHashEnderecamentoAberto que utilize 
	endereçamento aberto com sondagem linear para tratar colisões. 
	*/
public class Main {
	public static void main(String[] args) {
        // Ex.17
		TabelaHashEncadeamento<String, Integer> the = new TabelaHashEncadeamento<>(10);
        the.inserir("um", 1);
        the.inserir("dois", 2);
        the.inserir("tres", 3);
        System.out.println("Valor de 'dois' -> " + the.buscar("dois"));
        the.remover("um");
        System.out.println("Valor de 'um' -> " + the.buscar("um"));
        
        System.out.println();
        
        // Ex. 18
        TabelaHashEnderecamentoAberto tabela = new TabelaHashEnderecamentoAberto(7);
        tabela.inserir(10, 100);
        tabela.inserir(3, 30);
        tabela.inserir(17, 170);
        tabela.inserir(24, 240);
        System.out.println("Busca chave 17 -> " + tabela.buscar(17)); 
        System.out.println("Busca chave 10 -> " + tabela.buscar(10)); 
        System.out.println("Busca chave 5 -> " + tabela.buscar(5));   
        tabela.remover(3);
        System.out.println("Busca chave 3 -> " + tabela.buscar(3)); 
    }
}
