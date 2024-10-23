import java.util.Scanner;

public class Fatorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número inteiro maior ou igual a 0");
		int num = sc.nextInt();
		sc.close();
		double fatorial = 1;
			while (num > 0) {
				fatorial *= num;
				num--;
			}
		System.out.println("Fatorial desse número é " + fatorial);
	}
}
