import java.util.HashMap;
import java.util.Map;

public class Mapimperativo {

     public static void main(String[] args) {

        System.out.println("-----Avaliação Bimestral-----");
         Map<String, Integer> notas = new HashMap<>();

    notas.put("Bel", 9);
    notas.put("Ana", 10);
    notas.put("Tiago",10 );
    notas.put("Belo", 5);

    //média
    int soma=0;

    for(int nota : notas.values()){
        soma+=nota;

    }
    double media = (double) soma/notas.size();
    System.out.println("Média da turma: "+ media); 


//recuperção
for(Map.Entry<String, Integer> recuperacao: notas.entrySet()){
    String aluno= recuperacao.getKey();
    int nota= recuperacao.getValue();

    if(nota < 6){

        System.out.println(aluno + " tirou uma nota: "+nota+" e precisa fazer recuperação");
        
        int notaNova=nota +2;
        notas.put(aluno,notaNova);


    }


    }

      System.out.println("---Notas atualizadas após recuperação: ");

//atualiza notas
    for(Map.Entry<String, Integer> notasAtualizadas: notas.entrySet()){
      
        System.out.println("Aluno: " + notasAtualizadas.getKey() + " tem nota: "+ notasAtualizadas.getValue());

    }

    
    //nova média
     soma=0;

    for(int nota : notas.values()){
        soma+=nota;

    }
    double novaMedia = (double) soma/notas.size();
    System.out.println("Nova média da turma: "+ novaMedia); 

}

    }



   

    


