import java.util.Scanner; //Algoritmo de verificação de número primo
public class Algoritmo4 {
public static void main(String[] args) {
    Scanner input= new Scanner(System.in);

    System.out.println("Digite um número: ");
    int num1 = input.nextInt();

    boolean primo = true;


    if (num1 <=1) {
      primo = false;
    }else{

    for(int i = 2; i <= Math.sqrt(num1); i++ ){

        if(num1 % i ==0){
            primo = false;
            break;
        }

    } 
    }

    if(primo){
        System.out.println(num1 + " é primo");
    
    }
    else{
        System.out.println(num1 + " não é primo");
    }
     
}


}
