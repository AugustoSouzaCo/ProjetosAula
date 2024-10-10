import java.util.ArrayList;
import java.util.Scanner;

public class Ginastica{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Double> notas = new ArrayList<Double>(); 
		System.out.println("Digite as 6 notas da ginasta");
		double media = 0;
		double somaNotas = 0;
		
		for (int i = 0; i < 6; i++) {
	            double nota = sc.nextDouble();
	            notas.add(nota);
	    }
		sc.close();
		
		double menor = notas.get(0);
		double maior = notas.get(0);
		
		for (int i = 0; i < notas.size(); i++) {
			if (notas.get(i) > maior) {
				maior = notas.get(i);
			}
			if (notas.get(i) < menor) {
				menor = notas.get(i);
			}		
		}
		notas.remove(menor);
		notas.remove(maior);
	
		for (int i = 0; i < notas.size(); i++) {
			somaNotas += notas.get(i);
		}
		
		media = somaNotas / 4;
		System.out.println("A média das notas sem a maior e a menor é " + media);
	}
}
