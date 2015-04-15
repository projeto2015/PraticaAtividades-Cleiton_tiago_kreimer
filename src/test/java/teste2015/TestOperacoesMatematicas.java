package teste2015;

import org.junit.Test;

import junit.framework.TestCase;

public class TestOperacoesMatematicas  extends TestCase{
@Test
	public static void testcertoSomaDoisValoresReais(){
		double num1 = 15.6;
		double num2 = 15.4;
		double valorEsperado = 31.0;
		double valorAtual = OperacoesMatematicas.somaDoisValoresReais(num1, num2);
		assertEquals(valorEsperado, valorAtual);
}
		@Test
		public static void testerradoSomaDoisValoresReais(){
			double num1 = 30.6;
			double num2 = 15.4;
			double valorEsperado = 31.0;
			double valorAtual = OperacoesMatematicas.somaDoisValoresReais(num1, num2);
			assertEquals(valorEsperado, valorAtual);
	}
		@Test
		public static void test1SomaDoisValoresReais(){
			double num1 = 30.6;
			double num2 = 15.4;
			double valorEsperado = 46.0;
			double valorAtual = OperacoesMatematicas.somaDoisValoresReais(num1, num2);
			assertEquals(valorEsperado, valorAtual);
	}
		@Test
		public static void test2SomaDoisValoresReais(){
			double num1 = 15.4;
			double num2 = 15.4;
			double valorEsperado = 30.8;
			double valorAtual = OperacoesMatematicas.somaDoisValoresReais(num1, num2);
			assertNotSame(valorEsperado, valorAtual);
	}
		
		
@Test
public static void testSubtrairDoisValoresReais(){
	double num1 = 10.0;
	double num2 = 5.0;
	double valorEsperado = 5.0;
	double valorAtual= OperacoesMatematicas.SubtrairDoisValoresReais(num1, num2);
}
}


