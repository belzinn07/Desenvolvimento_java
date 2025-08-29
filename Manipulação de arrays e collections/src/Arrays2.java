import java.util.Scanner;
public class Arrays2 {
     public static void main(String[] args) throws Exception {

        Scanner input= new Scanner(System.in);
        int [] notas = new int[6];//criação do array
           
        System.out.println("Digite as notas dos alunos: ");

        int soma=0;

        for(int i = 0; i<notas.length;i++ ){//
            System.out.println("Aluno "+ (i+1) + ": " );//pegar as notas dos alunos
            notas[i]=input.nextInt();   
            soma += notas[i];//soma as notas
      
        }

        double media = (double) soma/notas.length;//calcula a média

        System.out.println("`\nA média é : " + media);

    }

}
