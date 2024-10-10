import java.util.Scanner;

public class Data {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dia = 0;
		int mes = 0;
		int ano = 0;
		
		System.out.println("Digite o dia: ");
		dia = scanner.nextInt();
		
		System.out.println("Digite o mes: ");
		mes = scanner.nextInt();
		
		System.out.println("Digite o ano: ");
		ano = scanner.nextInt();
		
		scanner.close();
		
		int diaSemana = (((dia) + 
				(2 * mes) + 
				((3 * (mes + 1))/5) + 
				((ano) + (ano / 4)) - 
				(ano / 100) +
				(ano / 400) + 
				2) % 7);
		
		
		switch (diaSemana) {
		case 1:
			System.out.println("DOMINGO");
			break;
		case 2:
			System.out.println("SEGUNDA");
			break;
		case 3:
			System.out.println("TERÇA");
			break;
		case 4:
			System.out.println("QUARTA");
			break;
		case 5:
			System.out.println("QUINTA");
			break;
		case 6:
			System.out.println("SEXTA");
			break;
		case 7:
			System.out.println("SABADO");
			break;
		}
		
		
		
	}
}
