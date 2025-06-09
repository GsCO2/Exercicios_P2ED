package ex17_18;

public class No<K, V> {
    K chave;
    V valor;
    No<K, V> proximo;

    public No(K chave, V valor) {
        this.chave = chave;
        this.valor = valor;
        this.proximo = null;
    }
}
