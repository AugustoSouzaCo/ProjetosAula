import java.util.Scanner;

public class Banco {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o saldo inicial");
		
		double saldoInicial = sc.nextDouble();
		
		int operacao = 0;
		double valor = 0;
		double saldoAtualizado = 0;
		double juro = 0;
		
		System.out.println("""
				******************************
				Selecione a operação
				1 - Saque
				2 - Depósito
				3 - juro
				******************************
				""");
		
		operacao = sc.nextInt();
		
		if (operacao == 1 || operacao == 2) {
			System.out.println("Digite o valor da operação");
			valor = sc.nextDouble();
			if (operacao == 1) {
				saldoAtualizado = saldoInicial - valor;
			} else saldoAtualizado = saldoInicial + valor;
		} else {
			System.out.println("Digite a porcentagem do juros sobre o saldo inicial");
			juro = sc.nextDouble();
			saldoAtualizado = saldoInicial + ((saldoInicial * juro) /100);
		}	
		sc.close();
		System.out.println("Saldo atualizado: " + saldoAtualizado);
	}	
}
