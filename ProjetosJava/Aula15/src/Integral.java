import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Integral {
	// Funcao que declara uma funcao matematica
	public static double funcao(double x) {
		return Math.pow(Math.E, x);
	}
	// Funcao calcula a área do retangulo pelo ponto medio
	public static double calculaRetanguloPontoMedio(double inicio, double fim) {
		return (fim - inicio) * funcao((inicio + fim) / 2);
	}
	// Funcao que calcula a integral
	public static double calcularIntegral(double inicio, double fim) {
		double integral = 0;
		for  (double i = inicio; i < fim; i+=0.001) { //Precisão do calculo
			integral += calculaRetanguloPontoMedio(i, i+0.001);
		}
		return integral;
	}
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		double inicio = 0;
		double fim = 0;
		
		try {
			
			System.out.println("Digite o intervalo inicial");
			inicio = Double.parseDouble(reader.readLine());
			
			System.out.println("Digite o intervalo final");
			fim = Double.parseDouble(reader.readLine());
			
			System.out.println(calcularIntegral(inicio, fim));
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
