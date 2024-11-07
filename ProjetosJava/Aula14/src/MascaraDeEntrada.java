import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MascaraDeEntrada {
	public static String lerNumeroDeTelefone() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String retorno = "";
		boolean deuCerto = false;
		
		while (!deuCerto) {
			try {
				System.out.println("Digite um número de telefone:");
				retorno = reader.readLine();
				deuCerto = true;
		
				if (! retorno.subSequence(0, 1).equals("(")) {
					throw new Exception();
				}
				Integer.parseInt(retorno.substring(1, 3));
				if (! retorno.substring(3, 4).equals(")")) {
					throw new Exception();
				}
				Integer.parseInt(retorno.substring(4, 9));
				
				if (! retorno.substring(9, 10).equals("-")) {
					throw new Exception();
				}
				Integer.parseInt(retorno.substring(10));
				
				if (retorno.length() != 14) {
					throw new Exception();
				}
				
			} catch(Exception e) {
				System.out.println("Tente novamente!");
				deuCerto = false;
			}
		}
		return retorno;
	}
	public static String lerTextoDeTamanhoFixo(int tamanho) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String retorno = "";
		boolean deuCerto = false;
		
		while (!deuCerto) {
			try {
				System.out.println("Digite um texto de tamanho " + tamanho + ": ");
				retorno = reader.readLine();
				deuCerto = true;
				if (retorno.length() != tamanho) {
					throw new Exception();
				}
			} catch(Exception e) {
				System.out.println("Tente novamente!");
				deuCerto = false;
			}
		}
		return retorno;
	}
	
	public static int lerNumeroInteiroDoTeclado() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int retorno = 0;
		boolean deuCerto = false;
		while(!deuCerto) {
			try {
				System.out.println("Digite um número inteiro: ");
				retorno = Integer.parseInt(reader.readLine());
				deuCerto = true;
			} catch (Exception e) {
				System.out.println("Tente novamente!");
			}
		}
		return retorno;
	}
	
	public static double lerNumeroFracionarioDoTeclado() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		double retorno = 0;
		boolean deuCerto = false;
		while(!deuCerto) {
			try {
				System.out.println("Digite um número fracinário: ");
				retorno = Double.parseDouble(reader.readLine());
				deuCerto = true;
			} catch (Exception e) {
				System.out.println("Tente novamente!");
			}
		}
		return retorno;
	}
	
	
	
	public static void main(String[] args) {
		int numero = 0;
		double fracionario = 0;
		String texto = "";
		String telefone = "";
		
		numero = lerNumeroInteiroDoTeclado();
		fracionario = lerNumeroFracionarioDoTeclado();
		texto = lerTextoDeTamanhoFixo(5);
		telefone = lerNumeroDeTelefone();
		
		System.out.println(telefone);
		System.out.println(numero);
		System.out.println(fracionario);
		System.out.println(texto);
	}
}	
