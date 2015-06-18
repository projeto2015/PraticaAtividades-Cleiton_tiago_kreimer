package teste2015;

import junit.framework.TestCase;

import org.junit.Test;

public class ValidadorCPFTest extends TestCase {

	@Test
	public void testRetirarCaracteresInvalidos() {
		String cpfParaValidar = "833.853.878-76@#@#@#@#($&";
		String cpfAtual = ValidadorCPF.retiraCaracteresInvalidos(cpfParaValidar);
		String cpfEsperado = "83385387876";
		assertEquals(cpfEsperado, cpfAtual);
	}
	
	@Test
	public void testIsCPFPadraoByTodos() {
		String[] listCpfPadrao = new String[10];
		for (int i = 0; i < listCpfPadrao.length; i++) {
			listCpfPadrao[i] = (i+""+i+""+i+""+i+""+i+""+i+""+i+""+i+""+i+""+i+""+i).toString();
		}
		boolean isPadrao = false;
		for (int i = 0; i < listCpfPadrao.length; i++) {
			isPadrao = ValidadorCPF.isCPFPadrao(listCpfPadrao[i]);
			if (isPadrao == false) {
				return;
			}
		}
		assertTrue(isPadrao);
	}
	
	@Test
	public void testCalculaDigitoVerificador() {
		String cpfParaValidar = "635318113";
		String dgVerificadorRetornou = ValidadorCPF.calculaDigitoVerificador(cpfParaValidar);
		String dgEsperado = "20";
		assertEquals(dgEsperado, dgVerificadorRetornou);
	}
	
	@Test
	public void testValidaCPF() {
		String cpfParaValidar = "635.318.113-20";
		boolean cpfValidado = ValidadorCPF.validaCPF(cpfParaValidar);
		assertTrue(cpfValidado);
	}
	
	@Test
	public void testValidaCPFerrado(){
		String cpfParaValidar = "123.456.789-50";
		boolean cpfValidado = ValidadorCPF.validaCPF(cpfParaValidar);
			assertTrue(cpfValidado);
	}
}






















