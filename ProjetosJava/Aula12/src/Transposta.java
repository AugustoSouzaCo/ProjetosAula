import java.util.Scanner;

public class Transposta {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[2][3];
        int[][] matrizTransposta = new int[3][2];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("matriz[" + i + "][" + j + "] = ");
                matriz[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < matrizTransposta.length; i++) {
            for (int j = 0; j < matrizTransposta[i].length; j++) {
                matrizTransposta[i][j] = matriz[j][i];
            }
        }
        
        System.out.println("\nMatriz inserida:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\nMatriz transposta:");
        for (int i = 0; i < matrizTransposta.length; i++) {
            for (int j = 0; j < matrizTransposta[i].length; j++) {
                System.out.print(matrizTransposta[i][j] + "\t");
            }
            System.out.println();
        }
	}
}	
