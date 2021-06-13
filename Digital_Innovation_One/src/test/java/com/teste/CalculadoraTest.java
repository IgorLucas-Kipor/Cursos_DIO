package com.teste;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testSoma() {
		Calculadora calc = new Calculadora();
		int soma = calc.soma("1+1+3");
		assertEquals(5, soma);
	}

}
