import java.util.ArrayList;
import java.util.Scanner;

public class PesquisaSocioeconomica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> rendaFamilias = new ArrayList<>();
        ArrayList<Integer> tamanhoFamilias = new ArrayList<>();
        
        String opcao = "s";
        double renda = 0;
        int tamanho = 0;
        
        double ClasseE = 0;
        double ClasseD = 0;
        double ClasseC = 0;
        double ClasseB = 0;
        double ClasseA = 0;
        
        while (opcao.equalsIgnoreCase("s")) {
            System.out.println("Digite a renda da família:");
            renda = sc.nextDouble();
            rendaFamilias.add(renda);
            System.out.println("Digite o tamanho da família:");
            tamanho = sc.nextInt();
            tamanhoFamilias.add(tamanho); 
            System.out.println("Tem mais familia? <S> ou <N>");
            opcao = sc.next();
        }
        double total = tamanhoFamilias.size();
        
        for (int i = 0; i < rendaFamilias.size(); i++) {
            double rendaPerCapita = rendaFamilias.get(i) / tamanhoFamilias.get(i);
            if (rendaPerCapita < 500) {
                ClasseE++;
            } else if (rendaPerCapita < 2000) {
                ClasseD++;
            } else if (rendaPerCapita < 5000) {
                ClasseC++;
            } else if (rendaPerCapita < 10000) {
                ClasseB++;
            } else {
                ClasseA++;
            }
        }
           
        double PercentClasseE = (ClasseE / total) * 100;
        double PercentClasseD = (ClasseD / total) * 100;
        double PercentClasseC = (ClasseC / total) * 100;
        double PercentClasseB = (ClasseB / total) * 100;
        double PercentClasseA = (ClasseA / total) * 100;
        
        System.out.printf("""
                O percentual da classe A é %.2f%%
                O percentual da classe B é %.2f%%
                O percentual da classe C é %.2f%%
                O percentual da classe D é %.2f%%
                O percentual da classe E é %.2f%%
                """, PercentClasseA, PercentClasseB, PercentClasseC, PercentClasseD, PercentClasseE);
    }
}
