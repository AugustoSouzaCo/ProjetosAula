import java.util.Scanner;

public class Triangulo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite os 3 ângulos do triângulo");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		sc.close();
		
		if ((a <= 0) || (b <= 0) || (c <= 0) || a + b + c != 180) {
			System.out.println("Isso não é um triângulo");
		} else if (a > 90 || b > 90 || c > 90) {
			System.out.println("Triângulo obtusângulo");
		} else if (a == 90 || b == 90 || c == 90) {
			System.out.println("Triângulo retângulo");
		} else 
			System.out.println("Triângulo acutângulo");
	}
}
