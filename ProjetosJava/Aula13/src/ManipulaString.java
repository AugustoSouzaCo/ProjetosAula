import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ManipulaString {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String txt = "";
		String remocao = "";
		try {
			System.out.println("Digite um texto: ");
			txt = reader.readLine();
			
			System.out.println("Digite algo para ser removido");
			remocao = reader.readLine();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Primeiro caractere: " + txt.substring(0, 1)); // começo e fim
		System.out.println("Último caractere: " + txt.substring(txt.length() - 1)); // apenas início
		
		System.out.println("Tamanho do texto: " + txt.length());
		System.out.println("Texto maiúsculo: " + txt.toUpperCase());
		System.out.println("Texto minúsculo: " + txt.toLowerCase());
		
		System.out.println("Texto sem caractere removido: " + txt.replaceAll(remocao, "")); // o que vai ser removido e pelo o que
		
	}
}
