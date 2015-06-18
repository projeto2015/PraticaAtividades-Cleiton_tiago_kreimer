package teste2015;

public class ValidadorCPF {
	public static void main(String[] args) {
        System.out.println(validaCPF("833.853.878-76"));
}

public static String retiraCaracteresInvalidos(String cpf) {
        return cpf.replaceAll("\\D", "");
}


public static boolean validaCPF(String cpf) {
        cpf = retiraCaracteresInvalidos(cpf);
        if (cpf == null || cpf.length() != 11 || isCPFPadrao(cpf))
                return false;

        try {
                Long.parseLong(cpf);
        } catch (NumberFormatException e) {
                return false;
        }
        
        return calculaDigitoVerificador(cpf.substring(0, 9)).equals(cpf.substring(9, 11));
}


public static boolean isCPFPadrao(String cpf) {
        if (cpf.equals("11111111111") || cpf.equals("22222222222")
                        || cpf.equals("33333333333") || cpf.equals("44444444444")
                        || cpf.equals("55555555555") || cpf.equals("66666666666")
                        || cpf.equals("77777777777") || cpf.equals("88888888888")
                        || cpf.equals("99999999999") || cpf.equals("00000000000")) {

                return true;
        }

        return false;
}

public static String calculaDigitoVerificador(String num) {
        Integer primDig, segDig;
        int soma = 0, peso = 10;
        for (int i = 0; i < num.length(); i++)
                soma += Integer.parseInt(num.substring(i, i + 1)) * peso--;

        if (soma % 11 == 0 || soma % 11 == 1)
                primDig = new Integer(0);
        else
                primDig = new Integer(11 - (soma % 11));

        soma = 0;
        peso = 11;
        for (int i = 0; i < num.length(); i++)
                soma += Integer.parseInt(num.substring(i, i + 1)) * peso--;
        soma += primDig.intValue() * 2;
        if (soma % 11 == 0 || soma % 11 == 1)
                segDig = new Integer(0);
        else
                segDig = new Integer(11 - (soma % 11));

        return primDig.toString() + segDig.toString();
}

}
