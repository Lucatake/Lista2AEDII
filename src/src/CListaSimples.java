package src;

/**
*
* @author Luana Campos Takeishi
* @version 1.00 2021/5/30
* 
*/

public class CListaSimples {
	private CCelula primeira, ultima;
	
	/**
	 * Fun��o Construtora.
	*/
	public CListaSimples() {
		primeira = ultima = null;
	}
	
	/**
	 * M�todo que verifica se a lista est� vazia.
	 * @return true - caso lista vazia.
	 * @return false - se contem elementos.
	*/
	public boolean vazia() {
		return primeira == null && ultima == null;
	}
	
	/**
	 * M�todo que insere o elemento no come�o.
	 * @param valorItem - item a ser inserido.
	*/
	public void insereComeco(Object valorItem) {
		primeira = new CCelula(valorItem, primeira);
		if (primeira.prox == null)
			ultima = primeira;
	}
	
	/**
	 * M�todo que remove o elemento no come�o.
	 * @return valorItem - item a ser removidoo.
	*/
	public Object removeComeco(){
		if (primeira != ultima) {
			CCelula aux = primeira;
			primeira = aux.prox;
			if (primeira == null) 
				ultima = primeira;
			return aux.item;
		}
		return null;
	}
	
	/**
	 * M�todo que insere o elemento no fim.
	 * @param valorItem - item a ser inserido.
	*/
	public void insereFim(Object valorItem) {
		if(primeira == null)
			primeira = ultima = new CCelula(valorItem);
		else {
			ultima.prox = new CCelula(valorItem);
			ultima = ultima.prox;
		}
	}
	
	/**
	 * M�todo que remove o elemento no fim.
	 * @return valorItem - item a ser removido.
	*/
	public Object removeFim() {
		if (primeira != ultima) {
			CCelula aux = primeira;
			while (aux.prox != ultima)
				aux = aux.prox;
			CCelula aux2 = aux.prox;
			ultima = aux;
			ultima.prox = null;
			return aux2.item;
		}
		return null;
	}
	
	/**
	 * M�todo que imprime a lista.
	*/
	public void imprime() {
		for (CCelula aux = primeira; aux != null; aux = aux.prox)
			System.out.print(aux.item + " ");
		System.out.println("");
	}
	
	/**
	 * M�todo que verifica se um elemento est� contido na lista.
	 * @param elemento - item a ser procurado.
	 * @return true - lista contem elemento.
	 * @return false - lista n�o contem elemento.
	*/
	public boolean contem(Object elemento){
		boolean contem = false;
		for (CCelula aux = primeira; aux != null && !contem; aux = aux.prox)
			contem = elemento.equals(aux.item);
		return contem;
	}
}