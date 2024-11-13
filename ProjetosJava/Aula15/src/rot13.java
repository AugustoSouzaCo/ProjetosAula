import java.io.BufferedReader;
import java.io.InputStreamReader;

public class rot13 {
	// Funcao que le texto do teclado
	public static String lerTexto() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String texto = "";
		
		try {
			System.out.println("Digite um texto: ");
			texto = reader.readLine();
		} catch (Exception e) {
			System.out.println(e);
		}
		return texto;
	}
	// Funcao que encripta um texto com algoritmo rot13
	public static String encriptaTexto(String texto) {
		String criptograma = "";
		for (int i = 0; i < texto.length(); i++) { 
			// pega cada letra
			char letra = texto.charAt(i);
			// converte a letra para codigo tabela asc
			int codigoASCII = (int) letra;
			// se não for uma letra minuscula vai estar nesse intervalo, cancatena
			if ((codigoASCII < 97) || (codigoASCII > 122)) {
				//aqui nao está mudando nada; concatena caso não seja uma letra minuscula
				criptograma += letra;
			} else { // aqui converte porque é uma letra minúscula
				codigoASCII += 13;
				if (codigoASCII > 122) {
					codigoASCII -= 26;
				}
				criptograma += ((char) codigoASCII);
			}
		}
		return criptograma;
	}
	public static void main(String[] args) {
		String texto = lerTexto();
		String criptograma = encriptaTexto(texto);
		System.out.println(criptograma);
	}
}
