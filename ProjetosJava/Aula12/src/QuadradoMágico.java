import java.util.Scanner;

public class QuadradoMágico {
	private static final int TAMANHO =3;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int[][] quadrado = new int[TAMANHO][TAMANHO];
        int numeroMagico = 0;
        int numeroCalculado= 0;
        boolean quadradoMagico = true;     
        
        for (int i = 0; i < TAMANHO; i++) {
            for (int j = 0; j < TAMANHO; j++) {
                System.out.print("quadrado[" + i + "][" + j + "] = ");
                quadrado[i][j] = sc.nextInt();
            }
        }
        sc.close();
        for (int i = 0; i < TAMANHO; i++) {
        	numeroMagico += quadrado[i][i];
        }
        for (int i = 0; i < TAMANHO; i++) {
        	numeroCalculado += quadrado[i][TAMANHO - 1 - i];
        }
        if (numeroMagico != numeroCalculado) {
        	quadradoMagico = false;
        }
        // somatório linhas
        for (int i = 0; i < TAMANHO; i++) {
        	numeroCalculado = 0;
        	for (int j = 0; j < TAMANHO; j++) {
        		numeroCalculado += quadrado[i][j];
        	}
        	if (numeroMagico != numeroCalculado) {
        		quadradoMagico = false;
        	}
        }
        // somatório colunas
        for (int i = 0; i < TAMANHO; i++) {
        	numeroCalculado = 0;
        	for (int j = 0; j < TAMANHO; j++) {
        		numeroCalculado += quadrado[j][i];
        	}
        	if (numeroMagico != numeroCalculado) {
        		quadradoMagico = false;
        	}
        }
        if (quadradoMagico) {
        	System.out.println("Esse é um quadrado mágico");
        } else System.out.println("Não é um quadrado mágico");
	}
}
