import java.util.Scanner;

public class Triangulo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a;
		int b;
		int c;
		
		System.out.println("Digite o primerio lado do triangulo");
		a = scanner.nextInt();
		
		System.out.println("Digite o segundo lado do triangulo");
		b = scanner.nextInt();
		
		System.out.println("Digite o terceiro lado do triangulo");
		c = scanner.nextInt();
		
		if ((a==b) && (b==c)) {
			System.out.println("Triangulo equilátero");
		} else if ((a==b) || (a==c) || (b==c)) {
			System.out.println("Triangulo isóceles");
		} else {
			System.out.println("Tringualo escaleno");
		}
	}
}
