
public class NumerosPerfeitos {
	public static void main(String[] args) {
		
		for (int candidato = 1; candidato < 1000000000 ; candidato++ ) {
			long somaDivisores = 0 ;
			for (int divisor = 1; divisor <= (candidato / 2); divisor++) {
				
				if ((candidato % divisor) == 0) {
					somaDivisores += divisor;
				}
			}
			if (somaDivisores == candidato) {
				System.out.println(candidato + " é um número perfeito");
			}
			
		}
	}
}
