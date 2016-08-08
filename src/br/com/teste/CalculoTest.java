package br.com.teste;

import br.com.classe.Calculo;
import junit.framework.TestCase;

public class CalculoTest extends TestCase{
	public void testExecutaCalculo() {
		// Define os valores a serem testados
		float PassarValor1 = 10;
		float PassarValor2 = 5;
		float RetornoEsperado = 15;
		// Dispara o método "ExecutaCalculo" da "Calculo" e armazena 
		//resultado em uma variavel
		
		float RetornoFeito = Calculo.ExecutaCalculo(PassarValor1, PassarValor2);
		//compara o valor retornado com o que era esperado
		assertEquals(RetornoEsperado, RetornoFeito,0);
		
		
		
	}
	
}
