import java.util.Scanner;
public class Algoritmo3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int n1 = input.nextInt();

        System.out.println("Digite o segundo número: ");
        int n2 = input.nextInt();

        int soma = n1 + n2;
        int subt = n1 - n2;
        int mult = n1 * n2;
        int div = n1/n2;

        System.out.println("A soma é: " + soma);
        System.out.println("A subtração é: " + subt);
        System.out.println("A multiplicação é:" + mult);
        System.out.println("A divisão é: " + div);
        
    }

}
