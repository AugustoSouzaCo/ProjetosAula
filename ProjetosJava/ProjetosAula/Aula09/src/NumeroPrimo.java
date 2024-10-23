
public class NumeroPrimo {
	public static void main(String[] args) {
		long num = 1;
		boolean primo;
		
		while (true) {
			primo = true;
			for (long divisor = 2; divisor < Math.sqrt(num); divisor++) {
				if (num % divisor == 0) {
					primo = false;
					break;
				}
			}
			if (primo ) {
				System.out.println(num + " é primo");
			}
			num++;
		}
		
	}
}