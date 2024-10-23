import java.util.Scanner;

public class CustoCompra {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o valor do produto e a quantidade");
		
		double preco = scanner.nextDouble();
		int quantidade = scanner.nextInt();
		scanner.close();
		
		double desconto;
		double valor = preco * quantidade;
		
		if (quantidade >= 100) {
			desconto = 0.5;;
		} else if (quantidade >= 50) {
			desconto =  0.4;
		} else if (quantidade >= 20) {
			desconto = 0.3;
		} else if (quantidade >= 10) {
			desconto = 0.1;
		} else desconto = 0;
		System.out.println("O preço final da compra é " + (valor - (valor*desconto)));
	}
}
