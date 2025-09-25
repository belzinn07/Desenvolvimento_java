////Algoritmo de filtrar as notas maiores que 5, fazer a média e exibir as notas baixas

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List; 

public class Collections {
 
    public static void main(String[] args) {
        List <Integer> notas = new ArrayList<>(Arrays.asList(5,6,7,8,9,10,4)); 
       
        List <Integer> maioresQue5 = filtrar(notas, Collections::maiorQue5);  
        
        System.out.println("As notas maiores que 5 são: "+maioresQue5);

        System.out.printf("Média das notas maiores que 5 : " + calcularMedia(maioresQue5));
  


    }

   
    public static List<Integer> filtrar(List<Integer> lista,Filtro filtros) {
      List <Integer>  resultado = new ArrayList<>();  
      List<Integer>  notasbaixas = new ArrayList<>();  

      for(int n : lista){
      
        if (filtros.testar(n)) {
          resultado.add(n);
          
        }else{
          notasbaixas.add(n);

         
        }
      }

       System.out.println("Notas baixas: " + notasbaixas);

      return resultado;

      
      
    }

      interface Filtro {
        boolean testar(int numero);
    }

  
    public static boolean maiorQue5(int notas){
      return notas>5;

      

    }

   
    public static double calcularMedia(List<Integer> lista){

      if (lista.isEmpty()) return 0.0;
        int soma=0;
      for(int n : lista) soma+= n;

      return (double) soma/lista.size();

    }

 
}
