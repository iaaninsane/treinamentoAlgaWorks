import estoque.Carro;
import estoque.Estocavel;
import estoque.GerenciadorEstoque;
import estoque.Roupa;

public class Main {
    public static void main(String[] args) {
        GerenciadorEstoque<Roupa> estoqueRoupas = new GerenciadorEstoque<>();
        //estoqueRoupas.adicionar(new Carro("BMW X1", 4));
        estoqueRoupas.adicionar(new Roupa("Camiseta básica branca", 20));
        estoqueRoupas.adicionar(new Roupa("Camiseta básica preta", 20));
        imprimirEstoque(estoqueRoupas);

        GerenciadorEstoque<Carro> estoqueCarros = new GerenciadorEstoque<>();
        estoqueCarros.adicionar(new Carro("BMW X1", 5));
        estoqueCarros.adicionar(new Carro("Honda HR-V", 5));
        imprimirEstoque(estoqueCarros);

        //GerenciadorEstoque<String> estoqueString = "";
    }

    private static void imprimirEstoque(GerenciadorEstoque<?> gerenciadorEstoque) {
        System.out.println("Estoque: " + gerenciadorEstoque.getQuantidadeTotal());
    }

    }
