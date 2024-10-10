import java.util.Scanner;

public class SerieTaylor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double expoente = 0;
		double resultado = 0;
		
		System.out.println("Digite um expoente para a o número natural: ");
		expoente = sc.nextDouble();
		sc.close();
		
		for (int i = 0; i < 100; i++) { // j: qtd de elementos da série
			double exponenciacao = 1;
			double fatorial = 1;
			
			// calculating exponential 
			for (int j = 0; j < i; j++) { // i: qtd de multiplicações
				exponenciacao *= expoente;
			}
			for (int j = i; j > 0; j--) {
				fatorial *= j;
			}
			resultado += (exponenciacao / fatorial);
		}
		System.out.println("O resultado calculado por taylor é " + resultado);
		System.out.println("O resultado calculado por Java é " + Math.pow(Math.E, expoente));
	}
}
