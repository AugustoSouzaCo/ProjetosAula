import java.util.Scanner;

public class Somatorio {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o limite do somatório");
		int limite = sc.nextInt();
		sc.close();
		double resultado = 0;
		for (int x = 0; x <= limite; x++) {
			resultado += x*x + 3*x + 5;
		}
		System.out.println(resultado);
	}
}
