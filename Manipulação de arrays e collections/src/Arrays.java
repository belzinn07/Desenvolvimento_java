public class Arrays {
    public static void main(String[] args) throws Exception {
        int [] notas = new int[6];//criação do array

        //guardando valores dentro dos arrays
        notas[0]= 6;//arrays começam no indice 0
        notas[1]=7;
        notas[2]=8;
        notas[3]=9;
        notas[4]=10;
        notas[5]=10;

        int soma=0;
      
        

        System.out.println("Notas do aluno: ");

        for(int i = 0; i<notas.length;i++ ){//
            System.out.println("Aluno "+ (i+1) + ": " + notas[i]);//soma 1 ao indice: 0 e mostra(aluno1,2,3)
            soma += notas[i];//soma as notas
      
        }

        double media = (double) soma/notas.length;//calcula a média

        System.out.println("`\nA média é : " + media);

    }
}
