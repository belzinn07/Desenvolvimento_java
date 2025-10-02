package com.example;
public class Main {
    public static void main(String[] args) {
        Configuracoes config = Configuracoes.getInstance();

        config.salvar("programador", "Belmiro");
        config.salvar("linguagem", "Java");

        System.out.println("Programador atual: " + config.obter("programador"));
        System.out.println("Linguagem de programção: " + config.obter("linguagem"));

        Configuracoes config2 = Configuracoes.getInstance();
    System.out.println("São a mesma instância? " + (config == config2));

    config2.salvar("programador", "Tiago");
    config2.salvar("linguagem", "Delphi");
    System.out.println("Programador atualizado: " + config.obter("programador"));
    System.out.println("Linguagem atualizada: " + config.obter("linguagem"));
}
    }

    
