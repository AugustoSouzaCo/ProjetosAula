import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConversaoBinarioDecimal {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String binary = "";
		int decimal = 0;
		
		try {
			System.out.println("Digite um número binário");
			binary = reader.readLine();
		} catch (Exception error){
			System.out.println(error);
		}
		for (int i = 0; i < binary.length(); i++) {
			int number = Integer.parseInt(binary.substring(i, i + 1));
			decimal += (number * Math.pow(2, binary.length() - 1 - i)); // invert vector
			
		}
		System.out.println("O número decimal é " + decimal);
	}
}
