
import java.util.Scanner;

public class PreencheVetor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vetor[] = new int[5];
		int vetorInvertido[] = new int[5];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite o valor da posição " + i + " do vetor: ");
			vetor[i] = sc.nextInt();
		}
		sc.close();
		
		for (int j = 0; j < vetorInvertido.length; j++) {
			vetorInvertido[j] = vetor[vetor.length - 1 - j];
		}
		for (int j = 0; j < vetorInvertido.length; j++) {
			System.out.println("Invertido[" + j + "] = " + vetorInvertido[j]);
		}
		
	}
}
