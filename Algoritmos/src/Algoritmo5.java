import java.util.Scanner;

//Algoritmo de verificação de número primo dentro de um intervalo definido pelo usuário, soma e a média aritmética desses números primos.

public class Algoritmo5 {

     //verifica se é número primo
    public static  boolean primo(int num){   
         if (num<=1) return false;
         for(int i = 2; i <= Math.sqrt(num); i++){
            if (num % i == 0) return false;

         }
            return true; 
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Entrada de dados
        System.out.println("Digite o inicio do intervalo: ");
        int num1 = input.nextInt();//armazena o que foi digitado pelo usuário

        System.out.println("Digite o fim do intervalo ");
        int num2 = input.nextInt();//armazena o que foi digitado pelo usuário
        //variáveis de soma e de contagem de números primos
        int soma= 0;
        int primos= 0;

        System.out.println();//pula uma linha

       

        //se o inicio do intervalo for maior que o final: intervalo inválido
        if (num1>num2) {
            System.out.println("Intervalo inválido.");
            return;
  
        }
        
           System.out.println("Números primos entre " + num1 + " e " + num2 + ":");

        //Aqui verifica os números primos no intervalo digitado
        for(int num=num1; num<=num2; num++){
            
                 

            if (primo(num)) {
                System.out.println(num + "");//cria uma lista
                soma += num;//faz a soma dos primos
                primos++;//incrementa os primos encontrados
                
            }
        }

      
         System.out.println("A soma dos números primos é: " + soma);
         System.out.println("");
          
         //calcular a média
         if(primos > 0){
            double media =  soma/primos;
              System.out.printf("A média é: " + media);
          
         }else{
            System.out.println(" Nenhum número primo encontrado no intervalo. ");
         }
     
}

    }

