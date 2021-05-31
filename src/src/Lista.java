package src;

import java.util.Scanner;

/**
 *
 * @author Luana Campos Takeishi
 * @version 1.01 2021/5/27
 * Lista 2 - 2o semestre AEDII
 * 
 */
public class Lista {
	/**
	 * Função apara concatenar duas listas duplamente encadeada - Exercício 4
	 * Concatena as listas duplamente encadeadas passadas por parâmetro retornando o resultado.
	 * @param L1 - lista duplamente encadeada 1
	 * @param L2 - lista duplamente encadeada 2
	 * @return L2 - lista duplamente encadeada resultado da concatenação
	**/
	public static CListaDup ConcatenaLD(CListaDup L1, CListaDup L2) {
		CListaDup L3 = new CListaDup();
		//Concatena L1
		int i = 1;
		for (Object aux1 = L1.retornaIndice(i); aux1 != null; aux1 = L1.retornaIndice(++i))
			L3.insereFim(aux1);
		//Concatena L2
		i = 1;
		for (Object aux2 = L2.retornaIndice(i); aux2 != null; aux2 = L2.retornaIndice(++i))
			L3.insereFim(aux2);
		return L3;
	}
	
	/**
	 * Função apara concatenar duas filas - Exercício 5
	 * Concatena as filas passadas por parâmetro retornando o resultado.
	 * @param L1 - fila duplamente encadeada 1
	 * @param L2 - fila duplamente encadeada 2
	 * @return L2 - fila duplamente encadeada resultado da concatenação
	
	public static CFila ConcatenaFila(CFila F1, CFila F2) {
		CFila L3 = new CFila();
		//Concatena L1
		
		for (Object aux1 = Faux1.desenfileira(); aux1 != null; aux1 = Faux1.desenfileira())
			L3.enfileira(aux1);
		//Concatena L2
		CFila Faux2 = new CFila();
		Faux2 = F2;
		for (Object aux2 = Faux2.desenfileira(); aux2 != null; aux2 = Faux2.desenfileira())
			L3.enfileira(aux2);
		return L3;
	}**/
	
	
	/**
	 * Função apara concatenar duas pilhas - Exercício 6
	 * Concatena as pilhas duplamente encadeadas passadas por parâmetro retornando o resultado.
	 * @param L1 - pilha duplamente encadeada 1
	 * @param L2 - pilha duplamente encadeada 2
	 * @return L2 - pilha duplamente encadeada resultado da concatenação
	
	public static CPilha ConcatenaPilha(CPilha P1, CPilha P2) {
		CPilha L3 = new CPilha();
		//Concatena L1
		int i = 1;
		for (Object aux1 = L1.retornaIndice(i); aux1 != null; aux1 = L1.retornaIndice(++i))
			L3.empilha(aux1);
		//Concatena L2
		i = 1;
		for (Object aux2 = L2.retornaIndice(i); aux2 != null; aux2 = L2.retornaIndice(++i))
			L3.empilha(aux2);
		return L3;
	}**/
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		//Exercicio 1 - CLista
		/*System.out.println("Exercicio 1 - CLista");
		CLista l1 = new CLista();
		l1.insereFim(1);
		l1.insereFim(2);
		l1.insereFim(4);
		l1.insereFim(5);
		l1.imprimeFormatoLista("Lista criada");
		l1.InsereAntesDe(3, 4);
		l1.imprimeFormatoLista("\nLista após a inserção");
		*/
		
		//Exercicio 2 - CLista
		/*System.out.println("Exercicio 2 - CLista");
		CLista l1 = new CLista();
		l1.insereFim(1);
		l1.insereFim(2);
		l1.insereFim(3);
		l1.insereFim(5);
		l1.imprimeFormatoLista("Lista criada");
		l1.InsereDepoisDe(4, 3);
		l1.imprimeFormatoLista("\nLista após a inserção");
		*/
		
