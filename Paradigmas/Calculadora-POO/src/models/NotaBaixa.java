package models;

import java.util.ArrayList;
import java.util.List;

import abstracoes.Filtro;

public class NotaBaixa implements Filtro {
     @Override
    public List<Double> filtrar(List<Double> notas){
        List<Double> reprovados = new ArrayList<>();
        for(double nota : notas){
            if (nota < 6) {
                reprovados.add(nota);
            }
        }
        return reprovados;
    }

}
