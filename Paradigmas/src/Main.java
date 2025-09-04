import java.util.ArrayList;
import java.util.List;


interface Filtro {
    Filtro isPrimo();  // Filtra números primos
    Filtro isMaiorQueSete();  // Filtra números maiores que 7
    double calcularMedia();  // Calcula a média dos números restantes
}


class Numero implements Filtro {
    private final int valor;
    private List<Numero> numeros;

    public Numero(int valor) {
        this.valor = valor;
        this.numeros = new ArrayList<>();
        this.numeros.add(this);
    }

    public int getValor() {
        return valor;
    }

    @Override
    public Filtro isPrimo() {
        List<Numero> primos = new ArrayList<>();
        for (Numero numero : numeros) {
            if (numero.isPrimoMetodo()) {
                primos.add(numero);
            }
        }
        this.numeros = primos; 
        return this; 
    }

    @Override
    public Filtro isMaiorQueSete() {
        List<Numero> maioresQueSete = new ArrayList<>();
        for (Numero numero : numeros) {
            if (numero.getValor() > 7) {
                maioresQueSete.add(numero);
            }
        }
        this.numeros = maioresQueSete; 
        return this; 
    }

    public boolean isPrimoMetodo() {
        if (valor <= 1) return false;
        for (int i = 2; i <= Math.sqrt(valor); i++) {
            if (valor % i == 0) return false;
        }
        return true;
    }

   
    @Override
    public double calcularMedia() {
        if (numeros.isEmpty()) return 0.0;
        int soma = 0;
        for (Numero numero : numeros) {
            soma += numero.getValor();
        }
        return soma / (double) numeros.size();  // Retorna a média dos números restantes
    }

    // Método para adicionar mais números à lista
    public void adicionarNumero(Numero numero) {
        this.numeros.add(numero);
    }
}

// Classe principal para rodar o código
public class Main {
    public static void main(String[] args) {
        // Criando a lista de números
        List<Numero> numeros = new ArrayList<>();
        numeros.add(new Numero(2));
        numeros.add(new Numero(3));
        numeros.add(new Numero(4));
        numeros.add(new Numero(5));
        numeros.add(new Numero(7));
        numeros.add(new Numero(8));
        numeros.add(new Numero(9));
        numeros.add(new Numero(11));
        numeros.add(new Numero(13));
        numeros.add(new Numero(17));

        // Aplica os filtros diretamente no objeto Numero
        Numero numeroFiltro = new Numero(0); // Número fictício apenas para encadear os filtros
        for (Numero numero : numeros) {
            numeroFiltro.adicionarNumero(numero);
        }

        // Encadeando filtros: primo e maior que 7
        double media = numeroFiltro
               .isPrimo()
               .isMaiorQueSete()
               .calcularMedia();       // Calcula a média

        // Exibindo o resultado
        System.out.println("Média dos primos maiores que 7: " + media);
    }
}
