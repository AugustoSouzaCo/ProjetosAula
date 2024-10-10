import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main04 {
	 public static void main(String[] args) {
		 Scanner leitor = new Scanner(System.in);
		 System.out.println("Digite as 3 notas ");
		 double n1 = leitor.nextInt();
		 
		 double n2 = leitor.nextInt();
		 double n3 = leitor.nextInt();
		 
		 double media = (n1 + n2 + n3) / 3;
		 
		 if (media >= 5) {
			 System.out.println("PASSOU");
		 } else {
			 System.out.println("Digite a nota da substitutiva: ");
			 double substitutiva = leitor.nextDouble();
			 
			 if (substitutiva >= 5) {
				 System.out.println("PASSOU");
				 
			 } else {
				 System.out.println("REPROVADO");
			 }
		 }
		 
		 
		 
		 
		 
	}
}
