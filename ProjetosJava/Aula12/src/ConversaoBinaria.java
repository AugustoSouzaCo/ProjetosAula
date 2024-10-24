import java.util.Scanner;

public class ConversaoBinaria {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int vetor[] = new int[1000];
		int tamanho = 0;
		
		System.out.println("Digite um número decimal: ");
		num = sc.nextInt();
		
		sc.close();
		do {
			vetor[tamanho] = (num % 2);
			num = num / 2;
			tamanho++;
		} while (num > 0);
		
		for (int i = (tamanho-1); i >= 0; i--) {
			System.out.print(vetor[i]);
		}
	}
}
