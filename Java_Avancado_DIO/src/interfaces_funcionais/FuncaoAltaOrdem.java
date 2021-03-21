package interfaces_funcionais;


//Fun��o de alta ordem � uma fun��o que recebe outra fun��o
//ou que retorna outra fun��o



public class FuncaoAltaOrdem {

	public static void main(String[] args) {

		Calculate sum = (a,b) -> a+b;
		Calculate multiply = (a,b) -> a*b;
		Calculate subtract = (a,b) -> a-b;
		Calculate divide = (a,b) -> a/b;
		
		System.out.println(runOperation(sum, 1, 3));
		System.out.println(runOperation(multiply, 2, 4));
		System.out.println(runOperation(subtract, 5, 3));
		System.out.println(runOperation(divide, 8, 2));

	}
	
	public static int runOperation(Calculate operation, int a, int b) {
		return operation.calculate(a, b);
	}
	
	@FunctionalInterface
	interface Calculate {
		public int calculate(int a, int b);
	}

}
