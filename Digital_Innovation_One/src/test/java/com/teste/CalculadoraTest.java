package com.teste;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testSoma() {
		Calculadora calc = new Calculadora();
		int soma = calc.soma("1+1+3");
		assertEquals(5, soma);
	}
	
	@Test
	public void somarComMock() {
		Calculadora calc = mock(Calculadora.class);
		
		when(calc.soma("1+2")).thenReturn(10);
		
		int resultado = calc.soma("1+2");
		
		assertEquals(10, resultado);
	}

}
