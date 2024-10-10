import java.util.Scanner;

public class EquaçãoSegundoGrau {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor de a");
		double a = sc.nextInt();
		System.out.println("Digite o valor de b");
		double b = sc.nextInt();
		System.out.println("Digite o valor de c");
		double c = sc.nextInt();
		double x1 = 0;
		double x2 = 0;
		
		double delta = (Math.pow(b, 2) - (4 * a *c));
		if (delta >= 0) {
			x1 = ((-b + Math.sqrt(delta)) / (2 * a));
			x2 = ((-b - Math.sqrt(delta)) / (2 * a));
		}
		
		if (delta < 0) {
			System.out.println("Não existem raizes reais");
		} else if (delta == 0) {
			System.out.println("A única raiz real é " + x1);
		} else {
			System.out.println("As duas raizes reais são " + x1 + " " + x2);
		}
		sc.close();
	}
}