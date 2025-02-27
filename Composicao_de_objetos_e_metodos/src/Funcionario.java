public class Funcionario {

    private String nome;
    private int quantidadeFilhos;

    public Funcionario(String nome, int quantidadeFilhos) {
        this.nome = nome;
        this.quantidadeFilhos=quantidadeFilhos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFilhos() {
        return quantidadeFilhos;
    }

    public void setQuantidadeFilhos(int quantidadeFilhos) {
        this.quantidadeFilhos = quantidadeFilhos;
    }
}
