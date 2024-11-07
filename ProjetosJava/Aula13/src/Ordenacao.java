import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ordenacao {
	public static void main(String[] args) {
		// Direct sort | Insertion sort
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] txt = new String[10];
		
		try {
			for (int i = 0; i < txt.length; i++) {
				System.out.println("Digite a palavra da posição " + i + " do vetor: ");
				txt[i] = reader.readLine();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		// primeiro ao penúltimo
		for (int i = 0; i < txt.length -1; i++) {
			for (int j = (i + 1); j < txt.length; j++) { // começa a comparação do próximo ao último
				if (txt[i].compareTo(txt[j]) > 0){
					String temp = txt[i];
					txt[i] = txt[j];
					txt[j] = temp;
					
				}
			}
		}
		for (int i = 0; i < txt.length; i++) {
			System.out.println(txt[i]);
		}
	}
}
