import java.util.Scanner;

public class RaizQuadrada {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num = 0;
		double raiz = 0;
		
		System.out.println("Digite um número: ");
		num = sc.nextDouble();
		sc.close();
		
		raiz = (num/2);
		for (int i = 0; i < 50; i++) {
			raiz = ((raiz + (num / raiz)) / 2);	
		}
		System.out.println("A raíz quadrada calculada por Newton é: " + raiz);
		System.out.println("A raíz quadrada calculada por Java é: " + Math.sqrt(num));
	}
}
