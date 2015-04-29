package teste2015;

import org.junit.Test;

import junit.framework.TestCase;

public class TestOperacoesMatematicas extends TestCase {
	@Test
	public static void testcertoSomaDoisValoresReais() {
		double num1 = 15.6;
		double num2 = 15.4;
		double valorEsperado = 31.0;
		double valorAtual = OperacoesMatematicas.somaDoisValoresReais(num1,
				num2);
		assertEquals(valorEsperado, valorAtual);
	}

	@Test
	public static void testSomaDoisValoresReais() {
		double num1 = 3.99;
		double num2 = 1.01;
		double valorExperado = 5.0;
		double valorAtual = OperacoesMatematicas.somaDoisValoresReais(num1,
				num2);
		assertEquals(valorExperado, valorAtual);
	}

	@Test
	public static void testSubtrairDoisValoresReais() {
		double num1 = 10.0;
		double num2 = 5.0;
		double valorEsperado = 5.0;
		double valorAtual = OperacoesMatematicas.SubtrairDoisValoresReais(num1,
				num2);
	}

	@Test(expected = NumberFormatException.class)
	public static void testSomaDoisValoresNulos() {
		try {
			OperacoesMatematicas.somaDoisValoresReais(null, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals(null, null);
	}

	@Test(expected = NumberFormatException.class)
	public static void testSomaDoisValoresComUmNulo() {
		try {
			assertEquals(5d,
					OperacoesMatematicas.somaDoisValoresReais(5d, null));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(expected = NumberFormatException.class)
	public static void testeMultiplicacaoUmvalorNulo() {
		try {
			assertEquals(10d,
					OperacoesMatematicas.multiplicaDoisValoresReais(10d, null));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public static void testSomaDoisValoresComResultadoErrado() {
		double num1 = 15;
		double num2 = 30;
		double valorExperado = 30;
		double valorAtual = OperacoesMatematicas.somaDoisValoresReais(num1,
				num2);
		assertTrue("Somando errado.", valorExperado != valorAtual);
	}

	@Test
	public static void testSomaDoisValoresmaioreserrados() {
		double num1 = 1.111111;
		double num2 = 2.222222;
		double valorExperado = 5.0;
		double valorAtual = OperacoesMatematicas.somaDoisValoresReais(num1,
				num2);
		assertTrue("Erro na soma dos valores.", valorExperado != valorAtual);
	}

	@Test
	public static void testValidaMultiplicacao() {
		double num1 = 100;
		double num2 = 3;
		double valorExperado = 300;
		double valorAtual = OperacoesMatematicas.multiplicaDoisValoresReais(
				num1, num2);
		assertEquals(valorExperado, valorAtual);
	}

	@Test
	public static void testerramultiplicacao() {
		double num1 = 5;
		double num2 = 3;
		double valorExperado = 20;
		double valorAtual = OperacoesMatematicas.multiplicaDoisValoresReais(
				num1, num2);
		assertTrue(valorExperado != valorAtual);
	}

	@Test
	public static void testdivisao() {
		double num1 = 15;
		double num2 = 3;
		double valorExperado = 5;
		double valorAtual = OperacoesMatematicas.divideDoisValoresReais(num1,
				num2);
		assertEquals(valorExperado, valorAtual);
	}

	@Test(expected = NumberFormatException.class)
	public static void testDivideDoisValoresComUmNulo() {
		try {
			assertEquals(null,
					OperacoesMatematicas.divideDoisValoresReais(null, 15d));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(expected = NumberFormatException.class)
	public static void testdivisaoporzero() {
		try {
			OperacoesMatematicas.divideDoisValoresReais(15d, 0d);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
