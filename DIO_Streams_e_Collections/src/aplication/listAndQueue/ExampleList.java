package aplication.listAndQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExampleList {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		
		names.add("Carlos");
		names.add("Pedro");
		names.add("Juliana");
		names.add("Anderson");
		names.add("Maria");
		names.add("Jo�o");
		
		System.out.println(names);
		
		names.set(2, "Larissa"); //recebe um inteiro e um elemento. Modifica o valor da posi��o que quiser pelo elemento passado
		
		//ex: trocar Juliana por Larissa
		
//		a fun��o add adiciona determinador valores na lista, na ordem em que s�o adicionados.
		
		System.out.println(names);
		
		Collections.sort(names); //ordenador para a lista
		
		System.out.println(names);
		
		names.set(2, "Wesley"); //trocando Jo�o por Wesley
		
		System.out.println(names);
		
		names.remove(4); //remove um elemento de acordo com um �ndice ou de acordo com o valor do elemento
		
		//deve remover Maria
		
		System.out.println(names);
		
		names.remove("Wesley"); //removendo Wesley
		
		System.out.println(names);
		
		System.out.println(names.indexOf("Pedro")); //te retorna a posi��o de um elemento na lista. Caso o elemento n�o esteja na lista, retorna -1
		
		String nome = names.get(1); //retorna para uma vari�vel o elemento dado o �ndice passado
		
		System.out.println(nome); //retornando o valor Carlos que foi armazenado na posi��o 1
		
		int size = names.size(); //retorna n�mero inteiro dizendo quantos elementos h� na lista
		
		System.out.println(size);
		
		System.out.println(names.contains("Carlos")); //retorna um booleano de true ou false dependendo se um elemento existe na lista
		
		System.out.println(names.isEmpty()); //retorna um booleano se a lista est� vazia ou n�o
		
//		names.clear(); //limpa a lista de todos os elementos
//		
//		System.out.println(names);
		
		//exemplos de como iterar pela lista
		
		for(String n : names) {
			System.out.println(n);
		}
		
		Iterator<String> iterador = names.iterator(); //retorna um iterador de String
		
		while (iterador.hasNext()) { //retorna true enquanto tiver mais itens no iterador
			System.out.println("Com iterador: " + iterador.next());
		}
		
		List<String> newNames = new ArrayList<>();
		
		newNames.add("Igor");
		
		newNames.add("Ismael");
		
		newNames.addAll(names);

		System.out.println("New names = " + newNames);
	}

}
