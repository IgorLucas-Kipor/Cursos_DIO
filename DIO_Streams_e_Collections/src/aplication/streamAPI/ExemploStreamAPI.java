package aplication.streamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStreamAPI {

	public static void main(String[] args) {

		// Criando a cole��o de estudantes
		List<String> estudantes = new ArrayList<>();
		
		// Adicionando estudantes para a cole��o
		
		estudantes.add("Pedro");
		estudantes.add("Diego");
		estudantes.add("Ana");
		estudantes.add("Rodrigo");
		estudantes.add("Juliana");
		estudantes.add("Thiago");
		estudantes.add("Maria");
		
		// Retornando a contagem de elementos do stream
		
		System.out.println("Contagem: " + estudantes.stream().count());
		
		System.out.println();
		
		// Retornando o elemento com maior n�mero de letras
		
		System.out.println("Maior n�mero de letras: " + estudantes.stream().max(Comparator.comparingInt(String::length)));
		
		System.out.println();
		
		// Retornando o elemento com menor n�mero de letras

		System.out.println("Menor n�mero de letras: " + estudantes.stream().min(Comparator.comparingInt(String::length)));
		
		System.out.println();
		
		// Retorna os elementos com a letra R no nome
		
		System.out.println("Com R no nome: " + estudantes.stream().filter((estudante) -> estudante.toLowerCase().contains("r")).collect(Collectors.toList()));
		
		System.out.println();
		
		// Retorna uma nova cole��o concatenando os nomes com a quantidade de letras contida em cada nome
		
		System.out.println("Concaten��o nomes e quantia de letras: " + estudantes.stream().map(estudante -> estudante.concat(" - ").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));
		
		System.out.println();
		
		// Retorna somente os tr�s primeiros elementos da cole��o
		
		System.out.println("Retorna os tr�s primeiros elementos: " + estudantes.stream().limit(3).collect(Collectors.toList()));
		
		System.out.println();
		
		// Exibe cada elemento no console e depois retorna a sua mesma cole��o
		
		System.out.println("Retorna os elementos: " + estudantes.stream().peek(System.out::println).collect(Collectors.toList()));
		
		System.out.println();
		
		// Exibe cada elemento sem retornar outra cole��o
		
		System.out.println("Retorna os elementos novamente:");
		estudantes.stream().forEach(System.out::println);
		
		System.out.println();
		
		// Retorna true se todos os nomes tiverem a letra W
		
		System.out.println("Retorna true se todos tiverem W: " + estudantes.stream().allMatch((elemento) -> elemento.contains("W")));
		
		System.out.println();
		
		// Retorna true se algum dos elementos possui a letra a min�scula no nome
		
		System.out.println("Retorna true se tiver a: " + estudantes.stream().anyMatch((elemento) -> elemento.contains("a")));
		
		System.out.println();
		
		// Retorna true se nenhum elemento possui a letra a min�scula no nome
		
		System.out.println("Retorna true se n�o tiver a: " + estudantes.stream().noneMatch((elemento) -> elemento.contains("a")));
		
		System.out.println();
		
		// Retorna o primeiro elemento da cole��o, se existir exibe no console
		
		System.out.println("O primeiro elemento da cole��o: ");
		estudantes.stream().findFirst().ifPresent(System.out::println);
		
		System.out.println();
		
		// Exemplo de opera��o encadeada
		
		System.out.println("Opera��o encadeada: ");
		System.out.println(estudantes.stream()
				.peek(System.out::println)
				.map(estudante -> 
				estudante.concat(" - ").concat(String.valueOf(estudante.length())))
				.peek(System.out::println)
				.filter((estudante) -> 
				estudante.toLowerCase().contains("r"))
				.collect(Collectors.toList()));
	}

}
