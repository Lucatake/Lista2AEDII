package src;

/**
 * @(#)CListaDup.java
 *
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

class CListaDup {
	private CCelulaDup primeira; // Referencia a primeira celula da lista (celula cabeca)
	private CCelulaDup ultima; // Referencia a ultima celula da lista
	private int qtde;

	// Aloca a celula cabeca e faz todas as referencias
	// apontarem para ela.
	public CListaDup() {
		primeira = new CCelulaDup();
		ultima = primeira;
	}

	// Verifica se a lista esta vazia.
	public boolean vazia() {
		return primeira == ultima;
	}

	// Insere um novo elemento no fim da lista.
	public void insereFim(Object valorItem) {
		ultima.prox = new CCelulaDup(valorItem, ultima, null);
		ultima = ultima.prox;
		qtde++;
	}

	// Insere um novo elemento no comeco da lista.
	public void insereComeco(Object valorItem) {
		if (primeira == ultima) { // Se a lista estiver vazia insere no fim
			ultima.prox = new CCelulaDup(valorItem, ultima, null);
			ultima = ultima.prox;
		} else { // senao insere no comeco
			primeira.prox = new CCelulaDup(valorItem, primeira, primeira.prox);
			primeira.prox.prox.ant = primeira.prox;
		}
		qtde++;
	}

	// Remove o primeiro elemento da lista. Na verdade, remove a referencia para a
	// celula cabeca, e torna a primeira celula na nova celula cabeca
	public void removeComecoSemRetorno() {
		if (primeira != ultima) {
			primeira = primeira.prox;
			primeira.ant = null;
			qtde--;
		}
	}

	// Imprime todos os elementos da lista duplamente encadeada usando o comando
	// while.
	public void imprime() {
		CCelulaDup aux = primeira.prox;
		while (aux != null) {
			System.out.println(aux.item);
			aux = aux.prox;
		}
	}

	// Imprime todos os elementos da lista duplamente encadeada usando o comando
	// for.
	public void imprimeFor() {
		for (CCelulaDup aux = primeira.prox; aux != null; aux = aux.prox)
			System.out.println(aux.item);
	}
	
	// Imprime todos os elementos simulando formato de lista:
		// [/]->[7]->[21]->[13]->null
		public void imprimeFormatoLista(String titulo) {
			System.out.println(titulo);
			System.out.print("[/]->");
			for (CCelulaDup aux = primeira.prox; aux != null; aux = aux.prox)
				System.out.print("[" + aux.item + "]->");
			System.out.println("null");
		}

	// Imprime todos os elementos da lista duplamente encadeada em sentido inverso
	// usando o comando while.
	public void imprimeInv() {
		CCelulaDup aux = ultima;
		while (aux.ant != null) {
			System.out.println(aux.item);
			aux = aux.ant;
		}
	}

	// Imprime todos os elementos da lista duplamente encadeada em sentido inverso
	// usando o comando for.
	public void imprimeInvFor() {
		for (CCelulaDup aux = ultima; aux.ant != null; aux = aux.ant)
			System.out.println(aux.item);
	}

	// Verifica se o Item passado como parametro esta contido na lista.
	public boolean contem(Object elemento) {
		boolean achou = false;
		CCelulaDup aux = primeira.prox;
		while (aux != null && !achou) {
			achou = aux.item.equals(elemento);
			aux = aux.prox;
		}
		return achou;
	}

	// Verifica se o Item passado como parametro esta contido na lista. (Obs: usa o
	// comando FOR)
	public boolean contemFor(Object elemento) {
		boolean achou = false;
		for (CCelulaDup aux = primeira.prox; aux != null && !achou; aux = aux.prox)
			achou = aux.item.equals(elemento);
		return achou;
	}

	// Retorna o primeiro elemento da lista.
	public Object retornaPrimeiro() {
		if (primeira != ultima)
			return primeira.prox.item;
		return null;
	}

	// Retorna o Item contido na posicao p da lista.
	public Object retornaIndice(int posicao) {
		// EXERC?????CIO : deve retornar o elemento da posicao p passada por parametro
		// [cabeca]->[7]->[21]->[13]->null
		// retornaIndice(2) deve retornar o elemento 21. retornaIndice de uma posicao
		// inexistente deve retornar null.
		// Se e uma posicao valida e a lista possui elementos
		if ((posicao >= 1) && (posicao <= qtde) && (primeira != ultima)) {
			CCelulaDup aux = primeira.prox;
			// Procura a posicao a ser inserido
			for (int i = 1; i < posicao; i++, aux = aux.prox)
				;
			if (aux != null)
				return aux.item;
		}
		return null;
	}

	// Retorna o elemento da ultima posicao.
	public Object retornaUltimo() {
		if (primeira != ultima)
			return ultima.item;
		return null;
	}

	// Remove o ultimo elemento da lista. Na verdade, remove as referencias para a
	// ultima celula, forcando que o Garbage Collector desaloque a ultima celula
	public void removeFimSemRetorno() {
		if (primeira != ultima) {
			ultima = ultima.ant;
			ultima.prox = null;
			qtde--;
		}
	}

	// Localiza o Item passado por parametro e o remove da Lista
	public void remove(Object valorItem) {
		if (primeira != ultima) {
			CCelulaDup aux = primeira.prox;
			boolean achou = false;
			while (aux != null && !achou) {
				achou = aux.item.equals(valorItem);
				if (!achou)
					aux = aux.prox;
			}
			if (achou) { // achou o elemento
				CCelulaDup anterior = aux.ant;
				CCelulaDup proximo = aux.prox;
				anterior.prox = proximo;
				if (proximo != null)
					proximo.ant = anterior;
				else
					ultima = anterior;
				qtde--;
			}
		}
	}

	// Remove e retorna o primeiro elemento da lista.
	public Object removeRetornaComeco() {
		if (primeira != ultima) {
			CCelulaDup aux = primeira.prox;
			primeira = primeira.prox;
			primeira.ant = null;
			qtde--;
			return aux.item;
		}
		return null;
	}

	// Remove e retorna o ultimo elemento da lista.
	public Object removeRetornaFim() {
		if (primeira != ultima) {
			CCelulaDup aux = ultima;
			ultima = ultima.ant;
			ultima.prox = null;
			qtde--;
			return aux.item;
		}
		return null;
	}

	// Metodo que retorna a quantidade de elementos da lista.
	public int quantidade() {
		return qtde;
	}

	public void teste() {
		CCelulaDup i = primeira.prox;
		CCelulaDup j = ultima;
		CCelulaDup k;
		while (j.prox != i) {
			Object tmp = i.item;
			i.item = j.item;
			j.item = tmp;
			i = i.prox;
			for (k = primeira; k.prox != j; k = k.prox)
				;
			j = k;
		}
	}

	public void teste2() {
		CCelulaDup i = primeira.prox;
		CCelulaDup j = ultima;
		CCelulaDup k;
		while (i != j && j.prox != i) {
			Object tmp = i.item;
			i.item = j.item;
			j.item = tmp;
			i = i.prox;
			for (k = primeira; k.prox != j; k = k.prox)
				;
			j = k;
		}
	}
	
	/**
	 * M??todo que busca e retorna a posi????o da primeira ocorrencia
	 * de um elemento passado por par??mentro.
	 * @return pos - posi????o do elemento
	 * se ele n??o existir, deve retornar o valor negativo -1;
	 */
	public int primeiraOcorrenciaDe(Object elemento) {
		int pos = 1;
		for (CCelulaDup aux = primeira.prox; aux != null; aux = aux.prox, pos++)
			if (elemento.equals(aux.item))
				return pos;
		return -1;
	}

	/**
	 * M??todo que busca e retorna a posi????o da ??ltima ocorrencia
	 * de um elemento passado por par??mentro.
	 * @return pos - posi????o do elemento
	 * se ele n??o existir, deve retornar o valor negativo -1;
	 */
	public int ultimaOcorrenciaDe(Object elemento) {
		int pos = 1;
		int posE = -1;
		for (CCelulaDup aux = primeira.prox; aux != null; aux = aux.prox, pos++)
			if (elemento.equals(aux.item))
				posE = pos;
		return posE;
	}
	
	/**
	 * M??todo para remover item na n-??sima posi????o - Exercicio 12
	 * Remove o item da posi????o passada por par??metro.
	 * @param n - n-??sima posi????o.
	 * @return sem retorno.
	**/
	public void RemovePos(int n) {
		if ((n >= 1) && (n <= qtde) && (primeira != ultima)) {
			CCelulaDup aux = primeira;
			for(int i = 0; i < n; i++)
				aux = aux.prox;
			aux.ant.prox = aux.prox;
			if (aux.prox != null)
				aux.prox.ant = aux.ant;
			else
				ultima.ant = aux;
			qtde--;
		}
	}
	
	/**
	 * Fun????o construtora a partir de um vetor.
	 * @param VET - vetor de objetos para construir a lista.
	**/
	CListaDup(Object[] VET){
		primeira = new CCelulaDup();
		ultima = primeira;
		for(int i = 0; i < VET.length; i++) {
			ultima.prox = new CCelulaDup(VET[i], ultima, null);
			ultima = ultima.prox;
			qtde++;
		}
	}
	
	/**
	 * M??todo limpa a Lista Dupla.
	**/
	public void Limpar() {
		primeira.prox = null;
		ultima = primeira;
		qtde = 0;
	}
	
	
	
}