		//Exercicio 3 - CLista
		/*System.out.println("Exercicio 3 - CLista");
		CLista l1 = new CLista();
		l1.InsereOrdenado(4);
		l1.InsereOrdenado(1);
		l1.InsereOrdenado(3);
		l1.InsereOrdenado(2);
		l1.InsereOrdenado(5);
		l1.InsereOrdenado(3);
		l1.imprimeFormatoLista("Lista Ordenada criada");
		*/
		
		//Exercicio 4 - CListaDup
		/*System.out.println("Exercicio 4 - CListaDup");
		CListaDup A = new CListaDup();
		A.insereFim(19);
		A.insereFim(33);
		A.insereFim(2);
		A.insereFim(4);
		CListaDup B = new CListaDup();
		B.insereFim(1);
		B.insereFim(2);
		B.insereFim(3);
		B.insereFim(4);
		B.insereFim(5);
		CListaDup AmaisB;
		AmaisB = ConcatenaLD(A,B);
		A.imprimeFormatoLista("Lista A");
		B.imprimeFormatoLista("Lista B");
		AmaisB.imprimeFormatoLista("Lista A+B - Concatenada");
		*/
		
		//Exercicio 5 - CFila
		/*System.out.println("Exercicio 5 - CFila");
		CFila A = new CFila();
		A.enfileira(19);
		A.enfileira(33);
		A.enfileira(2);
		A.enfileira(4);
		CFila B = new CFila();
		B.enfileira(1);
		B.enfileira(2);
		B.enfileira(3);
		B.enfileira(4);
		B.enfileira(5);
		CFila AmaisB;
		AmaisB = ConcatenaFila(A,B);
		A.imprimeFormatoFila("Fila A");
		B.imprimeFormatoFila("Fila B");
		AmaisB.imprimeFormatoFila("Fila A+B - Concatenada");*/
		
		//Exercicio 6 - CPilha
		/*System.out.println("Exercicio 6 - CPilha");
		CPilha A = new CPilha();
		A.empilha(19);
		A.empilha(33);
		A.empilha(2);
		A.empilha(4);
		CPilha B = new CPilha();
		B.empilha(1);
		B.empilha(2);
		B.empilha(3);
		B.empilha(4);
		B.empilha(5);
		CPilha AmaisB;
		AmaisB = ConcatenaPilha(A,B);
		A.imprimeFormatoPilha("Pilha A");
		B.imprimeFormatoPilha("Pilha B");
		AmaisB.imprimeFormatoPilha("Pilha A+B - Concatenada");*/
		
		//Exercicio 7 - RandomQueue
		/*System.out.println("Exercicio 7 - RandomQueue");
		RandomQueue RQ = new RandomQueue();
		for(int i = 1; i <= 5; i++)
		 	RQ.Enqueue(i);
		RQ.imprimeFormatoLista("Lista");
		System.out.println("Remove e retorna um elemento qualquer = "+RQ.Dequeue());
		RQ.imprimeFormatoLista("Lista após a remoção");
		System.out.println("Retorna um elemento sem remover = "+RQ.Sample());
		RQ.imprimeFormatoLista("Lista após retorno");*/
		
		//Exercicio 8 - CListaDup
		/*System.out.println("Exercicio 8 - CListaDup");
		CListaDup O = new CListaDup();
		O.insereFim(1);
		O.insereFim(2);
		O.insereFim(3);
		O.insereFim(3);
		O.insereFim(2);
		O.insereFim(4);
		O.imprimeFormatoLista("Lista");
		System.out.println("Primeira ocorrencia de 0: "+O.primeiraOcorrenciaDe(0));
		System.out.println("Primeira ocorrencia de 1: "+O.primeiraOcorrenciaDe(1));
		System.out.println("Primeira ocorrencia de 2: "+O.primeiraOcorrenciaDe(2));
		System.out.println("Primeira ocorrencia de 3: "+O.primeiraOcorrenciaDe(3));
		System.out.println("Primeira ocorrencia de 4: "+O.primeiraOcorrenciaDe(4));
		System.out.println("Primeira ocorrencia de 5: "+O.primeiraOcorrenciaDe(5));*/
		
