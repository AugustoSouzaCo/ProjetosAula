import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Palindromo {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String txt = "";
		boolean palindromo = true;
		try {
			System.out.println("Digite um texto: ");
			txt = reader.readLine();
				
		} catch (Exception e) {
			System.out.println(e);
		}
		txt = txt.replaceAll(" ", "");
		txt = txt.toUpperCase();
		txt = txt.replaceAll("-", "");
		txt = txt.replaceAll("\\.", "");
		for (int i = 0; i < (txt.length() / 2); i++) {
			if (txt.charAt(i) != txt.charAt(txt.length() - 1 - i)) {
				palindromo = false;
				break;
			}
		}
		if (palindromo) {
			System.out.println("É um palindromo");
		} else {
			System.out.println("Não é palindromo");
		}
	}
}
