import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String str = input.nextLine();

        StringBuilder strInvertida = new StringBuilder(str);
        strInvertida.reverse();

        System.out.println("String invertida: " + strInvertida);
    }
}