		//Exercicio 9 - CListaDup
		/*System.out.println("Exercicio 9 - CListaDup");
		CListaDup O = new CListaDup();
		O.insereFim(1);
		O.insereFim(2);
		O.insereFim(3);
		O.insereFim(3);
		O.insereFim(2);
		O.insereFim(4);
		O.insereFim(2);
		O.imprimeFormatoLista("Lista");
		System.out.println("Ultima ocorrencia de 0: "+O.ultimaOcorrenciaDe(0));
		System.out.println("Ultima ocorrencia de 1: "+O.ultimaOcorrenciaDe(1));
		System.out.println("Ultima ocorrencia de 2: "+O.ultimaOcorrenciaDe(2));
		System.out.println("Ultima ocorrencia de 3: "+O.ultimaOcorrenciaDe(3));
		System.out.println("Ultima ocorrencia de 4: "+O.ultimaOcorrenciaDe(4));
		System.out.println("Ultima ocorrencia de 5: "+O.ultimaOcorrenciaDe(5));*/
		
		//Exercicio 10 - Deque
		/*System.out.println("Exercicio 10 - Deque");
		Deque deq = new Deque();
		deq.imprimeFormatoLista("\nDeque Inicial:");
		System.out.println("Vazia? "+deq.isEmpty());
		deq.pushLeft(2);
		deq.pushLeft(1);
		deq.pushRight(3);
		deq.pushRight(4);
		deq.imprimeFormatoLista("\nPush Deque:");
		System.out.println("Quantidade de itens: "+deq.size());
		deq.popLeft();
		deq.popRight();
		deq.imprimeFormatoLista("\nPop Deque:");
		System.out.println("Quantidade de itens: "+deq.size());
		System.out.println("\nVazia? "+deq.isEmpty());*/
		
		//Exercicio 11 - CLista
		/*System.out.println("Exercicio 11 - CLista");
		CLista cl = new CLista();
		for(int i = 1; i <= 6; i++)
		 	cl.insereComeco(i);
		cl.imprimeFormatoLista("Lista");
		cl.RemovePos(6);
		cl.RemovePos(1);
		cl.RemovePos(3);
		cl.imprimeFormatoLista("Lista após remoções");*/
		
		//Exercicio 12 - CListaDup
		/*System.out.println("Exercicio 12 - CListaDup");
		CListaDup cld = new CListaDup();
		for(int i = 1; i <= 6; i++)
			cld.insereFim(i);
		cld.imprimeFormatoLista("Lista");
		cld.RemovePos(6);
		cld.RemovePos(1);
		cld.RemovePos(3);
		cld.imprimeFormatoLista("Lista após remoções");*/
		
		//Exercicio 13 - CFila
		/*System.out.println("Exercicio 13 - CFila");
		CFila oc = new CFila();
		oc.enfileira(1);
		oc.enfileira(2);
		oc.enfileira(2);
		oc.enfileira(4);
		oc.enfileira(3);
		oc.enfileira(4);
		oc.enfileira(5);
		oc.enfileira(2);
		oc.imprimeFormatoFila("Fila");
		System.out.println("1: "+oc.qtdeOcorrencias(1)+" aparições.");
		System.out.println("2: "+oc.qtdeOcorrencias(2)+" aparições.");
		System.out.println("4: "+oc.qtdeOcorrencias(4)+" aparições.");*/
		
		//Exercicio 14 - CPilha
		/*System.out.println("Exercicio 14 - CPilha");
		CPilha ci = new CPilha();
		for(int i = 0; i <= 6; i++)
			ci.empilha(i);
		ci.imprimeFormatoPilha("Pilha");
		ci.inverte(); 
		ci.imprimeFormatoPilha("Pilha Invertida");*/
		
		//Exercicio 15 - CFila
		/*System.out.println("Exercicio 15 - CFila");
		CFila cf = new CFila();
		for(int i = 0; i <= 6; i++)
			cf.enfileira(i);
		cf.imprimeFormatoFila("Fila");
		cf.inverte(); 
		cf.imprimeFormatoFila("\nFila Invertida");*/
		
