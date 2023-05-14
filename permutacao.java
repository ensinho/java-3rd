import java.util.Arrays;
import java.util.Scanner;

public class VerificaPermutacao {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        
        do {
            System.out.print("Digite um número inteiro positivo: ");
            num1 = input.nextInt();
        } while (num1 < 0);
        
        do {
            System.out.print("Digite outro número inteiro positivo: ");
            num2 = input.nextInt();
        } while (num2 < 0);
        
        if (verificaPermutacao(num1, num2)) {
            System.out.println(num1 + " é permutação de " + num2);
        } else {
            System.out.println(num1 + " não é permutação de " + num2);
        }
    }
    
    public static boolean verificaPermutacao(int num1, int num2) {
        // converte os números para arrays de caracteres com o integer
        char[] num1Array = Integer.toString(num1).toCharArray();
        char[] num2Array = Integer.toString(num2).toCharArray();
        
        // verifica se os arrays têm o mesmo tamanho
        if (num1Array.length != num2Array.length) {
            return false;
        }
        
        // ordena os arrays
        Arrays.sort(num1Array);
        Arrays.sort(num2Array);
        
        // verifica se os arrays são iguais
        for (int i = 0; i < num1Array.length; i++) {
            if (num1Array[i] != num2Array[i]) {
                return false;
            }
        }
        
        return true;
    }
    
}
