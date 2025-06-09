package ex17_18;

public class ListaEncadeadaSimples<K, V> {
    private No<K, V> inicio;

    public void adicionar(K chave, V valor) {
        No<K, V> novo = new No<>(chave, valor);
        if (inicio == null) {
            inicio = novo;
        } else {
            No<K, V> aux = inicio;
            while (aux.proximo != null) {
                aux = aux.proximo;
            }
            aux.proximo = novo;
        }
    }

    public boolean removerPorChave(K chave) {
        if (inicio == null) return false;

        if (inicio.chave.equals(chave)) {
            inicio = inicio.proximo;
            return true;
        }

        No<K, V> aux = inicio;
        while (aux.proximo != null) {
            if (aux.proximo.chave.equals(chave)) {
                aux.proximo = aux.proximo.proximo;
                return true;
            }
            aux = aux.proximo;
        }
        return false;
    }

    public No<K, V> buscarPorChave(K chave) {
        No<K, V> aux = inicio;
        while (aux != null) {
            if (aux.chave.equals(chave)) {
                return aux;
            }
            aux = aux.proximo;
        }
        return null;
    }
}