		//Exercicio 16 - CLista
		/*System.out.println("Exercicio 16 - CLista");
		CLista v = new CLista();
		for(int i = 0; i <= 6; i++)
			v.insereFim(i);
		v.imprimeFormatoLista("Lista:");
		Object[] vector = v.copiaParaVetor();
		System.out.print("Vetor = { ");
		for(int i = 0; i < vector.length; i++)
			System.out.print(vector[i]+" ");
		System.out.println("}");*/
		
		
		
		//Exercicio 30 - CCelulaDicionario e CDicionario
		/*System.out.println("Exercicio 30 - CCelulaDicionario e CDicionario");
		CDicionario SiteIp = new CDicionario();
		System.out.println("Dicionário vazio? " + SiteIp.vazio() + "\n");
		SiteIp.adiciona("www.google.com", "2800:3f0:4004:802::2004");
		SiteIp.adiciona("www.yahoo.com", "2001:4998:124:1507::f001");
		SiteIp.adiciona("www.amazon.com", "23.32.229.221");
		SiteIp.adiciona("www.uol.com.br", "2600:9000:21ed:4c00:1:5a19:8b40:93a1");
		SiteIp.adiciona("www.pucminas.br", "200.229.32.29");
		SiteIp.adiciona("www.microsoft.com", "2600:1419:3c00:281::356e");
		SiteIp.adiciona("research.microsoft.com", "13.67.218.189");
		SiteIp.adiciona("www.hotmail.com", "2620:1ec:c11::212");
		SiteIp.adiciona("www.gmail.com", "2800:3f0:4004:80a::2005");
		SiteIp.adiciona("www.twitter.com", "104.244.42.129");
		SiteIp.adiciona("www.facebook.com", "2a03:2880:f1ff:83:face:b00c:0:25de");
		SiteIp.adiciona("www.cplusplus.com", "2607:5300:60:5d9b:c::");
		SiteIp.adiciona("www.youtube.com", "2800:3f0:4004:802::200e");
		SiteIp.adiciona("www.brasil.gov.br", "170.246.255.242");
		SiteIp.adiciona("www.whitehouse.gov", "2600:1419:3c00:296::fc4");
		SiteIp.adiciona("www.capes.gov.br", "200.130.18.234");
		SiteIp.adiciona("www.wikipedia.com", "2620:0:861:ed1a::9");
		SiteIp.adiciona("www.answers.com", "151.101.176.203");
		SiteIp.adiciona("www.apple.com", "2600:1419:3c00:285::1aca");		
		SiteIp.adiciona("www.instagram.com", "2a03:2880:f2ff:e0:face:b00c:0:4420");
		SiteIp.adiciona("www.linkedin.com", "2620:1ec:21::14");
		SiteIp.adiciona("stackoverflow.com", "151.101.65.69");
		SiteIp.adiciona("track.toggl.com", "34.120.83.142");
		SiteIp.adiciona("pucminas.instructure.com", "3.214.108.240");
		SiteIp.adiciona("www.instagram.com", "151.101.177.164");//repetido para teste
		SiteIp.imprimeFormatoDicio("Dicionário de Sites e seus Ips:");
		System.out.println("\nDicionário vazio? " + SiteIp.vazio());
		System.out.println("\nSite: track.toggl.com \t IP:" + SiteIp.recebeValor("track.toggl.com"));*/
		
