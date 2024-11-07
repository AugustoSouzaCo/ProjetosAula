import java.io.BufferedReader;
import java.io.InputStreamReader;

public class VerificaCpf {
	public static String calcularDV(String cpf) {
		int dv1 = 0;
		int dv2 = 0;
		int soma = 0;
		// primeiro digito verificador
		for (int i = 0; i < cpf.length(); i++) {
			soma += ((10-i) * Integer.parseInt(cpf.substring(i, i + 1)));
		}
		dv1 = 11 - (soma % 11);
		if (dv1 >= 10) {
			dv1 = 0;
		}
		
		cpf = cpf + dv1;
		soma = 0;
		// segundo digito verificador
		for (int i = 0; i < cpf.length(); i++) {
			soma += ((11-i) * Integer.parseInt(cpf.substring(i, i + 1)));
		}
		dv2 = 11 - (soma % 11);
		if (dv2 >= 10) {
			dv2 = 0;
		}
		return ("" + dv1 + dv2);
	}
	
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String cpf = "";
		
		try {
			System.out.println("Digite o cpf sem o dv: ");
			cpf = reader.readLine();
			
			System.out.println(cpf + "-" + calcularDV(cpf));
			} catch ( Exception e) {
			System.out.println(e);
		}
	}
}
