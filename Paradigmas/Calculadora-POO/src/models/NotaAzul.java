package models;
import java.util.ArrayList;
import java.util.List;

import abstracoes.Filtro;

public class NotaAzul implements Filtro {
    @Override
    public List<Double> filtrar(List<Double> notas) {
        List<Double> resultado = new ArrayList<>();
        for (double nota : notas) {
            if (nota >= 6) {
                resultado.add(nota);
            }
        }
        return resultado;
    }
}
