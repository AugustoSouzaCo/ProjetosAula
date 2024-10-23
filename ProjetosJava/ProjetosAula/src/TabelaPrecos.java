import java.util.Scanner;

public class TabelaPrecos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[] tabela = new double[1000];
		int codigo = 0;
		
		do {
			System.out.println("Digite o código do produto: ");
			codigo = sc.nextInt();
			
			System.out.println("Digite o valor do produto: ");
			tabela[codigo] = sc.nextDouble();
			
			System.out.println("Digite <S> para mais produtos");
		} while (sc.next().equalsIgnoreCase("S"));
		sc.close();
		
		System.out.println("+=======+============+");
		System.out.println("| Código |	Valor	|");
		System.out.println("+=======+============+");
		for (int i = 0; i < tabela.length; i++) {
			if (tabela[i] > 0) {
				System.out.println(i + "\t R$ " + tabela[i] + "|");
			}
		}
		System.out.println("+=======+============+");
	}
}
