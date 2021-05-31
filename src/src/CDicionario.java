package src;

/**
*
* @author Luana Campos Takeishi
* @version 1.00 2021/5/30
* 
*/

public class CDicionario {
	private CCelulaDicionario primeira, ultima;
	
	/**
	 * Fun��o Construtora.
	 * Aloca a c�l�ula cabe�a e aponta as refer�ncias � ela.
	*/
	public CDicionario() {
		primeira = ultima =new CCelulaDicionario();
	}
	
	/**
	 * M�todo que verifica se o dicion�rio est� vazio.
	 * @return true - caso dicion�rio vazio.
	 * @return false - se contem elementos.
	*/
	public boolean vazio() {
		return primeira == ultima;
	}
	
	/**
	 * M�todo que adiciona o par chave/valor
	 * na �ltima posi��o do dicion�rio.
	 * N�o permite chaves duplicadas.
	 * @param chave e valor a serem adicionados.
	*/
	public void adiciona(Object chave, Object valor) {
		boolean existe= false;
		for (CCelulaDicionario aux = primeira.prox; aux != null && !existe; aux = aux.prox)
			existe = chave.equals(aux.key);
		if(!existe) {
			ultima.prox = new CCelulaDicionario(chave, valor);
			ultima = ultima.prox;
		}
	}
	
	/**
	 * M�todo que retorna o valor associado a chave.
	 * @param chave a ser pesquisada.
	 * @return valor associado.
	 * Caso n�o exista, retorna null;
	*/
	public Object recebeValor(Object chave) {
		for (CCelulaDicionario aux = primeira.prox; aux != null; aux = aux.prox)
			if(chave.equals(aux.key))
				return aux.value;
		return null;
	}
	
	/**
	 * M�todo que imprimir dicion�rio.
	*/
	public void imprimeFormatoDicio(String titulo) {
		System.out.println(titulo);
		for (CCelulaDicionario aux = primeira.prox; aux != null; aux = aux.prox)
			System.out.println("[" + aux.key + "]->[" + aux.value + "]");
	}
	
	/**
	 * M�todo que imprimir Cod�o exerc�cio 30.
	*/
	public void imprimeFormatoCodao(String titulo) {
		System.out.println(titulo);
		int i = 1;
		int line = 1;
		for (CCelulaDicionario aux = primeira.prox; aux != null; aux = aux.prox, i++) {
			if(line == 4 || line ==5 || line == 15)
				System.out.print("[" + aux.key + "]->[" + aux.value + "] \t");
			else if(line == 12)
					System.out.print("[" + aux.key + "]->[" + aux.value + "]");
			else
				System.out.print("[" + aux.key + "]->[" + aux.value + "]\t");
			if(i%4==0) {
				System.out.print("\n");
				line++;
			}
			if(i==43)
				System.out.print("\t");
		}
	}
}
