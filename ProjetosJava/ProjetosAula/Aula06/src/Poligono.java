import java.util.Scanner;

public class Poligono {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int lados = 0;
		double tamanhoLado = 0;
		double area = 0;
		
		System.out.println("Quantos lados tem o polígono ");
		lados = scanner.nextInt();
		System.out.println("Digite o tamanho dos lados ");
		tamanhoLado = scanner.nextDouble();
		double perimetro = tamanhoLado * lados;
		
		switch (lados) {
			case 3:	
				area = ((Math.pow(tamanhoLado, 2) * Math.sqrt(3)) / 4);
				break;
				
			case 4: lados = 4;	
				area = (Math.pow(tamanhoLado, 2));
				break;
			
			case 5: lados = 5;
				area = ((5 * Math.pow(tamanhoLado, 2)) / (4* Math.tan(36)));
				break;
				
			case 6: lados = 6;
				area = ((3 * Math.pow(tamanhoLado, 2) * Math.sqrt(3)) / 2);
				break;
			
			case 7: lados = 7;
				area = ((7/4) * Math.pow(tamanhoLado, 2) * (1 / Math.tan(51.4285714)));
				break;
		}
		System.out.println("Perímetro do polígono: " + perimetro);
		System.out.println("Área do polígono: " + area);
		scanner.close();
		
	}
	
}	
