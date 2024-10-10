import java.util.Scanner;

public class VerificaPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número para verificar se é primo:");
        int numero = sc.nextInt();
        
        if (ehPrimo(numero)) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
        
        sc.close();
    }
    
    public static boolean ehPrimo(int num) {
        // Números menores que 2 não são primos
        if (num < 2) {
            return false;
        }
        
        // Verifica se num é divisível por qualquer número de 2 até a raiz quadrada de num
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
