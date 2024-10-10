import java.util.Scanner;

public class Main02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número inteiro");
		
		int num = scanner.nextInt();
		boolean verificacaoParidade;
		String tipoNum;
		
		if (num == 0) {
			tipoNum = "nulo";
		} else if (num > 0) {
			tipoNum = "positivo";
		} else {
			tipoNum = "negativo";
		}
		
		if (num % 2 == 0) {
			verificacaoParidade = true;
		} else {
			verificacaoParidade = false;
		}
		scanner.close();
		String paridadeNum = (verificacaoParidade)? "par" : "ímpar";
		System.out.println("Esse número é "+ tipoNum + " e " +paridadeNum);		
	}
}
