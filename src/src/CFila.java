package src;

/**
 * 
 * @author Rodrigo Richard Gomes
 * @version 1.00 2018/3/16
 *  
 * @coauthor Luana Campos Takeishi
 * @version 1.01 2021/5/27
 * alteracoes Lista 2 - 2o semestre AEDII
 * 
 */
public class CFila {
	private CCelula frente; // Celula cabeca.
	private CCelula tras; // Ultima celula.
	private int qtde;

	/**
	 * Fun��o construtora. Cria a c�lula cabe�a e faz as refer�ncias frente e tras
	 * apontarem para ela.
	 */
	public CFila() {
		frente = new CCelula();
		tras = frente;
	}

	/**
	 * Verifica se a fila est� vazia.
	 * 
	 * @return Retorna TRUE se a fila estiver vazia e FALSE caso contr�rio.
	 */
	public boolean vazia() {
		return frente == tras;
	}

	/**
	 * Imprime os elementos da fila
	 */
	public void mostra() {
		System.out.print("[ ");
		for (CCelula c = frente.prox; c != null; c = c.prox)
			System.out.print(c.item + " ");
		System.out.println("] ");
	}
	
	/**
	 * Imprime os elementos da fila
	 */
	public void mostrar() {
		for (CCelula c = frente.prox; c != null; c = c.prox)
			System.out.println(c.item);
	}
	
	// Imprime todos os elementos simulando formato de lista:
		// [/]->[7]->[21]->[13]->null
		public void imprimeFormatoFila(String titulo) {
			System.out.println(titulo);
			System.out.print("[ ");
			for (CCelula aux = frente.prox; aux != null; aux = aux.prox)
				System.out.print( aux.item + " ");
			System.out.println("] ");
		}

	/**
	 * Insere um novo Item no fim da fila.
	 * 
	 * @param valorItem O parametro "valorItem" � um Object contendo o elemento a
	 *                  ser inserido no final da fila.
	 */
	public void enfileira(Object valorItem) {
		tras.prox = new CCelula(valorItem);
		tras = tras.prox;
		qtde++;
	}

	/**
	 * Retira e retorna o primeiro elemento da fila.
	 * 
	 * @return Retorna um Object contendo o primeiro elemento da fila. Caso a fila
	 *         esteja vazia retorna null.
	 */
	public Object desenfileira() {
		Object item = null;
		if (frente != tras) {
			frente = frente.prox;
			item = frente.item;
			qtde--;
		}
		return item;
	}
	
	
	// Id�ntico ao m�todo anterior, mas sem usar a vari�vel tempor�ria item
	public Object desenfileirav2() {
		if (frente != tras) {
			frente = frente.prox;
			qtde--;
			return frente.item;
		}
		return null;
	}
	

	/**
	 * Retorna o primeiro Item da fila sem remove-lo.
	 * 
	 * @return Retorna um Object contendo o primeiro Item da fila.
	 */
	public Object peek() {
		if (frente != tras)
			return frente.prox.item;
		else
			return null;
		//return (frente != tras)? frente.prox.item : null;
	}

	/**
	 * Verifica se o Item passado como parametro esta contido na fila.
	 * 
	 * @param valorItem O parametro "valorItem" e um object contendo o Item a ser
	 *                  localizado.
	 * @return O m�todo retorna TRUE caso o item esteja presente na fila.
	 */
	public boolean contem(Object valorItem) {
		CCelula aux = frente.prox;
		while (aux != null) {
			if (aux.item.equals(valorItem))
				return true;
			aux = aux.prox;
		}
		return false;
	}

	/**
	 * Verifica se o Item passado como parametro esta contido na fila. (Obs: usa o
	 * comando FOR)
	 * 
	 * @param (valorItem) Recebe como parametro um object contendo o Item a ser
	 *                    localizado.
	 * @return Retorna TRUE caso o Item esteja presente na fila.
	 */
	public boolean contemFor(Object valorItem) {
		for (CCelula aux = frente.prox; aux != null; aux = aux.prox)
			if (aux.item.equals(valorItem))
				return true;
		return false;
	}

	/**
	 * Metodo que retorna a quantidade de itens da fila.
	 * 
	 * @return
	 */
	public int quantidade() {
		return qtde;
	}
	
	/**
	 * Metodo que retorna a quantidade de vezes em
	 * que o elemento passado por par�metro est� na fila.
	 * @param elemento - elemento a ser pesquisado.
	 * @return quantidade - quantidade de apari��es.
	 */
	public int qtdeOcorrencias(Object elemento) {
		int quantidade = 0;
		for (CCelula aux = frente.prox; aux != null; aux = aux.prox)
			if (elemento.equals(aux.item))
				quantidade++;
		return quantidade;
	}
	
	/**
	 * M�todo que inverte a ordem dos elementos da Fila.
	*/
	public void inverte() {
		CFila nova = new CFila();
		for (int i = qtde; i > 0; i--) {
			CCelula aux = frente.prox;
			for (int j = 0;j < i-1; aux = aux.prox, j++);
			nova.enfileira(aux.item);
		}
		this.frente = nova.frente;
		this.tras = nova.tras;
		this.qtde = nova.qtde;
	}

	/**
	 * Retorna o Item contido na posi��o passada por par�metro.
	*/
	public Object retornaIndice(int posicao) {
		if ((posicao >= 1) && (posicao <= qtde) && (frente != tras)) {
			CCelula aux = frente.prox;
			for (int i = 1; i < posicao; i++, aux = aux.prox);
				return aux.item;
		}
		return null;
	}
	
	/**
	 * M�todo que clona a Fila.
	*/
	public CFila clone() {
		CFila clone = new CFila();
		for (CCelula aux = frente.prox; aux != null; aux = aux.prox)
			clone.enfileira(aux.item);
		return clone;
	}
	
	/**
	 * M�todo limpa a Fila.
	**/
	public void Limpar() {
		frente.prox = null;
		tras = frente;
		qtde = 0;
	}
	
	/**
	 * Fun��o construtora a partir de um vetor.
	 * @param VET - vetor de objetos para construir a fila.
	**/
	CFila (Object[] VET){
		frente = new CCelula();
		tras = frente;
		for(int i = 0; i < VET.length; i++) {
			tras.prox = new CCelula(VET[i]);
			tras = tras.prox;
			qtde++;
		}
	}
}
