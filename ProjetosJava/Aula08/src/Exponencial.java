import java.util.Scanner;

public class Exponencial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double resultado = 1;
		System.out.println("Digite a base");
		int base = sc.nextInt();
		sc.close();
		
		System.out.println("Digite o expoente");
		int expoente = sc.nextInt();
		
		for (int i = 0; i < expoente; i++) {
			resultado *= base;
		}
		System.out.println(resultado);
 	}
}
