import java.util.Scanner;

public class TrianguloAsteriscos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o tamanho do triângulo: ");
		int tamanho = sc.nextInt();
		
		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}