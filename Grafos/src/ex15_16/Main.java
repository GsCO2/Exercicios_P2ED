package ex15_16;
	/*
	 15. Implemente uma classe GrafoListaAdjacencia que represente um grafo usando 
	lista de adjacências e contenha os métodos: adicionarAresta, removerAresta e 
	existeAresta. 
	16. Implemente os algoritmos de busca em largura (BFS) e busca em profundidade 
	(DFS) para a classe GrafoListaAdjacencia. 
	 */
public class Main {

	public static void main(String[] args) {
		GrafoListaAdjacencia grafo = new GrafoListaAdjacencia(6);

        grafo.adicionarAresta(0, 1);
        grafo.adicionarAresta(0, 2);
        grafo.adicionarAresta(1, 4);
        grafo.adicionarAresta(2, 5);
        grafo.adicionarAresta(3, 2);
        System.out.println(grafo.existeAresta(2, 1));
        System.out.println(grafo.existeAresta(1, 4));
        grafo.bfs(0);
        grafo.dfs(0);
        grafo.removerAresta(3,2);
        grafo.bfs(0);
        grafo.dfs(0);
    }
}


