import java.util.Scanner;
//usando o switch 
//calcualdora de operações básicas
public class Algoritmo7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Digite um número: ");
        double n1 = scanner.nextDouble();
        System.out.println("Digite outro: ");
        double n2 = scanner.nextDouble();

        System.out.println("Ecolha uma operação: + , -, *, / : ");
        char operacao = scanner.next().charAt(0);

        switch (operacao) {
            case '+':
            System.out.println(" A soma é: "+ (n1+n2));
                
                break;

            case '-':
            System.out.println(" A subtraçãoo é: "+ (n1-n2));
                
                break; 
            
            case '*':
            System.out.println(" A multiplicação é: "+ (n1*n2));
                
            break;

            case '/':
            if (n2 != 0) {
                
            System.out.println(" A divisão é: "+ (n1/n2));
                
            } else{
                System.out.println("Não se pode dividir por zero. ");
            }
          
            break;
        
            default:
            System.out.println("Operação inválida. ");
                break;
        }
    
    }

}
