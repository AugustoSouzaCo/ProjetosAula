import java.util.Scanner;

public class Cedulas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int valor;
		System.out.println("Digite um valor");
		valor = sc.nextInt();
		
		int qtdNota;
		int divisor = 200;
		
		while (valor > 0) {
			qtdNota = (valor / divisor);
			valor = (valor % divisor);
			
			System.out.println(qtdNota + " notas de " + divisor);
			
			if (divisor == 50) {
				divisor = 20;
			} else if (divisor == 5) {
				divisor = 2;			
			} else {
				divisor /= 2;
			}
		}
	}
}
