import java.util.ArrayList;
import java.util.List;

interface Filtro {
    Filtro isNotaAzul();
    Filtro isNotaBaixa();
    double calcularMedia();
    void mostrarNotas(String mensagem);
}

class Boletim implements Filtro {
    private final String nome;
    private List<Double> notas;   
    private List<Double> lista;   

    public Boletim(String nome){
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
    public Filtro isNotaAzul(){
        List<Double> aprovados = new ArrayList<>();
        for(double nota : notas){   
            if (nota >= 6) {
                aprovados.add(nota);
            }
        }
        this.lista = aprovados;
        return this;
    }

    @Override
    public Filtro isNotaBaixa(){
        List<Double> reprovados = new ArrayList<>();
        for(double nota : notas){
            if (nota < 6) {
                reprovados.add(nota);
            }
        }
        this.lista = reprovados;
        return this;
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
}
