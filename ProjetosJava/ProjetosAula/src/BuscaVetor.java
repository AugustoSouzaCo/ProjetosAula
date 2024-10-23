import java.util.Scanner;

public class BuscaVetor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int vetor[] = new int[100000];
		int valorProcurado = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * vetor.length);
		}
		while (valorProcurado != -1) {
			System.out.println("Digite um valor a ser procurado:");
			valorProcurado = sc.nextInt();
			sc.close();
			
			boolean achou = false;
			for (int i = 0; i < vetor.length; i++) {
				if (vetor[i] == valorProcurado) {
					achou = true;
				}
			}
			if (achou) {
				System.out.println("Achei esse número");
			} else {
				System.out.println("Num tem");
			}
		}
	}
}
