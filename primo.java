import java.util.Scanner;

public class Ex1Primos {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = input.nextInt();
        if (ehPrimo(n)) {
            System.out.println(n + " é primo.");
        } else {
            System.out.println(n + " não é primo.");
        }
    }
    
    public static boolean ehPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}
