package src;

/**
*
* @author Rodrigo Richard Gomes
* @version 1.00 2018/3/16
* 
* 
* @coauthor Luana Campos Takeishi
* @version 1.01 2021/5/27
* alteracoes Lista 2 - 2o semestre AEDII
*  
*/
public class CPilha {
	private CCelula topo = null;
	private int qtde;

	/**
	 * Fun��o construtora.
	 */
	public CPilha() {
		// nenhum c�digo
	}

	/**
	 * Verifica se a Pilha est� vazia.
	 * 
	 * @return Retorna TRUE se a PILHA estiver vazia e FALSE caso contr�rio.
	 */
	public boolean vazia() {
		return topo == null;
	}

	/**
	 * Insere o novo item no topo da Pilha
	 * 
	 * @param valorItem: Um Object contendo o item a ser inserido no topo da Pilha
	 */
	public void empilha(Object valorItem) {
		topo = new CCelula(valorItem, topo);
		qtde++;
	}

	/**
	 * Retira e retorna o item do topo da Pilha.
	 * 
	 * @return Retorna um Object contendo o item retirado do topo da Pilha. Caso a
	 *         Pilha esteja vazia retorna null.
	 */
	public Object desempilha() {
		Object item = null;
		if (topo != null) {
			item = topo.item;
			topo = topo.prox;
			qtde--;
		}
		return item;
	}

	/**
	 * Verifica se o item passado como par�metro est� contido na lista.
	 * 
	 * @param O par�metro "valorItem" � um object contendo o item a ser localizado.
	 * @return Retorna TRUE caso o item esteja presente na pilha.
	 */
	public boolean contem(Object valorItem) {
		CCelula aux = topo;
		while (aux != null) {
			if (aux.item.equals(valorItem))
				return true;
			aux = aux.prox;
		}
		return false;
	}

	/**
	 * Verifica se o item passado como par�metro est� contido na pilha. (Obs: usa o
	 * comando FOR)
	 * 
	 * @param valorItem O par�metro "valorItem" � um object contendo o item a ser
	 *                  localizado.
	 * @return Retorna TRUE caso o item esteja presente na pilha.
	 */
	public boolean contemFor(Object valorItem) {
		for (CCelula aux = topo; aux != null; aux = aux.prox)
			if (aux.item.equals(valorItem))
				return true;
		return false;
	}

	/**
	 * Retorna um Object contendo o item do topo da Pilha.
	 * 
	 * @return Retorna um Object contendo o item do topo da Pilha. Caso a Pilha
	 *         esteja vazia retorna null.
	 */
	public Object peek() {
		return (topo != null) ? topo.item : null;
	}

	/**
	 * Imprime os elementos da pilha
	 */
	public void mostra() {
		System.out.println("\ntopo");
		System.out.println("  | ");
		System.out.println("  v ");
		for (CCelula c = topo; c != null; c = c.prox)
			System.out.println("[ " + c.item + " ]");
		System.out.println("  | ");
		System.out.println("  v ");
		System.out.println("null\n");
	}
	
	// Imprime todos os elementos simulando formato de lista:
			// [/]->[7]->[21]->[13]->null
			public void imprimeFormatoPilha(String titulo) {
				System.out.println(titulo);
				System.out.println("topo");
				System.out.println("  | ");
				System.out.println("  v ");
				for (CCelula c = topo; c != null; c = c.prox)
					System.out.println("[ " + c.item + " ]");
				System.out.println("  | ");
				System.out.println("  v ");
				System.out.println("null\n");
			}

	/**
	 * M�todo que retorna a quantidade de itens da Pilha. Getter
	 */
	public int quantidade() {
		return qtde;
	}
	
	/**
	 * M�todo que inverte a ordem dos elementos da Pilha.
	*/
	public void inverte() {
		CPilha nova = new CPilha();
		for(Object auxo = this.desempilha(); auxo != null; auxo = this.desempilha())
			nova.empilha(auxo);
		this.topo = nova.topo;
		this.qtde = nova.qtde;
	}
	
	/**
	 * Clona a pilha.
	*/
	public CPilha clone() {
		CPilha clone = new CPilha();
		for (CCelula c = topo; c != null; c = c.prox)
			clone.empilha(c.item);
		return clone;
	}

}