package src;
import java.util.Random;

/**
 *  
 * @author Luana Campos Takeishi
 * @version 1.01 2021/5/29
 * Lista 2 - 2o semestre AEDII
 * 
 */

public class RandomQueue {
	private CCelula comeco; // Celula cabeca.
	private CCelula fim; // Ultima celula.
	private int q;
	
	/**
	 * Fun��o construtora. 
	 * Cria a c�lula cabe�a e faz as refer�ncias 
	 * comeco e fim apontarem para ela.
	 * Fila aleat�ria vazia.
	 */
	public RandomQueue() {
		comeco = new CCelula();
		fim = comeco;
	}
	
	/**
	 * Verifica se a fila est� vazia.
	 * @return Retorna TRUE se a fila estiver vazia 
	 * e FALSE se conter elementos.
	 */
	public boolean IsEmpty() {
		return comeco == fim;
	}
	
	/**
	 * Insere um novo Item no fim da fila.
	 * @param item - object com o valor a 
	 * ser inserido no final da fila.
	 */
	public void Enqueue(Object item) {
		fim.prox = new CCelula(item);
		fim = fim.prox;
		q++;
	}
	
	/**
	 * Retira e retorna um elemento aleat�rio da fila.
	 * @return item retirado aleatoriamente da fila,
	 * se a fila estiver vazia, retorna null.
	 */
	public Object Dequeue() {
		Random rand = new Random();
		int posicao = rand.nextInt(q);
		CCelula item = null;
		if (comeco != fim) {
			int i = 0;
			CCelula aux = comeco;
			while (i < posicao) {
				aux = aux.prox;
				i++;
			}
			item = aux.prox;
			aux.prox = aux.prox.prox;
			if (aux.prox == null)
				fim = aux;
			q--;
		}
		return item.item;
	}
	
	/**
	 * Retorna um elemento aleat�rio da fila sem remov�-lo.
	 * @return item aleat�rio da fila,
	 * se a fila estiver vazia, retorna null.
	 */
	public Object Sample() {
		Random rand = new Random();
		int posicao = rand.nextInt(q);
		CCelula item = null;
		if (comeco != fim) {
			item = comeco.prox;
			for (int i = 1; i <= posicao; i++, item = item.prox);
		}
		return item.item;
	}

	/**
	 * Imprime todos os elementos simulando formato de lista:
	 * [/]->[x]->[y]->[z]->null
	 */
	public void imprimeFormatoLista(String titulo) {
		System.out.println(titulo);
		System.out.print("[/]->");
		for (CCelula aux = comeco.prox; aux != null; aux = aux.prox)
			System.out.print("[" + aux.item + "]->");
		System.out.println("null\n");
	}
	
	
}
