
public class Fibonacci {
	public static void main(String[] args) {
		long num = 0;
		long ultimo = 1;
		long penultimo = 0;
		
		System.out.println(1);
		while (num < 1000000000) {
			num = ultimo + penultimo;
			System.out.println(num);
			
			penultimo = ultimo;
			ultimo = num;
		}
			
	}
}
