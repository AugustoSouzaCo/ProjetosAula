import java.util.Scanner;

public class LeituraDeMascara {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		while (num <= 0) {
			System.out.println("Digite um número positivo: ");
			num = sc.nextInt();
		}
		sc.close();
		System.out.println("Obrigado!");
	}
}
	