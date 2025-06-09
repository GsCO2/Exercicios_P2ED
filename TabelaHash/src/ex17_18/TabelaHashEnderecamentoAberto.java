package ex17_18;

public class TabelaHashEnderecamentoAberto {

    private Entrada[] tabela;
    private int comprimento;
    private int tam;

    public TabelaHashEnderecamentoAberto(int comprimento) {
        this.comprimento = comprimento;
        this.tabela = new Entrada[comprimento];
        this.tam = 0;
    }

    private int hash(int chave) {
        return Math.abs(chave) % comprimento;
    }

    public boolean inserir(int chave, int valor) {
        if (tam == comprimento) {
            System.out.println("Tabela cheia, não é possível inserir.");
            return false;
        }

        int indice = hash(chave);

        for (int i = 0; i < comprimento; i++) {
            int pos = (indice + i) % comprimento;
            Entrada entrada = tabela[pos];

            if (entrada == null || entrada.removido) {
                tabela[pos] = new Entrada(chave, valor);
                tam++;
                return true;
            } else if (entrada.chave == chave && !entrada.removido) {
                tabela[pos].valor = valor;
                return true;
            }
        }
        return false;
    }

    public Integer buscar(int chave) {
        int indice = hash(chave);

        for (int i = 0; i < comprimento; i++) {
            int pos = (indice + i) % comprimento;
            Entrada entrada = tabela[pos];

            if (entrada == null) {
                return null;
            } else if (!entrada.removido && entrada.chave == chave) {
                return entrada.valor;
            }
        }
        return null;
    }

    public boolean remover(int chave) {
        int indice = hash(chave);

        for (int i = 0; i < comprimento; i++) {
            int pos = (indice + i) % comprimento;
            Entrada entrada = tabela[pos];

            if (entrada == null) {
                return false;
            } else if (!entrada.removido && entrada.chave == chave) {
                entrada.removido = true;
                tam--;
                return true;
            }
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
