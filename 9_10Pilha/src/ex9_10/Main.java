package ex9_10;
	/*
	 9. Implemente uma classe PilhaArray que utilize um array para armazenar os
	elementos e contenha os métodos: push, pop, peek, isEmpty e size.
	10. Implemente uma classe VerificadorExpressao que use uma pilha para verificar
	se uma expressão matemática tem parênteses, colchetes e chaves balanceados
	 */
public class Main {
	
	public static void main(String args[]) {
		// Ex. 9
		PilhaArray pilha = new PilhaArray(5);
		System.out.println(pilha.isEmpty());
		System.out.println(pilha.pop());
		System.out.println(pilha.peek());
		pilha.push(23);
		pilha.push(11);
		pilha.push(10);
		pilha.push(3);
		pilha.push(37);
		System.out.println(pilha.size());
		pilha.push(49); // pilha cheia
		System.out.println(pilha.peek());
		System.out.println(pilha.pop());
		System.out.println(pilha.size());
	
		// Ex. 10
	
		VerificaExpressao verExp = new VerificaExpressao();
		String[] expressoes = {
				"(b+c) / (a * {[d*e] + f})",
				"[{()}]",
				"{[(])}",
				"[[[]]]",
				"({[]})",
				"(((())))",
				"{{}"
		};
	
		for(String expressao : expressoes) {
			boolean resultado = verExp.verificaBalanceamento(expressao);
			if(resultado) {
				System.out.println(expressao + " -> Esta balanceada");
			} else {
				System.out.println(expressao + " -> Nao Esta balanceada");
			}
		}
	}
}
