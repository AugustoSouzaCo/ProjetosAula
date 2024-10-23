import java.util.Scanner;

public class Main03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numFuncionario;
		double salarioInicial;
		double salarioAtualizado;
		
		System.out.println("""
				Digite a função do funcionário
				1 : Orelha Seca
				2 : Gerente
				3 : Dono
				""");
		numFuncionario = scanner.nextInt();
		
		System.out.println("\nDigite o salário inicial desse funcionário");
		salarioInicial = scanner.nextDouble();
		scanner.close();
		
		if (numFuncionario == 1) {
			salarioAtualizado = salarioInicial * 1.1; 
		} else if (numFuncionario == 2) {
			salarioAtualizado = salarioInicial * 1.2;
		} else {
			salarioAtualizado = salarioInicial * 1.5;
		}
		
		System.out.println("O salário atualizado desse funcionário é: R$" + salarioAtualizado);
		
	}
}
