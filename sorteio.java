import java.util.Scanner;

public class Ex2Sorteio {
    
    public static void main(String[] args) {
        int numeroSorteado = (int) (Math.random() * 1001); // sorteia um número de 0 a 1000
        Scanner input = new Scanner(System.in);
        int chute;
        int tentativas = 0;
        do {
            System.out.print("Digite um chute: ");
            chute = input.nextInt();
            tentativas++;
            if (chute < numeroSorteado) {
                System.out.println("O chute é menor do que o número sorteado.");
            } else if (chute > numeroSorteado) {
                System.out.println("O chute é maior do que o número sorteado.");
            }
        } while (chute == numeroSorteado);
        System.out.println("Boa, você acertou em " + tentativas + " tentativas!");
    }
    
}
