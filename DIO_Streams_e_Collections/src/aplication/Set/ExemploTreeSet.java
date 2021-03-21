package aplication.Set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTreeSet {

	public static void main(String[] args) {

		TreeSet<String> capitais = new TreeSet<>();
		
		//Monta a �rvore com as capitais
		capitais.add("S�o Paulo");
		capitais.add("Belo Horizonte");
		capitais.add("Rio de Janeiro");
		capitais.add("Salvador");
		capitais.add("Jo�o Pessoa");
		capitais.add("Florianop�lis");
		
		System.out.println(capitais);
		
		//imprime capital no topo da �rvore
		
		System.out.println(capitais.first());
		
		//retorna a capital no final da �rvore
		
		System.out.println(capitais.last());
		
		//retorna a primeira capital abaixo na �rvore da capital parametrizada
		
		System.out.println(capitais.lower("Rio de Janeiro"));
		
		//retorna a primeira capital acima na �rvore da capital parametrizada
		
		System.out.println(capitais.higher("Rio de Janeiro"));
		
		//retorna a primeira capital no topo da �rvore, removendo o elementos
		
		System.out.println(capitais.pollFirst());
		
		System.out.println(capitais);
		
		//retorna a capital no final da �rvore, removendo o elemento
		
		System.out.println(capitais.pollLast());
		
		System.out.println(capitais);
		
		//navegando com iterador
		
		Iterator<String> iterador = capitais.iterator();
		
		while(iterador.hasNext()) {
			System.out.println(iterador.next());
		}

	}

}
