package teste2015;

public class OperacoesMatematicas {
	
	public static void main (String[] args) {
		System.out.println(somaDoisValoresReais(15.6, 15.4));
	}
	public static double somaDoisValoresReais(Double num1, Double num2) {
	if (num1 != null && num2 != null){
		return num1 + num2;
	}
	throw new NumberFormatException("Numero digitado e invalido");
	}
	
public static double SubtrairDoisValoresReais(Double num1, Double num2) {
if (num1 != null && num2 != null){
	return num1 - num2;
}
throw new NumberFormatException("Numero digitado e invalido");
}
}