import java.util.Scanner;;
public class Algoritmo6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCorreto = 7; //Variaável que armazena número correto
        int palpite; //armazena o palpite do usuário

        System.out.println("Adivinhe o número de 1 a 10: ");
         //laço de repetição
        do{//garante que continue tentando até acertar
            System.out.println("Qual o seu palpite? ");
            palpite = scanner.nextInt();

            if (palpite != numCorreto) {
                System.out.println("tente de novo: ");
                
            }

        }while(palpite != numCorreto);//verifica se o palpite é diferente do número correto
        System.out.println("Parabéns, você acertou! ");
    }

  
  
}
