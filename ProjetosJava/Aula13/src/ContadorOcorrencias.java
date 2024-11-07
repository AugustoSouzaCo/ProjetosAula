import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ContadorOcorrencias {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String txt = "";
		String search = "";
		int ocorrencias = 0;
		
		try {
			System.out.println("Digite um texto: ");
			txt = reader.readLine();
			
			System.out.println("Digite algo para procurar no texto: ");
			search = reader.readLine();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		int idx = -1;
		
		do {
			idx = txt.indexOf(search, idx + 1);
			if (idx > -1) {
				ocorrencias++;
			}
		} while (idx > -1);
		
		System.out.println("A quantidade de ocorrências é:" + ocorrencias);
	}
}
