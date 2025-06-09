package ex9_10;

public class VerificaExpressao {
	
	public boolean verificaBalanceamento (String expressao) {
		PilhaArrayChar pilha = new PilhaArrayChar(expressao.length()); 
		for (int i = 0; i < expressao.length(); i++) {
            char c = expressao.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                pilha.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (pilha.isEmpty()) {
                    return false; 
                }
                char topo = pilha.pop();
                if (!verifica(topo, c)) {
                    return false; 
                }
            }
        }

        return pilha.isEmpty(); 
    }
	
	private boolean verifica(char inicio, char fim) {
        return (inicio == '(' && fim == ')') ||
               (inicio == '[' && fim == ']') ||
               (inicio == '{' && fim == '}');
    }
}
