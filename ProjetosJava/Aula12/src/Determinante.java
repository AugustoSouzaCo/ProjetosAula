import java.util.Scanner;

public class Determinante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int determinante = 0;
        
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("matriz[" + i + "][" + j + "] = ");
                matriz[i][j] = sc.nextInt();
            }
        }
        
       
        System.out.println("\nMatriz inserida:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        
        determinante = (matriz[0][0] * matriz[1][1] * matriz[2][2]) + 
                       (matriz[0][1] * matriz[1][2] * matriz[2][0]) + 
                       (matriz[0][2] * matriz[1][0] * matriz[2][1]) -
                       (matriz[0][2] * matriz[1][1] * matriz[2][0]) -
                       (matriz[0][1] * matriz[1][0] * matriz[2][2]) -
                       (matriz[0][0] * matriz[1][2] * matriz[2][1]);

        
        System.out.println("\nO determinante da matriz é: " + determinante);
    }
}

