//Algoritmo de filtrar as notas maiores que 5 com collections

import java.util.ArrayList;//importa a classe ArrayList
import java.util.Arrays;//importa a classe Array
import java.util.List; //importa a interface List

public class Collections {
 
    public static void main(String[] args) {
        List <Integer> notas = new ArrayList<>(Arrays.asList(5,6,7,8,9,10)); //inicia a lista de notas 

          //Apliacando filtro dos números maiores que 5  
        List <Integer> maioresQue5 = filtrar(notas, Collections::maiorQue5);  
        
       

        System.out.println("As notas maiores que 5 são: " + maioresQue5);//exibe os maiores que 5
        System.out.printf("Média das notas maiores que 5 : " + calcularMedia(maioresQue5));


    }

    //criação da do método filtrar que filtra uma lista de inteiros  
    public static List<Integer> filtrar(List<Integer> lista,Filtro filtros) {
      List <Integer>  resultado = new ArrayList<>(); //inicia a lista resultado    

      for(int n : lista){//itera sobre cada inteiro
      
        if (filtros.testar(n)) {
          resultado.add(n);
          
        }
      }
      return resultado;

      
      
    }
 //criação da interface funcional
      interface Filtro {
        boolean testar(int numero);
    }

  
    //criação do método dos números maiores que 5
    public static boolean maiorQue5(int notas){
      return notas>5;

    }

   //método de calcular média
    public static double calcularMedia(List<Integer> lista){

      if (lista.isEmpty()) return 0.0;
        int soma=0;
      for(int n : lista) soma+= n;

      return (double) soma/lista.size();

    }

  


    


}
