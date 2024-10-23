import java.util.ArrayList;
import java.util.Scanner;

public class MediaNotas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Double> notas = new ArrayList<Double>();
		double media = 0;
		double somaNotas = 0;
		
		while (true) {
			System.out.println("Digite as notas do aluno ou -1 para calcular a média: ");
			double nota = sc.nextDouble();
			if (nota != -1) {
				notas.add(nota);
			} else {
				for (int i = 0; i < notas.size(); i++) {
					somaNotas += notas.get(i);
				}
				media = somaNotas / notas.size() ;
				System.out.println("A média das notas é: " + media);
				sc.close();
				break;
				}
			}
	}
}