		//Exercicio 31 - CCelulaDicionario e CDicionario
		/*System.out.println("Exercicio 31 - CCelulaDicionario e CDicionario");
		CDicionario amino = new CDicionario();
		//Cadastro
		amino.adiciona("UUU","Fenilalanina");	amino.adiciona("UUC","Fenilalanina");	amino.adiciona("UUA","Leucina");		amino.adiciona("UUG","Leucina");
		amino.adiciona("CUU","Leucina");		amino.adiciona("CUC","Leucina"); 		amino.adiciona("CUA","Leucina");		amino.adiciona("CUG","Leucina");
		amino.adiciona("AUU","Isoleucina");		amino.adiciona("AUC","Isoleucina"); 	amino.adiciona("AUA","Isoleucina");		amino.adiciona("AUG","Metionina");
		amino.adiciona("GUU","Valina");		amino.adiciona("GUC","Valina"); 		amino.adiciona("GUA","Valina");		amino.adiciona("GUG","Valina");
		amino.adiciona("UCU","Serina");		amino.adiciona("UCC","Serina"); 		amino.adiciona("UCA","Serina");		amino.adiciona("UCG","Serina");
		amino.adiciona("CCU","Prolina");	amino.adiciona("CCC","Prolina");	 	amino.adiciona("CCA","Prolina");	amino.adiciona("CCG","Prolina");
		amino.adiciona("ACU","Treonina");	amino.adiciona("ACC","Treonina"); 		amino.adiciona("ACA","Treonina");	amino.adiciona("ACG","Treonina");
		amino.adiciona("GCU","Alanina");	amino.adiciona("GCC","Alanina");		amino.adiciona("GCA","Alanina");	amino.adiciona("GCG","Alanina");
		amino.adiciona("UAU","Tirosina");	amino.adiciona("UAC","Tirosina"); 		amino.adiciona("UAA","Ocre/Parada");	amino.adiciona("UAG","Âmbar/Parada");
		amino.adiciona("CAU","Histidina");	amino.adiciona("CAC","Histidina"); 		amino.adiciona("CAA","Glutamina");		amino.adiciona("CAG","Glutamina");
		amino.adiciona("AAU","Asparagina");	amino.adiciona("AAC","Asparagina"); 	amino.adiciona("AAA","Lisina");			amino.adiciona("AAG","Lisina");
		amino.adiciona("GAU","Ácido aspártico");	amino.adiciona("GAC","Ácido aspártico"); 	amino.adiciona("GAA","Ácido glutâmico");	amino.adiciona("GAG","Ácido glutâmico");
		amino.adiciona("UGU","Cisteína");	amino.adiciona("UGC","Cisteína"); 	amino.adiciona("UGA","Opala/Parada");	amino.adiciona("UGG","Triptofano");
		amino.adiciona("CGU","Arginina");	amino.adiciona("CGC","Arginina"); 	amino.adiciona("CGA","Arginina");		amino.adiciona("CGG","Arginina");
		amino.adiciona("AGU","Serina");		amino.adiciona("AGC","Serina"); 	amino.adiciona("AGA","Arginina");		amino.adiciona("AGG","Arginina");
		amino.adiciona("GGU","Glicina");	amino.adiciona("GGC","Glicina"); 	amino.adiciona("GGA","Glicina");		amino.adiciona("GGG","Glicina");
		amino.imprimeFormatoCodao("Codão - código genético:");
		Object i = 0;
		System.out.println("\nDicionário de código genético:");
		System.out.println("Entre com a trinca para receber o nome do aminoácido\nou com outro valor para parar a execução.");
		while(i != null) {
			System.out.println("\nDigite a trinca:");
			i = amino.recebeValor(scan.nextLine());
			System.out.println("Aminoácido: " + i);
		}*/
		
		//Exercicio 32 - CListaSimples
		/*System.out.println("Exercicio 32 - CListaSimples");
		CListaSimples ls = new CListaSimples();
		System.out.println("Lista vazia? " + ls.vazia());
		ls.insereComeco(2);
		ls.insereFim(3);
		ls.insereComeco(1);
		ls.insereFim(4);
		ls.insereFim(5);
		System.out.println("Lista apos inserir:");
		ls.imprime();
		System.out.println("Remove começo: " + ls.removeComeco());
		System.out.println("Remove fim: " + ls.removeFim());
		System.out.println("Lista apos remover:");
		ls.imprime();
		System.out.println("Lista vazia? " + ls.vazia());*/
		
		scan.close();
	}
}
