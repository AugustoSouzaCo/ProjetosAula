import java.util.Arrays;
import java.util.Scanner;

public class ComparaElementos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vetor[] = new int[10];
		int vetorLimite[] = new int[10];
		int indice = 0;
		int limite = 0;
		
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite o valor da posição " + i + " do vetor: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("Digite o limite: ");
		limite = sc.nextInt();
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > limite) {
				vetorLimite[indice] = vetor[i];
				indice++;
			}
		}
		for (int i = 0; i < indice; i++) {
			System.out.println("VetorLimite[" + i + "] =" + vetorLimite[i]);
		}
	}
	
}
