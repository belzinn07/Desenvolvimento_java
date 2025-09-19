package models;
import java.util.ArrayList;
import java.util.List;

import abstracoes.GerenciarNotas;
import abstracoes.Filtro;

public class Aluno implements GerenciarNotas {
    private final String nome;
    private List<Double> notas;   
    private List<Double> lista;   

    public Aluno(String nome){
        this.nome = nome;
        this.notas = new ArrayList<>();
        this.lista = new ArrayList<>();
    }

    public String getNome(){
        return nome;
    }

    public void adicionarNota(double nota){
        this.notas.add(nota);
        this.lista.add(nota);
    }


    @Override
    public double calcularMedia(){
        if(notas.isEmpty()) return 0.0;
        double soma = 0;
        for(double nota : notas){
            soma += nota;
        }
        return soma / notas.size();  
    }

    @Override
    public void mostrarNotas(String mensagem){
        System.out.println(mensagem + lista);
    }

    
      public List<Double> filtrar(Filtro filtro){
        this.lista = filtro.filtrar(notas);
        return this.lista;
    }

}
