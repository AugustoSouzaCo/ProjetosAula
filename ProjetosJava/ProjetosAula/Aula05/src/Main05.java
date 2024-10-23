import java.util.Scanner;

public class Main05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite 3 valores");
		double v1 = scanner.nextDouble();
		double v2 = scanner.nextDouble();
		double v3 = scanner.nextDouble();
		
		double resultado;
		if (v1 >= v2 && v1 >= v3) {
			resultado = v2 + v3;
		} else {
			resultado = (v2 >= v1 && v2 >= v3)? v1 + v3 : v1 + v2;
		}
		
		
		
		
		
		
		System.out.println(resultado);
	}
}
	