package ex17_18;

public class TabelaHashEncadeamento<K, V> {

    private ListaEncadeadaSimples<K, V>[] tabela;
    private int comprimento;
    private int tam;

    public TabelaHashEncadeamento(int comprimento) {
        this.comprimento = comprimento;
        this.tabela = new ListaEncadeadaSimples[comprimento];
        this.tam = 0;
    }

    private int hash(K chave) {
        return Math.abs(chave.hashCode()) % comprimento;
    }

    public void inserir(K chave, V valor) {
        int indice = hash(chave);
        if (tabela[indice] == null) {
            tabela[indice] = new ListaEncadeadaSimples<>();
        }

        No<K, V> entrada = tabela[indice].buscarPorChave(chave);
        if (entrada != null) {
            entrada.valor = valor; 
        } else {
            tabela[indice].adicionar(chave, valor);
            tam++;
        }
    }

    public V buscar(K chave) {
        int indice = hash(chave);
        if (tabela[indice] != null) {
            No<K, V> entrada = tabela[indice].buscarPorChave(chave);
            if (entrada != null) {
                return entrada.valor;
            }
        }
        return null;
    }

    public boolean remover(K chave) {
        int indice = hash(chave);
        if (tabela[indice] != null) {
            boolean removido = tabela[indice].removerPorChave(chave);
            if (removido) {
                tam--;
            }
            return removido;
        }
        return false;
    }

    public int tamanho() {
        return tam;
    }

    public boolean estaVazia() {
        return tam == 0;
    }
}