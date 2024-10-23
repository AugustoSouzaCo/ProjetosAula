import java.text.DecimalFormat;
import java.util.Scanner;

public class LancamentoBalistico {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double angulo = 0;
		double velocidade = 0;
		
		System.out.println("Digite o ângulo de lançamento: ");
		angulo = sc.nextDouble();
		
		System.out.println("Digite a velocidade de lançamento: ");
		velocidade = sc.nextDouble();
		
		sc.close();
		
		angulo = ((Math.PI * angulo) / 180);
		double tempo = ((2 * velocidade * Math.sin(angulo)) / 9.82);
		double distanciaFinal = ((Math.pow(velocidade, 2) * Math.sin(2 * angulo)) / 9.82);
		
		for (double i = 0; i < tempo; i++) {
			double distanciaTempoATempo = (velocidade * Math.cos(angulo) * i);
			System.out.println(new DecimalFormat("0.00").format(i) + "\t" + distanciaTempoATempo);
		}
		System.out.println(new DecimalFormat("0.00").format(tempo) + "\t" + distanciaFinal);
		
	}
}
