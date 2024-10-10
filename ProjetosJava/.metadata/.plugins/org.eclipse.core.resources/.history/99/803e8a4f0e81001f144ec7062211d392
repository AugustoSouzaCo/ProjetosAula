import java.util.Scanner;

public class PesoPopulação {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double media = 0;
		double somaPeso = 0;
		double peso = 0;
		int tamanhoPopulação = 0;
		
		do {
			System.out.println("Digite o peso do indivíduo na população");
			peso = sc.nextDouble();
			somaPeso += peso;
			tamanhoPopulação++;
			System.out.println("Tem mais gente? 's' ou 'n'");
		} while (sc.next().equalsIgnoreCase("s"));
		sc.close();
		media = (somaPeso / tamanhoPopulação);	
		System.out.printf("A média de peso da população é %.2f", media);
	}
}
