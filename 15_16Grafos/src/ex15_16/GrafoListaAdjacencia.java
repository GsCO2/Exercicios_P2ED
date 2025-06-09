package ex15_16;

public class GrafoListaAdjacencia {
    private ListaEncadeadaSimples[] adjacencias;
    private int vertices;

    public GrafoListaAdjacencia(int vertices) {
        this.vertices = vertices;
        adjacencias = new ListaEncadeadaSimples[vertices];
        for (int i = 0; i < vertices; i++) {
            adjacencias[i] = new ListaEncadeadaSimples();
        }
    }

    public void adicionarAresta(int i, int j) {
        if (!adjacencias[i].buscar(j)) {
            adjacencias[i].adicionar(j);
        }
        if (!adjacencias[j].buscar(i)) {
            adjacencias[j].adicionar(i); 
        }
    }

    public void removerAresta(int i, int j) {
        adjacencias[i].remover(j);
        adjacencias[j].remover(i);
    }

    public boolean existeAresta(int i, int j) {
        return adjacencias[i].buscar(j);
    }

    public void bfs(int inicio) {
        boolean[] visitado = new boolean[vertices];
        FilaArray fila = new FilaArray(vertices);

        visitado[inicio] = true;
        fila.enfileirar(inicio);

        while (!fila.isEmpty()) {
            int aux = fila.desinfileirar();
            System.out.print(aux + " ");

            No no = adjacencias[aux].inicio;
            while (no != null) {
                int vizinho = no.valor;
                if (!visitado[vizinho]) {
                    visitado[vizinho] = true;
                    fila.enfileirar(vizinho);
                }
                no = no.proximo;
            }
        }

        System.out.println();
    }

    public void dfs(int inicio) {
        boolean[] visitado = new boolean[vertices];
        dfsProcurar(inicio, visitado);
        System.out.println();
    }

    private void dfsProcurar(int atual, boolean[] visitado) {
        visitado[atual] = true;
        System.out.print(atual + " ");

        No aux = adjacencias[atual].inicio;
        while (aux != null) {
            int vizinho = aux.valor;
            if (!visitado[vizinho]) {
                dfsProcurar(vizinho, visitado);
            }
            aux = aux.proximo;
        }
    }
}
